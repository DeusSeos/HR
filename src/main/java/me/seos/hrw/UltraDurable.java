package me.seos.hrw;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class UltraDurable implements Listener {

    @EventHandler
    public void ultradurable(PlayerItemDamageEvent e){
        Player player = e.getPlayer();
        ItemStack item = e.getItem();
        int olddura = e.getDamage();
        short setdura = (short) (olddura-1);
        Integer rand = getRandomNumberInRange(0, 200);
        if (!item.getItemMeta().hasLore()) {
            return;
        }
        if(item.getItemMeta().getLore().contains(ChatColor.GREEN + "- Reinforced")){
            if(rand > 50) {
                //e.setDamage(setdura);
                e.setCancelled(true);
            }
            else {
                return;
            }
        }
    }
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
