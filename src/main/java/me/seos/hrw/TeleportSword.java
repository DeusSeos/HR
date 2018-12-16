package me.seos.hrw;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.UUID;

public class TeleportSword implements Listener {

    private Hrw plugin = Hrw.getPlugin(Hrw.class);

/*
    @EventHandler
    public void playerjoin(PlayerLoginEvent loginEvent) {
        Player player = loginEvent.getPlayer();
        UUID uuid = player.getUniqueId();
        int cdtime = plugin.getConfig().getInt(uuid + "Cooldown_Left");
        if (cdtime == 0) {
            return;
        } else {
            plugin.cdtime.put(uuid, cdtime);
        }
    }

    @EventHandler
    public void playerquit(PlayerQuitEvent quitEvent) {
        Player player = quitEvent.getPlayer();
        UUID uuid = player.getUniqueId();
        plugin.getConfig().set(uuid + "Cooldown left", plugin.cdtime.get(uuid));
        plugin.saveConfig();
        plugin.cdtime.remove(uuid);
    }


    @EventHandler
    @SuppressWarnings("deprecation")
    public void playerclick(PlayerInteractEvent clickEvent) {
        Action action = clickEvent.getAction();
        Player prightclick = clickEvent.getPlayer();
        float pitch = prightclick.getLocation().getPitch();
        float yaw = prightclick.getLocation().getYaw();
        Location lookloc = prightclick.getTargetBlock(null, 15).getLocation();
        double lookx = lookloc.getX();
        double looky = lookloc.getY();
        double lookz = lookloc.getZ();
        World world = prightclick.getWorld();
        String worldname = world.getName();
        Location teleloc = new Location(Bukkit.getWorld(worldname), lookx + 0, looky + 0, lookz + 0, yaw + 0, pitch + 0);
        UUID uuid = prightclick.getUniqueId();


        if (action.equals(Action.LEFT_CLICK_AIR) || action.equals(Action.LEFT_CLICK_BLOCK)) {
            return;
        }

        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (prightclick.getInventory().getItemInMainHand().getType() != Material.BOOK) {
                return;
            }
            if (prightclick.getInventory().getItemInMainHand().getType() == Material.BOOK && prightclick.getInventory().getBoots().getItemMeta().getLore().contains("Boots of the Great Traveler")) {
                if (plugin.cdtime.containsKey(uuid)) {
                    int secondsleft = ((plugin.cdtime.get(uuid)));
                    if (secondsleft > 0) {
                        prightclick.sendMessage(ChatColor.RED + "Teleport Cooldown: " + secondsleft);
                    }
                    clickEvent.setCancelled(true);
                } else {
                    if (!prightclick.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Teleport")) {
                        return;
                    }


                    if (prightclick.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Teleport")) {
                        plugin.cdtime.put(uuid, plugin.mastercd);
                        prightclick.sendMessage(ChatColor.GREEN + "Cooldown started.");
                        prightclick.teleport(teleloc);
                        prightclick.getWorld().playSound(prightclick.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1, 1);
                    }


                    if (prightclick.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Teleport")) {
                        plugin.cdtime.put(uuid, plugin.mastercd);
                        prightclick.sendMessage(ChatColor.GREEN + "Cooldown started.");
                        prightclick.teleport(teleloc);
                        prightclick.getWorld().playSound(prightclick.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1, 1);
                    }
                }
            }
        }
    }
    */

    @EventHandler
    public void playerjoin(PlayerLoginEvent loginEvent) {
        Player player = loginEvent.getPlayer();
        UUID uuid = player.getUniqueId();
        int cdtime = plugin.getConfig().getInt(uuid + ".Cooldown_Left");
        if (cdtime == 0) {
            return;
        } else {
            plugin.cdtime.put(uuid, cdtime);
        }
    }

    @EventHandler
    public void playerquit(PlayerQuitEvent quitEvent) {
        Player player = quitEvent.getPlayer();
        UUID uuid = player.getUniqueId();
        plugin.getConfig().set(uuid + "Cooldown_Left", plugin.cdtime.get(uuid));
        plugin.saveConfig();
        plugin.cdtime.remove(uuid);

    }


    @EventHandler
    @SuppressWarnings("deprecation")
    public void playerclick(PlayerInteractEvent clickEvent) {
        Action action = clickEvent.getAction();
        Player prightclick = clickEvent.getPlayer();
        float pitch = prightclick.getLocation().getPitch();
        float yaw = prightclick.getLocation().getYaw();
        Location lookloc = prightclick.getTargetBlock(null, 15).getLocation();
        double lookx = lookloc.getX();
        double looky = lookloc.getY();
        double lookz = lookloc.getZ();
        World world = prightclick.getWorld();
        String worldname = world.getName();
        Location teleloc = new Location(Bukkit.getWorld(worldname), lookx + 0, looky + 0, lookz + 0, yaw + 0, pitch + 0);
        UUID uuid = prightclick.getUniqueId();
        Location currentloc = prightclick.getLocation();


        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (prightclick.getInventory().getItemInMainHand().getType() != Material.BOOK) {
                return;
            }
            if (prightclick.getInventory().getItemInMainHand().getType() == Material.BOOK && prightclick.getInventory().getBoots().getItemMeta().getLore().contains("Boots of the Great Traveler")) {
                if (plugin.cdtime.containsKey(uuid)) {
                    int secondsleft = ((plugin.cdtime.get(uuid)));
                    if (secondsleft > 0) {
                        prightclick.sendMessage(ChatColor.RED + "Teleport Cooldown: " + secondsleft);
                    }
                    return;
                }
                else {
                    if (prightclick.getInventory().getItemInMainHand().getItemMeta().getLore().contains(ChatColor.GREEN + "Book One of the Traveler")) {
                        plugin.cdtime.put(uuid, plugin.mastercd);
                        prightclick.sendMessage(ChatColor.GREEN + "Cooldown started.");
                        prightclick.teleport(teleloc);
                        prightclick.getWorld().playSound(prightclick.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1, 1);
                        prightclick.spawnParticle(Particle.REDSTONE, teleloc, 10, .5, 1, 0.5, 1);
                        prightclick.spawnParticle(Particle.DRAGON_BREATH, currentloc, 10, .5, 1, 0.5, 1);

                    }
                    if (prightclick.getInventory().getItemInMainHand().getItemMeta().getLore().contains(ChatColor.GREEN + "- Admin Teleport")) {
                        prightclick.teleport(teleloc);
                        prightclick.getWorld().playSound(prightclick.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1, 1);
                        prightclick.spawnParticle(Particle.REDSTONE, teleloc, 10, .5, 1, 0.5, 1);
                        prightclick.spawnParticle(Particle.DRAGON_BREATH, currentloc, 10, .5, 1, 0.5, 1);

                    }
                }
            } else {
                return;
            }
        } else {
            return;
        }
    }
}