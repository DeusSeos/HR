package me.seos.hrw;

import org.bukkit.command.CommandExecutor;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.ArrayList;

public class baconkit implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("baconskit")){
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (args.length < 1) ;


                Inventory inventory = player.getInventory();


                ItemStack Inthium = new ItemStack(Material.CHAINMAIL_HELMET);
                ItemMeta InthiumLoreMeta = Inthium.getItemMeta();
                ArrayList<String> Inthiumlore = new ArrayList<>();
                Inthiumlore.add("Protects from beheading");
                Inthiumlore.add(ChatColor.RESET + "");
                Inthiumlore.add(ChatColor.GREEN + "- Decreases incoming damage by 20%");
                Inthiumlore.add(ChatColor.GREEN + "- Decreases max health by 50%");
                Inthiumlore.add(ChatColor.GREEN + "- Reinforced");
                String Inthiumname = new String(ChatColor.GOLD + "Inthium");
                Inthiumlore.add(ChatColor.RESET + "");
                InthiumLoreMeta.setLore(Inthiumlore);
                InthiumLoreMeta.setDisplayName(Inthiumname);
                Inthium.setItemMeta(InthiumLoreMeta);
                Inthium.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                Inthium.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
                Inthium.addUnsafeEnchantment(Enchantment.DURABILITY, 9);

                inventory.addItem(Inthium);

                ItemStack Idrasil = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
                ItemMeta IdrasilLoreMeta = Idrasil.getItemMeta();
                ArrayList<String> Idrasillore = new ArrayList<>();
                Idrasillore.add("In the last hour of the battle, ");
                Idrasillore.add("protection is ensured with this chestplate");
                Idrasillore.add(ChatColor.RESET + "");
                Idrasillore.add(ChatColor.GREEN + "- Increases strength by 40%");
                Idrasillore.add(ChatColor.GREEN + "- Decreases max health by 10%");
                Idrasillore.add(ChatColor.GREEN + "- Reinforced");
                String Idrasilname = new String(ChatColor.GOLD + "Idrasil");
                Idrasillore.add(ChatColor.RESET + "");
                IdrasilLoreMeta.setLore(Idrasillore);
                IdrasilLoreMeta.setDisplayName(Idrasilname);
                Idrasil.setItemMeta(IdrasilLoreMeta);
                Idrasil.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                Idrasil.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
                Idrasil.addUnsafeEnchantment(Enchantment.DURABILITY, 9);

                inventory.addItem(Idrasil);

                ItemStack Tradoum = new ItemStack(Material.CHAINMAIL_LEGGINGS);
                ItemMeta TradoumLoreMeta = Tradoum.getItemMeta();
                ArrayList<String> Tradoumlore = new ArrayList<>();
                Tradoumlore.add("Instantly makes you feel twice more protected");
                Tradoumlore.add(ChatColor.GREEN + "- Increases max health by 100%");
                Tradoumlore.add(ChatColor.GREEN + "- Reinforced");
                String Tradoumname = new String(ChatColor.GOLD + "Tradoum");
                Tradoumlore.add(ChatColor.RESET + "");
                TradoumLoreMeta.setLore(Tradoumlore);
                TradoumLoreMeta.setDisplayName(Tradoumname);
                Tradoum.setItemMeta(TradoumLoreMeta);
                Tradoum.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                Tradoum.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
                Tradoum.addUnsafeEnchantment(Enchantment.DURABILITY, 9);

                inventory.addItem(Tradoum);

                ItemStack Cothus = new ItemStack(Material.CHAINMAIL_BOOTS);
                ItemMeta CothusLoreMeta = Cothus.getItemMeta();
                ArrayList<String> Cothuslore = new ArrayList<>();
                Cothuslore.add("Ensures the feet won't get blisters");
                Cothuslore.add(ChatColor.RESET + "");
                Cothuslore.add(ChatColor.GREEN + "- Increases speed by 40%");
                Cothuslore.add(ChatColor.GREEN + "- Increases max health by 50%");
                Cothuslore.add(ChatColor.GREEN + "- Reinforced");
                String Cothusname = new String(ChatColor.GOLD + "Cothus");
                Cothuslore.add(ChatColor.RESET + "");
                CothusLoreMeta.setLore(Cothuslore);
                CothusLoreMeta.setDisplayName(Cothusname);
                Cothus.setItemMeta(CothusLoreMeta);
                Cothus.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                Cothus.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
                Cothus.addUnsafeEnchantment(Enchantment.DURABILITY, 9);

                inventory.addItem(Cothus);

                ItemStack Mercaus = new ItemStack(Material.DIAMOND_HELMET);
                ItemMeta MercausLoreMeta = Mercaus.getItemMeta();
                ArrayList<String> Mercauslore = new ArrayList<>();
                Mercauslore.add("Makes you feel energized");
                Mercauslore.add(ChatColor.RESET + "");
                Mercauslore.add(ChatColor.GREEN + "- Decreases attack speed by 20%");
                Mercauslore.add(ChatColor.GREEN + "- Increases max health by 30%");
                Mercauslore.add(ChatColor.GREEN + "- Reinforced");
                String Mercausname = new String(ChatColor.GOLD + "Mercaus");
                Mercauslore.add(ChatColor.RESET + "");
                MercausLoreMeta.setLore(Mercauslore);
                MercausLoreMeta.setDisplayName(Mercausname);
                Mercaus.setItemMeta(MercausLoreMeta);
                Mercaus.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                Mercaus.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
                Mercaus.addUnsafeEnchantment(Enchantment.DURABILITY, 9);

                inventory.addItem(Mercaus);


                ItemStack Cuirass = new ItemStack(Material.DIAMOND_CHESTPLATE);
                ItemMeta CuirassLoreMeta = Cuirass.getItemMeta();
                ArrayList<String> Cuirasslore = new ArrayList<>();
                Cuirasslore.add("Made to protect centaurs from large ");
                Cuirasslore.add("amounts of arrows.");
                Cuirasslore.add(ChatColor.GREEN + "- Increases strength by 40%");
                Cuirasslore.add(ChatColor.GREEN + "- Reinforced");
                String Cuirassname = new String(ChatColor.GOLD + "Mithas");
                Cuirasslore.add(ChatColor.RESET + "");
                CuirassLoreMeta.setLore(Cuirasslore);
                CuirassLoreMeta.setDisplayName(Cuirassname);
                Cuirass.setItemMeta(CuirassLoreMeta);
                Cuirass.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                Cuirass.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
                Cuirass.addUnsafeEnchantment(Enchantment.DURABILITY, 9);

                inventory.addItem(Cuirass);


                ItemStack Argent = new ItemStack(Material.DIAMOND_LEGGINGS);
                ItemMeta ArgentLoreMeta = Argent.getItemMeta();
                ArrayList<String> Argentlore = new ArrayList<>();
                Argentlore.add("Most say these pants make you feel peak dexterity");
                Argentlore.add(ChatColor.GREEN + "- Increases max health by 40%");
                Argentlore.add(ChatColor.GREEN + "- Increases max jump height by 200%");
                Argentlore.add(ChatColor.GREEN + "- Reinforced");
                String Argentname = new String(ChatColor.GOLD + "Argent");
                Argentlore.add(ChatColor.RESET + "");
                ArgentLoreMeta.setLore(Argentlore);
                ArgentLoreMeta.setDisplayName(Argentname);
                Argent.setItemMeta(ArgentLoreMeta);
                Argent.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                Argent.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
                Argent.addUnsafeEnchantment(Enchantment.DURABILITY, 9);

                inventory.addItem(Argent);


                ItemStack Waterwalkers = new ItemStack(Material.DIAMOND_BOOTS);
                ItemMeta WaterwalkersLoreMeta = Waterwalkers.getItemMeta();
                ArrayList<String> Waterwalkerslore = new ArrayList<>();
                Waterwalkerslore.add("Enchanted by water nymphs to allow humans ");
                Waterwalkerslore.add("to move through water quickly");
                Waterwalkerslore.add(ChatColor.RESET + "");
                Waterwalkerslore.add(ChatColor.GREEN + "- Increases speed by 40%");
                Waterwalkerslore.add(ChatColor.GREEN + "- Increases max health by 10%");
                Waterwalkerslore.add(ChatColor.GREEN + "- Reinforced");
                String Waterwalkersname = new String(ChatColor.GOLD + "Slathus");
                Waterwalkerslore.add(ChatColor.RESET + "");
                WaterwalkersLoreMeta.setLore(Waterwalkerslore);
                WaterwalkersLoreMeta.setDisplayName(Waterwalkersname);
                Waterwalkers.setItemMeta(WaterwalkersLoreMeta);
                Waterwalkers.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                Waterwalkers.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
                Waterwalkers.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                Waterwalkers.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 3);
                inventory.addItem(Waterwalkers);

                ItemStack SnowyHelm = new ItemStack(Material.DIAMOND_HELMET);
                ItemMeta SnowyHelmLoreMeta = SnowyHelm.getItemMeta();
                ArrayList<String> SnowyHelmlore = new ArrayList<>();
                SnowyHelmlore.add("");
                SnowyHelmlore.add("");
                SnowyHelmlore.add(ChatColor.GREEN + "- Increases max health by 10%");
                SnowyHelmlore.add(ChatColor.GREEN + "- Reinforced");
                String SnowyHelmname = new String(ChatColor.GOLD + "Xypher's Helm");
                SnowyHelmlore.add(ChatColor.RESET + "");
                SnowyHelmLoreMeta.setLore(SnowyHelmlore);
                SnowyHelmLoreMeta.setDisplayName(SnowyHelmname);
                SnowyHelm.setItemMeta(SnowyHelmLoreMeta);
                SnowyHelm.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                SnowyHelm.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
                SnowyHelm.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                SnowyHelm.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 3);
                inventory.addItem(SnowyHelm);


                ItemStack Sloth = new ItemStack(Material.BOW);
                ItemMeta SlothMeta = Sloth.getItemMeta();
                ArrayList<String> SlothLore = new ArrayList();
                SlothLore.add("Slowness lives within. ");
                SlothLore.add("Deadly Sin 4/7");
                SlothLore.add(ChatColor.GREEN + "- Cripples The Enemy");
                SlothLore.add("");
                SlothLore.add(ChatColor.GRAY + "Kill Count: 0");
                String SlothName = new String(ChatColor.GOLD + "Sloth");
                SlothMeta.setDisplayName(SlothName);
                SlothMeta.setLore(SlothLore);
                Sloth.setItemMeta(SlothMeta);
                Sloth.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
                Sloth.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 10);
                Sloth.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
                Sloth.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 5);
                inventory.addItem(new ItemStack[]{Sloth});

                ItemStack Gluttony = new ItemStack(Material.DIAMOND_AXE);
                ItemMeta GluttonyMeta = Gluttony.getItemMeta();
                ArrayList<String> GluttonyLore = new ArrayList();
                GluttonyLore.add("Both a solution and a cause of famine. ");
                GluttonyLore.add("Deadly Sin 2/7");
                GluttonyLore.add(ChatColor.GREEN + "- Steals Hunger");
                GluttonyLore.add("");
                GluttonyLore.add(ChatColor.GREEN + "- Fills the wielder's hunger");
                GluttonyLore.add("");
                GluttonyLore.add(ChatColor.GRAY + "Kill Count: 0");
                String GluttonyName = new String(ChatColor.GOLD + "Gluttony");
                GluttonyMeta.setDisplayName(GluttonyName);
                GluttonyMeta.setLore(GluttonyLore);
                Gluttony.setItemMeta(GluttonyMeta);
                Gluttony.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
                Gluttony.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 15);
                Gluttony.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
                inventory.addItem(new ItemStack[]{Gluttony});

                ItemStack Greed = new ItemStack(Material.GOLD_PICKAXE);
                ItemMeta GreedMeta = Greed.getItemMeta();
                ArrayList<String> GreedLore = new ArrayList();
                GreedLore.add("A hoarding weapon of godlike health.");
                GreedLore.add("Deadly Sin 3/7");
                GreedLore.add(ChatColor.GREEN + "- Steals Health");
                GreedLore.add(ChatColor.GREEN + "- Adds Absorption ");
                GreedLore.add("");
                GreedLore.add(ChatColor.GRAY + "Kill Count: 0");
                String GreedName = new String(ChatColor.GOLD + "Greed");
                GreedMeta.setDisplayName(GreedName);
                GreedMeta.setLore(GreedLore);
                Greed.setItemMeta(GreedMeta);
                Greed.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                Greed.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 22);
                Greed.addUnsafeEnchantment(Enchantment.MENDING, 1);
                inventory.addItem(new ItemStack[]{Greed});


                ItemStack Pride = new ItemStack(Material.DIAMOND_PICKAXE);
                ItemMeta PrideMeta = Pride.getItemMeta();
                ArrayList<String> PrideLore = new ArrayList();
                PrideLore.add("God is unlike any human, ");
                PrideLore.add("it is impossible to attain his powers. ");
                PrideLore.add("Deadly Sin 5/7");
                PrideLore.add(ChatColor.GREEN + "- Adds Absorption");
                PrideLore.add(ChatColor.GREEN + "- Saps Strength");
                PrideLore.add("");
                PrideLore.add(ChatColor.GRAY + "Kill Count: 0");
                String PrideName = new String(ChatColor.GOLD + "Pride");
                PrideMeta.setDisplayName(PrideName);
                PrideMeta.setLore(PrideLore);
                Pride.setItemMeta(PrideMeta);
                Pride.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                Pride.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 16);
                Pride.addUnsafeEnchantment(Enchantment.KNOCKBACK, 3);
                Pride.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 3);
                inventory.addItem(new ItemStack[]{Pride});

                ItemStack Wrath = new ItemStack(Material.DIAMOND_AXE);
                ItemMeta WrathMeta = Wrath.getItemMeta();
                ArrayList<String> WrathLore = new ArrayList();
                WrathLore.add("A weapon of rage and destruction ");
                WrathLore.add("Deadly Sin 5/7");
                WrathLore.add(ChatColor.GREEN + "- Spreads Nausea");
                WrathLore.add(ChatColor.GREEN + "- Curses the Enemy");
                WrathLore.add("");
                WrathLore.add(ChatColor.GRAY + "Kill Count: 0");
                String WrathName = new String(ChatColor.GOLD + "Wrath");
                WrathMeta.setDisplayName(WrathName);
                WrathMeta.setLore(WrathLore);
                Wrath.setItemMeta(WrathMeta);
                Wrath.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                Wrath.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 16);
                Wrath.addUnsafeEnchantment(Enchantment.KNOCKBACK, 3);
                Wrath.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 3);
                inventory.addItem(new ItemStack[]{Wrath});

                ItemStack Envy = new ItemStack(Material.GOLD_AXE);
                ItemMeta EnvyMeta = Envy.getItemMeta();
                ArrayList<String> EnvyLore = new ArrayList();
                EnvyLore.add("A joy at another's misfortune. ");
                EnvyLore.add("Deadly Sin 6/7");
                EnvyLore.add(ChatColor.GREEN + "- Steals Experience");
                EnvyLore.add("");
                EnvyLore.add(ChatColor.GRAY + "Kill Count: 0");
                String EnvyName = new String(ChatColor.GOLD + "Envy");
                EnvyMeta.setDisplayName(EnvyName);
                EnvyMeta.setLore(EnvyLore);
                Envy.setItemMeta(EnvyMeta);
                Envy.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                Envy.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 20);
                Envy.addUnsafeEnchantment(Enchantment.MENDING, 1);
                inventory.addItem(new ItemStack[]{Envy});

                ItemStack Lust = new ItemStack(Material.BOW);
                ItemMeta LustMeta = Lust.getItemMeta();
                ArrayList<String> LustLore = new ArrayList();
                LustLore.add("Cupid's legendary bow. ");
                LustLore.add("Deadly Sin 1/7");
                LustLore.add(ChatColor.GREEN + "- Shoots Regeneration Arrows");
                LustLore.add("");
                LustLore.add(ChatColor.GRAY + "Kill Count: 0");
                String LustName = new String(ChatColor.GOLD + "Lust");
                LustMeta.setDisplayName(LustName);
                LustMeta.setLore(LustLore);
                Lust.setItemMeta(LustMeta);
                Lust.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
                Lust.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 20);
                Lust.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
                inventory.addItem(new ItemStack[]{Lust});

                ItemStack Drill = new ItemStack(Material.DIAMOND_PICKAXE);
                ItemMeta DrillMeta = Drill.getItemMeta();
                ArrayList<String> DrillLore = new ArrayList();
                String DrillName = new String(ChatColor.WHITE + "Drill");
                DrillMeta.setDisplayName(DrillName);
                DrillMeta.setLore(DrillLore);
                Drill.setItemMeta(DrillMeta);
                Drill.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
                Drill.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                Drill.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
                Drill.addUnsafeEnchantment(Enchantment.MENDING, 1);
                inventory.addItem(new ItemStack[]{Drill});

                ItemStack Chainsaw = new ItemStack(Material.DIAMOND_AXE);
                ItemMeta ChainsawMeta = Chainsaw.getItemMeta();
                ArrayList<String> ChainsawLore = new ArrayList();
                String ChainsawName = new String(ChatColor.WHITE + "Chainsaw");
                ChainsawMeta.setDisplayName(ChainsawName);
                ChainsawMeta.setLore(ChainsawLore);
                Chainsaw.setItemMeta(ChainsawMeta);
                Chainsaw.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6);
                Chainsaw.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                Chainsaw.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
                Chainsaw.addUnsafeEnchantment(Enchantment.MENDING, 1);
                inventory.addItem(new ItemStack[]{Chainsaw});

                ItemStack Bow = new ItemStack(Material.BOW);
                ItemMeta BowLoreMeta = Bow.getItemMeta();
                ArrayList<String> Bowlore = new ArrayList<>();
                String Bowname = new String(ChatColor.WHITE + "Bow");
                Bowlore.add(ChatColor.RESET + "");
                BowLoreMeta.setLore(Bowlore);
                BowLoreMeta.setDisplayName(Bowname);
                Bow.setItemMeta(BowLoreMeta);
                Bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 7);
                Bow.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 2);
                Bow.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
                Bow.addUnsafeEnchantment(Enchantment.MENDING, 1);
                Bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);

                inventory.addItem(Bow);

                ItemStack reaper = new ItemStack(Material.DIAMOND_HOE);
                ItemMeta reaperLoreMeta = reaper.getItemMeta();
                ArrayList<String> reaperlore = new ArrayList<>();
                reaperlore.add("Death's weapon of choice");
                reaperlore.add(ChatColor.GREEN + "- Spreads Nausea");
                reaperlore.add(ChatColor.GREEN + "- Poisons the enemy");
                reaperlore.add(ChatColor.GREEN + "- Reinforced");
                String reapername = new String(ChatColor.GOLD + "The Reaper");
                reaperlore.add(ChatColor.RESET + "");
                reaperLoreMeta.setLore(reaperlore);
                reaperLoreMeta.setDisplayName(reapername);
                reaper.setItemMeta(reaperLoreMeta);
                reaper.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 15);
                reaper.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 7);
                reaper.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
                reaper.addUnsafeEnchantment(Enchantment.DURABILITY, 9);

                inventory.addItem(reaper);

                ItemStack shard = new ItemStack(Material.PRISMARINE_SHARD, 64);
                ItemMeta shardLoreMeta = shard.getItemMeta();
                ArrayList<String> shardlore = new ArrayList();
                shardlore.add("Refined essence");
                shardLoreMeta.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ENCHANTS});
                String shardname = new String(ChatColor.DARK_PURPLE + "Shard");
                shardLoreMeta.setDisplayName(shardname);
                shardLoreMeta.setLore(shardlore);
                shard.setItemMeta(shardLoreMeta);
                shard.addUnsafeEnchantment(Enchantment.LUCK, 1);
                inventory.addItem(new ItemStack[]{shard});

                player.sendMessage(ChatColor.GREEN + "You have received your items!");
            }
        }
        return true;

    }

}