package me.seos.hrw;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GodKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("godkit")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (args.length < 1) ;

                Inventory inventory = player.getInventory();
                if (player.hasPermission("HRW.godkit")) {

                /*
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
                */
                /*

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
                */

                    ItemStack talpa = new ItemStack((Material.LEATHER_HELMET));
                    ItemMeta talpaMeta = talpa.getItemMeta();
                    ArrayList<String> talpalore = new ArrayList<>();
                    talpalore.add("Puzzling headgear imbued");
                    talpalore.add("with immortal lizard's skin");
                    talpalore.add("");
                    talpalore.add(ChatColor.GREEN + "- Godlike Regeneration");
                    talpalore.add(ChatColor.GREEN + "- Reinforced");
                    talpaMeta.setLore(talpalore);
                    talpaMeta.setDisplayName(ChatColor.RED + "Leather of Talpa");
                    talpa.setItemMeta(talpaMeta);
                    talpa.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                    talpa.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
                    talpa.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
                    talpa.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                    inventory.addItem(talpa);


                    ItemStack sleip = new ItemStack((Material.DIAMOND_BOOTS));
                    ItemMeta sleipMeta = sleip.getItemMeta();
                    ArrayList<String> sleiplore = new ArrayList<>();
                    sleiplore.add("Infused with Witch Essence");
                    sleiplore.add("Named after Odins trusty steed");
                    sleiplore.add(ChatColor.GREEN + "- Increases Max Health by 10%");
                    sleiplore.add(ChatColor.GREEN + "- Increases Speed by 40%");
                    sleipMeta.setLore(sleiplore);
                    sleipMeta.setDisplayName(ChatColor.RED + "Sleipnir");
                    sleip.setItemMeta(sleipMeta);
                    sleip.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
                    sleip.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 8);
                    sleip.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                    inventory.addItem(sleip);


                    ItemStack bani = new ItemStack(Material.DIAMOND_LEGGINGS);
                    ItemMeta baniMeta = bani.getItemMeta();
                    ArrayList<String> banilore = new ArrayList<>();
                    banilore.add("Mysterious leggins that automatically");
                    banilore.add("adjusts its size to the wearer's size");
                    banilore.add(ChatColor.GREEN + "- Increases Max Health by 20%");
                    banilore.add(ChatColor.GREEN + "- Increases Jump Height by 100%");
                    String godchestname = new String(ChatColor.RED + "Bani-shin reginsu");
                    baniMeta.setLore(banilore);
                    baniMeta.setDisplayName(godchestname);
                    bani.setItemMeta(baniMeta);
                    bani.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
                    bani.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6);
                    bani.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                    inventory.addItem(bani);

                    ItemStack assault = new ItemStack(Material.DIAMOND_CHESTPLATE);
                    ItemMeta assaultMeta = assault.getItemMeta();
                    ArrayList<String> assaultlore = new ArrayList<>();
                    assaultlore.add("An extremely heavy piece of armor");
                    assaultlore.add("worn by warlords of Minewind");
                    assaultlore.add(ChatColor.GREEN + "- Increases Max Health by 40%");
                    String assaultname = new String(ChatColor.RED + "Assault Curiass");
                    assaultMeta.setLore(assaultlore);
                    assaultMeta.setDisplayName(assaultname);
                    assault.setItemMeta(assaultMeta);
                    assault.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
                    assault.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 6);
                    assault.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                    inventory.addItem(assault);

                    ItemStack abyssal = new ItemStack(Material.DIAMOND_HELMET);
                    ItemMeta abyssalMeta = abyssal.getItemMeta();
                    ArrayList<String> abyssallore = new ArrayList<>();
                    abyssallore.add("Thim Calb's very first creation.");
                    abyssallore.add("His most prized and precious armor");
                    abyssallore.add(ChatColor.RESET + "");
                    abyssallore.add(ChatColor.GREEN + "- Increases Max Health by 30%");
                    abyssallore.add(ChatColor.GREEN + "- Unlimited Underwater Breathing");
                    String godbootsname = new String(ChatColor.RED + "Abyssal Helm");
                    abyssalMeta.setLore(abyssallore);
                    abyssalMeta.setDisplayName(godbootsname);
                    abyssal.setItemMeta(abyssalMeta);
                    abyssal.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
                    abyssal.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                    abyssal.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6);
                    abyssal.addEnchantment(Enchantment.WATER_WORKER, 1);
                    abyssal.addEnchantment(Enchantment.OXYGEN, 1);
                    inventory.addItem(abyssal);

                    ItemStack bryn = new ItemStack(Material.DIAMOND_CHESTPLATE);
                    ItemMeta brynmeta = bryn.getItemMeta();
                    ArrayList<String> brynlore = new ArrayList<>();
                    brynlore.add("An armor which is made of");
                    brynlore.add("a metal unknown in the human world");
                    brynlore.add(ChatColor.GREEN + "- Increases Strength");
                    String brynname = new String(ChatColor.RED + "Brynhild");
                    brynmeta.setLore(brynlore);
                    brynmeta.setDisplayName(brynname);
                    bryn.setItemMeta(brynmeta);
                    bryn.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                    bryn.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
                    bryn.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
                    bryn.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
                    bryn.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                    inventory.addItem(bryn);

                    ItemStack ich = new ItemStack(Material.BOW);
                    ItemMeta ichMeta = ich.getItemMeta();
                    ArrayList<String> ichLore = new ArrayList<>();
                    ichLore.add("A bow possesed by Odin");
                    ichLore.add("");
                    ichLore.add(ChatColor.GRAY + "Kill Count: 0");
                    String NepName = new String(ChatColor.RED + "Ichival");
                    ichMeta.setDisplayName(NepName);
                    ichMeta.setLore(ichLore);
                    ich.setItemMeta(ichMeta);
                    ich.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                    ich.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 10);
                    ich.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 6);
                    ich.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
                    ich.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 6);
                    inventory.addItem(ich);

                    ItemStack infirm = new ItemStack(Material.BOW);
                    ItemMeta infirmMeta = infirm.getItemMeta();
                    ArrayList<String> infirmLore = new ArrayList<>();
                    infirmLore.add("A bow imbued with the");
                    infirmLore.add("sacred essence of death");
                    infirmLore.add(ChatColor.GREEN + "- Cripples The Enemy");
                    infirmLore.add("");
                    infirmLore.add(ChatColor.GRAY + "Kill Count: 0");
                    String infirmName = new String(ChatColor.RED + "Infirmity");
                    infirmMeta.setDisplayName(infirmName);
                    infirmMeta.setLore(infirmLore);
                    infirm.setItemMeta(infirmMeta);
                    infirm.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
                    infirm.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 10);
                    infirm.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                    infirm.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 5);
                    inventory.addItem(infirm);

                    ItemStack dyrn = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta dyrnMeta = dyrn.getItemMeta();
                    ArrayList<String> dyrnlore = new ArrayList<>();
                    dyrnlore.add("When drawn");
                    dyrnlore.add("it blazed with fire");
                    dyrnlore.add("");
                    dyrnlore.add(ChatColor.GRAY + "Kill Count: 0");
                    dyrnMeta.setLore(dyrnlore);
                    String setriusname = new String(ChatColor.RED + "Dyrnwyn");
                    dyrnMeta.setDisplayName(setriusname);
                    dyrn.setItemMeta(dyrnMeta);
                    dyrn.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 24);
                    dyrn.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 8);
                    dyrn.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
                    dyrn.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
                    inventory.addItem(dyrn);

                    ItemStack myst = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta mystMeta = myst.getItemMeta();
                    ArrayList<String> mystlore = new ArrayList<>();
                    mystlore.add("One-handed sword similar to the ");
                    mystlore.add("legendary twig which was rumored");
                    mystlore.add("to have murdered Baldur");
                    mystlore.add("the God of Light");
                    mystlore.add(ChatColor.GREEN + "- Curses The Enemy");
                    mystlore.add("");
                    mystlore.add(ChatColor.GRAY + "Kill Count: 0");
                    mystMeta.setLore(mystlore);
                    String mystname = new String(ChatColor.RED + "Mystelainn");
                    mystMeta.setDisplayName(mystname);
                    myst.setItemMeta(mystMeta);
                    myst.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 14);
                    myst.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 8);
                    myst.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 7);
                    myst.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 4);
                    myst.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
                    inventory.addItem(myst);

                    ItemStack scythe = new ItemStack(((Material.DIAMOND_HOE)));
                    ItemMeta scytheLoreMeta = scythe.getItemMeta();
                    ArrayList<String> scythelore = new ArrayList<>();
                    scythelore.add("The Harvester of Souls");
                    scythelore.add(ChatColor.GREEN + "- Poisons The Enemy");
                    scythelore.add(ChatColor.GREEN + "- Spreads Nausea");
                    scythelore.add(ChatColor.GREEN + "- Blinds The Enemy");
                    scythelore.add("");
                    scythelore.add("Kill Count: 0");
                    String sycthename = new String(ChatColor.RED + "Death Scythe");
                    scytheLoreMeta.setLore(scythelore);
                    scytheLoreMeta.setDisplayName(sycthename);
                    scythe.setItemMeta(scytheLoreMeta);
                    scythe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
                    scythe.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 10);
                    scythe.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 10);
                    scythe.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                    inventory.addItem(scythe);


                    player.sendMessage(ChatColor.YELLOW + "God Items Sent.");

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