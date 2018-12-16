package me.seos.hrw;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class HealEffect implements Listener {

    @EventHandler
    public void cast(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        PlayerInventory inventory = player.getInventory();
        Action action = e.getAction();
        if (!action.equals(Action.RIGHT_CLICK_AIR) || !action.equals(Action.RIGHT_CLICK_BLOCK)) {
            ItemStack item = inventory.getItemInMainHand();
            if (!item.hasItemMeta() || item == null) {
                return;
            } else if (item.getItemMeta().getLore().contains("Scroll of Speed")) {
                player.sendMessage(ChatColor.GOLD + "Casted Speed Spell");
                Location loc = player.getLocation();
                for (Entity entity : player.getNearbyEntities(10, 10, 10)) {
                    if (entity instanceof LivingEntity) {
                        LivingEntity live = (LivingEntity) entity;
                        live.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000, 1, false, true));
                    }
                    if (entity instanceof Player) {
                        Player found = (Player) e;
                        found.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000, 1, false, true));
                    } else {
                        return;
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
