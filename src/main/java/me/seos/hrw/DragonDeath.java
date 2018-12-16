package me.seos.hrw;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class DragonDeath implements Listener {
    @EventHandler
    public void DragonDies(EntityDeathEvent e) {

        double X = 0;
        double Y = 66;
        double Z = 0;

        if (e.getEntity() instanceof EnderDragon) {

            LivingEntity Dragon = e.getEntity();
            Player Player = Dragon.getKiller();
            World world = e.getEntity().getWorld();
            Location dropLocation = e.getEntity().getLocation();
            ItemStack essence = new ItemStack(Material.PRISMARINE_CRYSTALS, 1);
            ItemMeta essenceMeta = essence.getItemMeta();
            ArrayList<String> essencelore = new ArrayList<>();
            essenceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            String essencename = new String(ChatColor.DARK_PURPLE + "Essence");
            essenceMeta.setDisplayName(essencename);
            essenceMeta.setLore(essencelore);
            essence.setItemMeta(essenceMeta);
            essence.addUnsafeEnchantment(Enchantment.LUCK, 1);

            ItemStack shard = new ItemStack(Material.PRISMARINE_SHARD, 1);
            ItemMeta shardLoreMeta = shard.getItemMeta();
            ArrayList<String> shardlore = new ArrayList<>();
            shardlore.add("Refined essence");
            shardLoreMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            String shardname = new String(ChatColor.DARK_PURPLE + "Shard");
            shardLoreMeta.setDisplayName(shardname);
            shardLoreMeta.setLore(shardlore);
            shard.setItemMeta(shardLoreMeta);
            shard.addUnsafeEnchantment(Enchantment.LUCK, 1);


            double Chance = Math.random() * 100;

            if (Chance < 50) {
                world.dropItemNaturally(dropLocation, essence);
            } else if (Chance < 70) {
                Player.setLevel(Player.getLevel() + 10);
                world.dropItemNaturally(dropLocation, essence);
            } else if (Chance < 90) {
                world.dropItemNaturally(dropLocation, essence);
                world.dropItemNaturally(dropLocation, shard);
            } else if (Chance <= 100) {
                world.dropItemNaturally(dropLocation, essence);
                world.dropItemNaturally(dropLocation, shard);
                world.dropItemNaturally(dropLocation, shard);
            }
        }
    }
}
