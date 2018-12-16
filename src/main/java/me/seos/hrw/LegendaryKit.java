package me.seos.hrw;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class LegendaryKit implements CommandExecutor{
        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (command.getName().equalsIgnoreCase("legendarykit")) {
                if (sender instanceof Player) {
                    Player player = (Player) sender;
                    if (args.length < 1) ;

                    Inventory inventory = player.getInventory();
                    if (player.hasPermission("HRW.legendarykit")) {

                        ItemStack pum = new ItemStack(Material.BOW);
                        ItemMeta PumMeta = pum.getItemMeta();
                        PumMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        ArrayList<String> PumLore = new ArrayList<>();
                        PumLore.add("A conjured bow said to create");
                        PumLore.add("a rift between dimensions");
                        PumLore.add(ChatColor.GREEN+ "- Shoots Spectres");
                        String PumName = new String(ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Nepentheses");
                        PumMeta.setDisplayName(PumName);
                        PumMeta.setLore(PumLore);
                        pum.setItemMeta(PumMeta);
                        pum.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                        inventory.addItem(pum);

                        ItemStack indra = new ItemStack(Material.BOW);
                        ItemMeta indraMeta = indra.getItemMeta();
                        indraMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        ArrayList<String> indraLore = new ArrayList<>();
                        indraLore.add(ChatColor.GRAY+ "Power XIX");
                        indraLore.add("A poet is someone who stands outside in");
                        indraLore.add("the rain hoping to be struck by lightning.");
                        String indraName = new String(ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Indra");
                        indraMeta.setDisplayName(indraName);
                        indraMeta.setLore(indraLore);
                        indra.setItemMeta(indraMeta);
                        indra.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 19);
                        inventory.addItem(indra);

                        ItemStack obbydest = new ItemStack(Material.DIAMOND_PICKAXE);
                        ItemMeta obbydestMeta = obbydest.getItemMeta();
                        obbydestMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        ArrayList<String> obbydestLore = new ArrayList<>();
                        obbydestLore.add("One pickaxe to dig them all");
                        obbydestLore.add(ChatColor.GREEN + "- Instant Mining");
                        String obbydestName = new String(ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Obsidian Destroyer");
                        obbydestMeta.setDisplayName(obbydestName);
                        obbydestMeta.setLore(obbydestLore);
                        obbydest.setItemMeta(obbydestMeta);
                        obbydest.addUnsafeEnchantment(Enchantment.DIG_SPEED, 35);
                        inventory.addItem(obbydest);

                        ItemStack zord = new ItemStack(Material.IRON_SWORD);
                        ItemMeta zordMeta = zord.getItemMeta();
                        zordMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        ArrayList<String> zordLore = new ArrayList<>();
                        zordLore.add(ChatColor.GRAY+ "Sharpness XXIII");
                        zordLore.add(ChatColor.GRAY+ "Knockback IV");
                        zordLore.add(ChatColor.GRAY+ "Unbreaking IV");
                        zordLore.add("The previous wielder of this");
                        zordLore.add("sword suffocated in a wall. ");
                        String zordName = new String(ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Zord");
                        zordMeta.setDisplayName(zordName);
                        zordMeta.setLore(zordLore);
                        zord.setItemMeta(zordMeta);
                        zord.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 23);
                        zord.addUnsafeEnchantment(Enchantment.KNOCKBACK, 4);
                        zord.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
                        inventory.addItem(zord);


                        ItemStack zbook = new ItemStack(Material.BOOK);
                        ItemMeta zbookMeta = zbook.getItemMeta();
                        zbookMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        ArrayList<String> zbookLore = new ArrayList<>();
                        zbookLore.add("This book keeps blinking!");
                        String zbookName = new String(ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Zord Book");
                        zbookMeta.setDisplayName(zbookName);
                        zbookMeta.setLore(zbookLore);
                        zbook.setItemMeta(zbookMeta);
                        zbook.addUnsafeEnchantment(Enchantment.LURE, 1);
                        inventory.addItem(zbook);



                        player.sendMessage(ChatColor.YELLOW + "Legendary Items Sent.");

                        return true;
                    } else if (args.length == 1) {

                    } else {
                        sender.sendMessage(ChatColor.RED + "You do not have access to this command.");
                    }
                }
                return true;
            }
            return true;
        }
}
