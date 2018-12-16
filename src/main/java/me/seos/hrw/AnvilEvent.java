package me.seos.hrw;

import org.bukkit.*;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;


public class AnvilEvent implements Listener {

    private Hrw plugin = Hrw.getPlugin(Hrw.class);

    @EventHandler
    public void onAnvil(InventoryOpenEvent event) {
        Player player = (Player) event.getPlayer();
        Integer lvl = player.getLevel();
        if (event.getInventory().getType() == InventoryType.ANVIL) {
            Location anvilLoc = event.getInventory().getLocation();
            World world = anvilLoc.getWorld();
            String worldname = world.getName();
            Location godanvil = new Location(Bukkit.getWorld(worldname), 0, 135, 0);
            if (anvilLoc.equals(godanvil) && lvl < 30) {
                player.sendMessage(ChatColor.RED + "You must be level 30 or higher.");
                event.setCancelled(true);
            } else {
                return;
            }
        } else {
            return;
        }
    }


    @EventHandler
    public void playerjoin(PlayerLoginEvent loginEvent) {
        Player player = loginEvent.getPlayer();
        UUID uuid = player.getUniqueId();
        int cdtime = plugin.getConfig().getInt(uuid + ".Anvil_Cooldown_Left");
        if (cdtime == 0) {
            return;
        } else {
            plugin.anvilcdtime.put(uuid, cdtime);
        }
    }

    @EventHandler
    public void playerquit(PlayerQuitEvent quitEvent) {
        Player player = quitEvent.getPlayer();
        UUID uuid = player.getUniqueId();
        plugin.getConfig().set(uuid + "Anvil_Cooldown_left", plugin.anvilcdtime.get(uuid));
        plugin.saveConfig();
    }

    @EventHandler
    @SuppressWarnings("deprecation")
    public void anvilenchantEvent(InventoryClickEvent e) {
        HumanEntity ent = e.getWhoClicked();
        Player player = (Player) ent;
        Inventory inv = e.getInventory();
        UUID uuid = player.getUniqueId();


        if (!e.isCancelled()) {
            if (ent instanceof Player) {
                if (inv instanceof AnvilInventory) {
                    ItemStack item = e.getCurrentItem();
                    ItemStack item1 = inv.getItem(0);
                    ItemStack item2 = inv.getItem(1);

                    if (e.getSlot() == 2) {
                        if (item != null) {
                            ItemMeta meta = item.getItemMeta();
                            if (meta != null) {
                                if (meta.hasLore()) {
                                    if (item2 != null) {
                                        ItemMeta meta2 = item2.getItemMeta();
                                        if (meta2.hasLore() || meta2.hasEnchants()) {
                                            player.sendMessage(ChatColor.RED + "You cannot combine these.");
                                            e.setCancelled(true);
                                        } else if (item2.getType() == Material.ENCHANTED_BOOK) {
                                            player.sendMessage(ChatColor.RED + "You cannot combine these.");
                                            inv.setItem(0, item1);
                                            inv.setItem(1, item2);
                                            e.setCurrentItem(null);

                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }

                        ItemMeta meta1 = item1.getItemMeta();
                        if (item.getDurability() != item1.getDurability()) {
                            if (meta1.hasLore()) {
                                if (plugin.anvilcdtime.containsKey(uuid)) {
                                    inv.setItem(0, item1);
                                    inv.setItem(1, item2);
                                    e.setCurrentItem(null);
                                    int secondsleft = plugin.anvilcdtime.get(uuid);
                                    if (secondsleft > 0) {
                                        if (secondsleft > 60) {
                                            long minutesleft = secondsleft / 60;
                                            player.sendMessage(ChatColor.RED + "Anvil Cooldown: " + minutesleft + " minutes");
                                        } else {
                                            player.sendMessage(ChatColor.RED + "Anvil Cooldown: " + secondsleft + " seconds");
                                        }
                                        return;
                                    }
                                } else {
                                    plugin.anvilcdtime.put(uuid, plugin.anvilcd);
                                    player.sendMessage(ChatColor.GREEN + "Cooldown started.");
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }
}
