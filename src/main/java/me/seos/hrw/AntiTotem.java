package me.seos.hrw;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.ArrayList;
import java.util.List;

public class AntiTotem implements Listener {

    @EventHandler
    public void Totem (EntityResurrectEvent event) {
        Entity entity = event.getEntity();
        Entity killer = ((LivingEntity) entity).getKiller();
        if(entity instanceof LivingEntity){
            if (killer instanceof Player){
                PlayerInventory pinv = ((Player) killer).getInventory();
                ItemStack mainhand = pinv.getItemInMainHand();
                if (!mainhand.hasItemMeta()){
                    return;
                } else {
                    if (mainhand.getItemMeta().getLore().contains("AntiTotem")){
                        event.setCancelled(true);
                    }
                    else {
                        return;
                    }
                }
            }
            if (killer instanceof LivingEntity){
                EntityEquipment einv = ((Player) killer).getEquipment();
                ItemStack mainhand = einv.getItemInMainHand();
                if (!mainhand.hasItemMeta()){
                    return;
                } else {
                    if (mainhand.getItemMeta().getLore().contains("AntiTotem")){
                        event.setCancelled(true);
                    }
                    else {
                        return;
                    }
                }
            }
            else {
                return;
            }
        }
        if(entity instanceof Player) {
            if (killer instanceof Player){
                PlayerInventory pinv = ((Player) killer).getInventory();
                ItemStack mainhand = pinv.getItemInMainHand();
                if (!mainhand.hasItemMeta()){
                    return;
                } else {
                    if (mainhand.getItemMeta().getLore().contains("AntiTotem")){
                        event.setCancelled(true);
                    }
                    else {
                        return;
                    }
                }
            }
            if (killer instanceof LivingEntity){
                EntityEquipment einv = ((Player) killer).getEquipment();
                ItemStack mainhand = einv.getItemInMainHand();
                if (!mainhand.hasItemMeta()){
                    return;
                } else {
                    if (mainhand.getItemMeta().getLore().contains("AntiTotem")){
                        event.setCancelled(true);
                    }
                    else {
                        return;
                    }
                }
            }
            else {
                return;
            }
        }
        else {
            return;
        }
    }
}
