package me.seos.hrw;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class EventKit implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("eventkit")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                Inventory inventory = player.getInventory();
                if (!player.hasPermission("HRW.eventkit")) {
                    sender.sendMessage(ChatColor.RED + "You do not have access to this command.");
                }


                if (args.length < 1) {

                    if (player.hasPermission("HRW.eventkit")) {


                        ItemStack easterboots = new ItemStack((Material.IRON_BOOTS));
                        ItemMeta easterbootsLoreMeta = easterboots.getItemMeta();
                        ArrayList<String> easterbootslore = new ArrayList<>();
                        easterbootslore.add(ChatColor.RESET + "");
                        easterbootslore.add(ChatColor.GREEN + "- Increases Max Health by 30%");
                        easterbootslore.add(ChatColor.GREEN + "- Increases Speed by 40%");
                        easterbootslore.add(ChatColor.RESET + "");
                        easterbootslore.add(ChatColor.GREEN + "Easter 2018");
                        easterbootsLoreMeta.setLore(easterbootslore);
                        easterboots.setItemMeta(easterbootsLoreMeta);
                        ItemMeta easterbootsname = easterboots.getItemMeta();
                        easterbootsname.setDisplayName(ChatColor.GREEN + "Easter's Boots");
                        easterboots.setItemMeta(easterbootsname);
                        easterboots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
                        easterboots.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 6);
                        easterboots.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                        inventory.addItem(easterboots);

                        ItemStack easterlegs = new ItemStack((Material.IRON_LEGGINGS));
                        ItemMeta easterlegsLoreMeta = easterlegs.getItemMeta();
                        ArrayList<String> easterlegslore = new ArrayList<>();
                        easterlegslore.add(ChatColor.RESET + "");
                        easterlegslore.add(ChatColor.GREEN + "- Increases Max Health by 30%");
                        easterlegslore.add(ChatColor.GREEN + "- Increases Jump Height by 200%");
                        easterlegslore.add(ChatColor.RESET + "");
                        easterlegslore.add(ChatColor.GREEN + "Easter 2018");
                        easterlegsLoreMeta.setLore(easterlegslore);
                        easterlegs.setItemMeta(easterlegsLoreMeta);
                        ItemMeta easterlegsname = easterlegs.getItemMeta();
                        easterlegsname.setDisplayName(ChatColor.GREEN + "Easter's Leggings");
                        easterlegs.setItemMeta(easterlegsname);
                        easterlegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
                        easterlegs.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6);
                        easterlegs.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                        inventory.addItem(easterlegs);

                        ItemStack easterchest = new ItemStack((Material.IRON_CHESTPLATE));
                        ItemMeta easterchestLoreMeta = easterchest.getItemMeta();
                        ArrayList<String> easterchestlore = new ArrayList<>();
                        easterchestlore.add(ChatColor.RESET + "");
                        easterchestlore.add(ChatColor.GREEN + "- Increases Max Health by 30%");
                        easterchestlore.add(ChatColor.GREEN + "- Increases Attack Speed by 20%");
                        easterchestlore.add(ChatColor.RESET + "");
                        easterchestlore.add(ChatColor.GREEN + "Easter 2018");
                        easterchestLoreMeta.setLore(easterchestlore);
                        easterchest.setItemMeta(easterchestLoreMeta);
                        ItemMeta easterchestname = easterchest.getItemMeta();
                        easterchestname.setDisplayName(ChatColor.GREEN + "Easter's Chestplate");
                        easterchest.setItemMeta(easterchestname);
                        easterchest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
                        easterchest.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6);
                        easterchest.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                        inventory.addItem(easterchest);


                        player.sendMessage(ChatColor.YELLOW + "EventKit Sent.");
                    }
                    return true;

                } else if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("book")) {

                        ItemStack AdminBook = new ItemStack((Material.BOOK));
                        ItemMeta AdminBookMeta = AdminBook.getItemMeta();
                        ArrayList<String> AdminBookLore = new ArrayList<>();
                        AdminBookMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        AdminBookLore.add(ChatColor.GREEN + "- Admin Teleport");
                        AdminBookMeta.setLore(AdminBookLore);
                        String AdminBookName = new String(ChatColor.GOLD.toString() + ChatColor.BOLD.toString() + "Tome of Secrets");
                        AdminBookMeta.setDisplayName(AdminBookName);
                        AdminBook.setItemMeta(AdminBookMeta);
                        AdminBook.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
                        AdminBook.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 4);
                        AdminBook.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 7);
                        inventory.addItem(AdminBook);

                        player.sendMessage("Book Sent");
                    }

                    if (args[0].equalsIgnoreCase("book")) {

                        ItemStack AdminBook = new ItemStack((Material.BOOK));
                        ItemMeta AdminBookMeta = AdminBook.getItemMeta();
                        ArrayList<String> AdminBookLore = new ArrayList<>();
                        AdminBookMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        AdminBookLore.add(ChatColor.GREEN + "- Admin Teleport");
                        AdminBookMeta.setLore(AdminBookLore);
                        String AdminBookName = new String(ChatColor.GOLD.toString() + ChatColor.BOLD.toString() + "Tome of Secrets");
                        AdminBookMeta.setDisplayName(AdminBookName);
                        AdminBook.setItemMeta(AdminBookMeta);
                        AdminBook.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
                        AdminBook.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 4);
                        AdminBook.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 7);
                        inventory.addItem(AdminBook);

                        player.sendMessage("Book Sent");


                    } else {
                        player.sendMessage(ChatColor.RED + "Incorrect Argument.");
                    }

                } else {
                    sender.sendMessage(ChatColor.RED + "You do not have access to this command.");
                }
            }
            return true;
        }
        return true;
    }
}