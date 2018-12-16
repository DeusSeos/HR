package me.seos.hrw;
import com.codingforcookies.armorequip.ArmorEquipEvent;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LoreArmorEquip implements Listener {
    private int newHealth;
    private int defaultHealth = 20;

    @EventHandler(priority= EventPriority.HIGHEST)
    public void resetHealth(PlayerDeathEvent event) {
        Player dead = event.getEntity();
        dead.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(defaultHealth);
    }

    @EventHandler(priority= EventPriority.HIGHEST)
    public void resetHealth(PlayerGameModeChangeEvent event) {
        Player dead = event.getPlayer();
        dead.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(defaultHealth);
    }

    @EventHandler(priority= EventPriority.HIGHEST)
    public void armorWorn(ArmorEquipEvent event) {
        Player player = event.getPlayer();
        newHealth = 20; //(int) player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
        ItemStack newArmor = event.getNewArmorPiece();
        ItemStack oldArmor = event.getOldArmorPiece();
        checkArmorChange(player, newArmor, oldArmor);
        player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(newHealth);
    }

    private void checkArmorChange(Player player, ItemStack newArmor, ItemStack oldArmor) {
        checkArmorPiece(player, oldArmor, false);

        ItemStack[] allArmor = {player.getInventory().getHelmet(), player.getInventory().getChestplate(), player.getInventory().getLeggings(), player.getInventory().getBoots()};

        List<String> oldLore = new ArrayList<>();
        if ((oldArmor != null) && (oldArmor.getType() != Material.AIR)) {
            oldLore = oldArmor.getItemMeta().getLore();
        }
        for (ItemStack armorPiece : allArmor) {
            if ((armorPiece != null) && (armorPiece.getType() != Material.AIR) && (!armorPiece.getItemMeta().getLore().equals(oldLore))) {
                checkArmorPiece(player, armorPiece, true);
            }
        }
        checkArmorPiece(player, newArmor, true);
    }

    private void checkArmorPiece(Player player, ItemStack armor, boolean add) {

        if ((armor != null) && (armor.getType() != Material.AIR) && (armor.hasItemMeta())) {

            if (armor.getItemMeta().getLore().contains("Fix")) {
                player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(defaultHealth);
            }

            for (String lore : armor.getItemMeta().getLore()) {
                PotionEffectType effect = PotionEffectType.UNLUCK;
                int power = 0;

                lore = ChatColor.stripColor(lore).toLowerCase();
                if (lore.startsWith("-")) {
                    if (lore.contains("max health")) {
                        int changeInHealth = Integer.parseInt(lore.replaceAll("\\D+", "")) / 5;
                        if (add) {
                            if (lore.contains("decreases")) {
                                newHealth -= changeInHealth;
                            } else if (lore.contains("increases")) {
                                newHealth += changeInHealth;
                            }
                        }
                    } else {
                        if (lore.contains("regeneration")) {
                            effect = PotionEffectType.REGENERATION;
                            if (lore.contains("slightly")) {
                                power = 0;
                            } else if (lore.contains("godlike")) {
                                power = 1;
                            }
                        } else if (lore.contains("damage")) {
                            effect = PotionEffectType.DAMAGE_RESISTANCE;
                            if (lore.contains("20%")) {
                                power = 0;
                            } else if (lore.contains("40%")) {
                                power = 1;
                            }
                        } else if (lore.contains("jump")) {
                            effect = PotionEffectType.JUMP;
                            if (lore.contains("100%")) {
                                power = 1;
                            } else if (lore.contains("200%")) {
                                power = 2;
                            }
                        } else if (lore.contains("strength")) {
                            effect = PotionEffectType.INCREASE_DAMAGE;
                            if (lore.contains("slightly")) {
                                power = 0;
                            } else {
                                power = 1;
                            }
                        } else if (lore.contains("attack speed")) {
                            effect = PotionEffectType.FAST_DIGGING;
                            if (lore.contains("10%")) {
                                power = 0;
                            } else if (lore.contains("20%")) {
                                power = 1;
                            }
                        } else if (lore.contains("speed")) {
                            effect = PotionEffectType.SPEED;
                            if (lore.contains("20%")) {
                                power = 0;
                            } else if (lore.contains("40%")) {
                                power = 1;
                            } else if (lore.contains("60%")) {
                                power = 2;
                            } else if (lore.contains("80%")) {
                                power = 3;
                            }
                        }
                    }
                    if (!effect.equals(PotionEffectType.UNLUCK)) {
                        if (add) {
                            player.removePotionEffect(effect);
                            player.addPotionEffect(new PotionEffect(effect, 100000, power, false, false));
                        } else {
                            player.removePotionEffect(effect);
                        }
                    }
                }
            }
        }
    }
}