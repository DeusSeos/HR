package me.seos.hrw;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SwordEffects implements Listener {
    @EventHandler
    public void weaponattack(EntityDamageByEntityEvent event) {
        Entity damaged = event.getEntity();
        Entity damager = event.getDamager();
        if (damager instanceof Arrow) {
            return;
        }
        if (damager instanceof LivingEntity) {
            LivingEntity entity = (LivingEntity) damager;
            EntityEquipment ee = entity.getEquipment();
            ItemStack mainHand = ee.getItemInMainHand();
            if (!mainHand.hasItemMeta()) {
                return;
            }
            if (mainHand.hasItemMeta()) {
                if (damaged instanceof Player) {
                    Player pd = (Player) damaged;
                    if (!mainHand.getItemMeta().hasLore()){
                        return;
                    }
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Saps Strength")) {
                        pd.removePotionEffect(PotionEffectType.WEAKNESS);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1, false, true));
                    }
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.DARK_RED + "- Marked For Death")) {
                        pd.removePotionEffect(PotionEffectType.WEAKNESS);
                        entity.removePotionEffect(PotionEffectType.GLOWING);
                        entity.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, false, true));
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1, false, true));
                    }
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Poisons The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.POISON);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 4, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Blinds The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.BLINDNESS);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 0, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Spreads Nausea")) {
                        pd.removePotionEffect(PotionEffectType.CONFUSION);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Curses The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.WITHER);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 120, 2, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Starves The Enemy")) {
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 10, 2, false, true));
                    } else {
                        return;
                    }
                }
                if (damaged instanceof LivingEntity) {
                    LivingEntity pd = (LivingEntity) damaged;
                    if (!mainHand.getItemMeta().hasLore()){
                        return;
                    }
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Saps Strength")) {
                        pd.removePotionEffect(PotionEffectType.WEAKNESS);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1, false, true));
                    }
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.DARK_RED + "- Marked For Death")) {
                        pd.removePotionEffect(PotionEffectType.WEAKNESS);
                        entity.removePotionEffect(PotionEffectType.GLOWING);
                        entity.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, false, true));
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1, false, true));
                    }
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Poisons The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.POISON);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 4, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Blinds The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.BLINDNESS);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 0, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Spreads Nausea")) {
                        pd.removePotionEffect(PotionEffectType.CONFUSION);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Curses The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.WITHER);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 120, 3, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Starves The Enemy")) {
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 10, 2, false, true));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }else{
                return;
            }
        }

        if (damager instanceof Player) {
            Player player = (Player) damager;
            PlayerInventory playerInventory = player.getInventory();
            ItemStack mainHand = playerInventory.getItemInMainHand();
            if (!mainHand.hasItemMeta()) {
                return;
            }

            if (mainHand.hasItemMeta()) {
                if (damaged instanceof Player) {
                    Player pd = (Player) damaged;
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Saps Strength")) {
                        pd.removePotionEffect(PotionEffectType.WEAKNESS);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1, false, true));
                    }
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.DARK_RED + "- Marked For Death")) {
                        pd.removePotionEffect(PotionEffectType.WEAKNESS);
                        player.removePotionEffect(PotionEffectType.GLOWING);
                        player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 100 ,10, false , true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 1, false, true));
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1, false, true));
                    }
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Poisons The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.POISON);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 4, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Blinds The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.BLINDNESS);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 0, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Spreads Nausea")) {
                        pd.removePotionEffect(PotionEffectType.CONFUSION);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Curses The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.WITHER);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 120, 2, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Starves The Enemy")) {
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 10, 2, false, true));
                    } else {
                        return;
                    }
                }
                if (damaged instanceof LivingEntity) {
                    LivingEntity pd = (LivingEntity) damaged;
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Saps Strength")) {
                        pd.removePotionEffect(PotionEffectType.WEAKNESS);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1, false, true));
                    }
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.DARK_RED + "- Marked For Death")) {
                        pd.removePotionEffect(PotionEffectType.WEAKNESS);
                        player.removePotionEffect(PotionEffectType.GLOWING);
                        player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, false, true));
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1, false, true));
                    }
                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Poisons The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.POISON);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 3, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Blinds The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.BLINDNESS);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 0, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Spreads Nausea")) {
                        pd.removePotionEffect(PotionEffectType.CONFUSION);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Curses The Enemy")) {
                        pd.removePotionEffect(PotionEffectType.WITHER);
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 120, 2, false, true));
                    }

                    if (mainHand.getItemMeta().getLore().contains(ChatColor.GREEN + "- Starves The Enemy")) {
                        pd.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 10, 2, false, true));
                    } else {
                        return;
                    }
                } else {
                    return;
                }

            } else {
                return;
            }
        }else{
            return;
        }
    }
}