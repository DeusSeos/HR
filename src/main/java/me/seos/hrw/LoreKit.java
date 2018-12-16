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
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class LoreKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("lorekit")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                Inventory inventory = player.getInventory();
                if (!player.hasPermission("HRW.lorekit")) {
                    sender.sendMessage(ChatColor.RED + "You do not have access to this command.");
                }


                if (args.length < 1) {

                    if (player.hasPermission("HRW.lorekit")) {

                        ItemStack legendarycoif = new ItemStack(Material.CHAINMAIL_HELMET);
                        ItemMeta legendarycoifLoreMeta = legendarycoif.getItemMeta();
                        ArrayList<String> legendarycoiflore = new ArrayList<>();
                        legendarycoiflore.add("Placeholder");
                        legendarycoiflore.add(ChatColor.RESET + "");
                        legendarycoiflore.add(ChatColor.GREEN + "- Decreases Incoming Damage By 20%");
                        legendarycoiflore.add(ChatColor.GREEN + "- Decreases Max Health By 40%");
                        legendarycoiflore.add(ChatColor.GREEN + "- Reinforced");
                        String legendarycoifname = new String(ChatColor.GREEN + "Inthium");
                        legendarycoifLoreMeta.setLore(legendarycoiflore);
                        legendarycoifLoreMeta.setDisplayName(legendarycoifname);
                        legendarycoif.setItemMeta(legendarycoifLoreMeta);
                        legendarycoif.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                        legendarycoif.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
                        legendarycoif.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                        inventory.addItem(legendarycoif);

                        ItemStack mail = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
                        ItemMeta mailLoreMeta = mail.getItemMeta();
                        ArrayList<String> maillore = new ArrayList<>();
                        maillore.add("Placeholder");
                        maillore.add(ChatColor.RESET + "");
                        maillore.add(ChatColor.GREEN + "- Increases Strength By 40%");
                        maillore.add(ChatColor.GREEN + "- Decreases Max Health by 10%");
                        maillore.add(ChatColor.GREEN + "- Reinforced");
                        String mailname = new String(ChatColor.GREEN + "Idrasil");
                        mailLoreMeta.setLore(maillore);
                        mailLoreMeta.setDisplayName(mailname);
                        mail.setItemMeta(mailLoreMeta);
                        mail.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                        mail.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
                        mail.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                        inventory.addItem(mail);

                        ItemStack chausses = new ItemStack(Material.CHAINMAIL_LEGGINGS);
                        ItemMeta chaussesLoreMeta = chausses.getItemMeta();
                        ArrayList<String> chausseslore = new ArrayList<>();
                        chausseslore.add("Placeholder");
                        chausseslore.add(ChatColor.GREEN + "");
                        chausseslore.add(ChatColor.GREEN + "- Increases Max Health by 100%");
                        chausseslore.add(ChatColor.GREEN + "- Reinforced");
                        String chaussesname = new String(ChatColor.GREEN + "Tradoum");
                        chaussesLoreMeta.setLore(chausseslore);
                        chaussesLoreMeta.setDisplayName(chaussesname);
                        chausses.setItemMeta(chaussesLoreMeta);
                        chausses.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                        chausses.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
                        chausses.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                        inventory.addItem(chausses);

                        ItemStack Cuirass = new ItemStack(Material.CHAINMAIL_BOOTS);
                        ItemMeta CuirassLoreMeta = Cuirass.getItemMeta();
                        ArrayList<String> Cuirasslore = new ArrayList<>();
                        Cuirasslore.add("Placeholder");
                        Cuirasslore.add(ChatColor.RESET + "");
                        Cuirasslore.add(ChatColor.GREEN + "- Increases Speed by 40%");
                        Cuirasslore.add(ChatColor.GREEN + "- Increases Max Health by 50%");
                        Cuirasslore.add(ChatColor.GREEN + "- Reinforced");
                        String Cuirassname = new String(ChatColor.GREEN + "Cothus");
                        CuirassLoreMeta.setLore(Cuirasslore);
                        CuirassLoreMeta.setDisplayName(Cuirassname);
                        Cuirass.setItemMeta(CuirassLoreMeta);
                        Cuirass.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                        Cuirass.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
                        Cuirass.addUnsafeEnchantment(Enchantment.DURABILITY, 9);

                        inventory.addItem(Cuirass);


                        ItemStack setrius = new ItemStack(Material.DIAMOND_SWORD);
                        ItemMeta setriusLoreMeta = setrius.getItemMeta();
                        ArrayList<String> setriuslore = new ArrayList<>();
                        setriuslore.add("The Seeker awakens");
                        setriuslore.add(ChatColor.RESET + "");
                        setriuslore.add(ChatColor.GREEN + "- Spreads Nausea");
                        setriuslore.add(ChatColor.GREEN + "- Poisons The Enemy");
                        String setriusname = new String(ChatColor.RED + "Setrius");
                        setriuslore.add(ChatColor.RESET + "");
                        setriuslore.add(ChatColor.GRAY + "Kill Count: 0");
                        setriusLoreMeta.setLore(setriuslore);
                        setriusLoreMeta.setDisplayName(setriusname);
                        setrius.setItemMeta(setriusLoreMeta);
                        setrius.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
                        setrius.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 6);
                        setrius.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 6);
                        setrius.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
                        inventory.addItem(setrius);

                        ItemStack sos = new ItemStack(Material.GOLD_SWORD);
                        ItemMeta sosMeta = sos.getItemMeta();
                        ArrayList<String> soslore = new ArrayList<>();
                        soslore.add("Once wielded by Frey");
                        soslore.add("");
                        soslore.add(ChatColor.GREEN + "- Saps Strength");
                        soslore.add("");
                        soslore.add(ChatColor.GRAY + "Kill Count: 0");
                        ;
                        String sosname = new String(ChatColor.GOLD + "Eternal Flame");
                        sosMeta.setLore(soslore);
                        sosMeta.setDisplayName(sosname);
                        sos.setItemMeta(sosMeta);
                        sos.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
                        sos.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 10);
                        sos.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 5);
                        sos.addUnsafeEnchantment(Enchantment.KNOCKBACK, 4);
                        sos.addUnsafeEnchantment(Enchantment.MENDING, 1);
                        inventory.addItem(sos);

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

                        ItemStack loreaxe = new ItemStack((Material.DIAMOND_AXE));
                        ItemMeta loreaxeLoreMeta = loreaxe.getItemMeta();
                        ArrayList<String> loreaxelore = new ArrayList<>();
                        //loreaxelore.add(ChatColor.DARK_PURPLE + "Forged and Wielded by Sion.");
                        loreaxelore.add(ChatColor.DARK_PURPLE + "Only he can use the");
                        loreaxelore.add(ChatColor.DARK_PURPLE + "true power of Evanhelion.");
                        loreaxelore.add(ChatColor.RESET + "");
                        loreaxelore.add(ChatColor.DARK_RED + "- Marked For Death");
                        loreaxelore.add(ChatColor.RESET + "");
                        loreaxelore.add(ChatColor.GRAY + "Kill Count: 0");
                        String loreaxename = new String(ChatColor.GOLD + "Evanhelion");
                        loreaxeLoreMeta.setLore(loreaxelore);
                        loreaxeLoreMeta.setDisplayName(loreaxename);
                        loreaxe.setItemMeta(loreaxeLoreMeta);
                        loreaxe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
                        loreaxe.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 3);
                        inventory.addItem(loreaxe);

                /*
                ItemStack scythe = new ItemStack(((Material.DIAMOND_HOE)));
                ItemMeta scytheLoreMeta = scythe.getItemMeta();
                ArrayList<String> scythelore = new ArrayList<>();
                scythelore.add(ChatColor.RESET + "");
                scythelore.add(ChatColor.GREEN + "- Spreads Nausea");
                scythelore.add(ChatColor.GREEN + "- Poisons The Enemy");
                scythelore.add(ChatColor.GREEN + "- Blinds The Enemy");
                String sycthename = new String(ChatColor.RED + "Death Scythe");
                scytheLoreMeta.setLore(scythelore);
                scytheLoreMeta.setDisplayName(sycthename);
                scythe.setItemMeta(scytheLoreMeta);
                scythe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 20);
                scythe.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 10);
                scythe.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 10);
                scythe.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                inventory.addItem(scythe);
                */

                        ItemStack telesword = new ItemStack(Material.BOOK);
                        ItemMeta teleswordLoreMeta = telesword.getItemMeta();
                        ArrayList<String> teleswordlore = new ArrayList<>();
                        teleswordlore.add(ChatColor.GREEN + "Book One of the Traveler");
                        teleswordLoreMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        String teleswordname = new String(ChatColor.RED + "The Traveler's Journal");
                        teleswordLoreMeta.setDisplayName(teleswordname);
                        teleswordLoreMeta.setLore(teleswordlore);
                        telesword.setItemMeta(teleswordLoreMeta);
                        telesword.addUnsafeEnchantment(Enchantment.LUCK, 1);
                        inventory.addItem(telesword);

                        ItemStack easterhelm = new ItemStack((Material.IRON_HELMET));
                        ItemMeta easterhelmLoreMeta = easterhelm.getItemMeta();
                        ArrayList<String> easterhelmlore = new ArrayList<>();
                        easterhelmlore.add("Infused with Witch Essence");
                        easterhelmlore.add(ChatColor.RESET + "");
                        easterhelmlore.add(ChatColor.GREEN + "- Increases Max Health by 40%");
                        easterhelmlore.add(ChatColor.GREEN + "- Slightly Boosts Regeneration");
                        easterhelmLoreMeta.setLore(easterhelmlore);
                        easterhelm.setItemMeta(easterhelmLoreMeta);
                        ItemMeta easterhelmname = easterhelm.getItemMeta();
                        easterhelmname.setDisplayName(ChatColor.RED + "Proto Helmet");
                        easterhelm.setItemMeta(easterhelmname);
                        easterhelm.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        easterhelm.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
                        easterhelm.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
                        inventory.addItem(easterhelm);


                        ItemStack godchest = new ItemStack(Material.IRON_CHESTPLATE);
                        ItemMeta godchestLoreMeta = godchest.getItemMeta();
                        ArrayList<String> godchestlore = new ArrayList<>();
                        godchestlore.add("Infused with the power of a golem");
                        godchestlore.add(ChatColor.RESET + "");
                        godchestlore.add(ChatColor.GREEN + "- Increases Strength Slightly");
                        godchestlore.add(ChatColor.GREEN + "- Increases Max Health by 20%");
                        String godchestname = new String(ChatColor.RED + "Proto Chest");
                        godchestLoreMeta.setLore(godchestlore);
                        godchestLoreMeta.setDisplayName(godchestname);
                        godchest.setItemMeta(godchestLoreMeta);
                        godchest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        godchest.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
                        inventory.addItem(godchest);

                        ItemStack godlegs = new ItemStack(Material.IRON_LEGGINGS);
                        ItemMeta godlegsLoreMeta = godlegs.getItemMeta();
                        ArrayList<String> godlegslore = new ArrayList<>();
                        godlegslore.add("Infused with Killer Rabbit Essence");
                        godlegslore.add(ChatColor.RESET + "");
                        godlegslore.add(ChatColor.GREEN + "- Increases Jump Height by 100%");
                        godlegslore.add(ChatColor.GREEN + "- Increases Max Health by 20%");
                        String godlegsname = new String(ChatColor.RED + "Proto Legs");
                        godlegsLoreMeta.setLore(godlegslore);
                        godlegsLoreMeta.setDisplayName(godlegsname);
                        godlegs.setItemMeta(godlegsLoreMeta);
                        godlegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        godlegs.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
                        inventory.addItem(godlegs);

                        ItemStack godboots = new ItemStack(Material.IRON_BOOTS);
                        ItemMeta godbootsMeta = godboots.getItemMeta();
                        ArrayList<String> godbootslore = new ArrayList<>();
                        godbootslore.add("Infused with Wolf Essence");
                        godbootslore.add(ChatColor.RESET + "");
                        godbootslore.add(ChatColor.GREEN + "- Increases Speed by 20%");
                        godbootslore.add(ChatColor.GREEN + "- Increases Max Health by 20%");
                        String godbootsname = new String(ChatColor.RED + "Proto Boots");
                        godbootsMeta.setLore(godbootslore);
                        godbootsMeta.setDisplayName(godbootsname);
                        godboots.setItemMeta(godbootsMeta);
                        godboots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                        godboots.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
                        godboots.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 4);
                        inventory.addItem(godboots);

                        ItemStack slBoots = new ItemStack((Material.LEATHER_BOOTS));
                        ItemMeta slBootsMeta = slBoots.getItemMeta();
                        ArrayList<String> slBootsLore = new ArrayList<>();
                        slBootsLore.add("Boots of the Great Traveler");
                        slBootsLore.add(ChatColor.RESET + "");
                        slBootsLore.add(ChatColor.GREEN + "- Increases Speed by 60%");
                        slBootsLore.add(ChatColor.GREEN + "- Increases Max Health by 10%");
                        slBootsMeta.setLore(slBootsLore);
                        String slBootsName = new String(ChatColor.RED + "Seven-League Boots");
                        slBootsMeta.setDisplayName(slBootsName);
                        slBoots.setItemMeta(slBootsMeta);
                        slBoots.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                        slBoots.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
                        inventory.addItem(slBoots);


                        ItemStack ShardofTruth = new ItemStack((Material.PRISMARINE_SHARD));
                        ItemMeta ShardofTruthMeta = ShardofTruth.getItemMeta();
                        ArrayList<String> ShardofTruthLore = new ArrayList<>();
                        ShardofTruthLore.add(ChatColor.RESET + "");
                        ShardofTruthLore.add(ChatColor.GREEN + "- See what can't be seen");
                        ShardofTruthLore.add(ChatColor.RESET + "");
                        ShardofTruthMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        ShardofTruthMeta.setLore(ShardofTruthLore);
                        String ShardofTruthName = new String(ChatColor.GOLD + "Shard of Truth");
                        ShardofTruthMeta.setDisplayName(ShardofTruthName);
                        ShardofTruth.setItemMeta(ShardofTruthMeta);
                        ShardofTruth.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 12);
                        ShardofTruth.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
                        inventory.addItem(ShardofTruth);


                        ItemStack shard = new ItemStack(Material.PRISMARINE_SHARD, 64);
                        ItemMeta shardLoreMeta = shard.getItemMeta();
                        ArrayList<String> shardlore = new ArrayList<>();
                        shardlore.add("Refined essence");
                        shardLoreMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        String shardname = new String(ChatColor.DARK_PURPLE + "Shard");
                        shardLoreMeta.setDisplayName(shardname);
                        shardLoreMeta.setLore(shardlore);
                        shard.setItemMeta(shardLoreMeta);
                        shard.addUnsafeEnchantment(Enchantment.LUCK, 1);
                        inventory.addItem(shard);

                        ItemStack essence = new ItemStack(Material.PRISMARINE_CRYSTALS, 64);
                        ItemMeta essenceMeta = essence.getItemMeta();
                        ArrayList<String> essencelore = new ArrayList<>();
                        essenceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        String essencename = new String(ChatColor.DARK_PURPLE + "Essence");
                        essenceMeta.setDisplayName(essencename);
                        essenceMeta.setLore(essencelore);
                        essence.setItemMeta(essenceMeta);
                        essence.addUnsafeEnchantment(Enchantment.LUCK, 1);
                        inventory.addItem(essence);

                        String test = ChatColor.stripColor(essencename);
                        ItemStack spade = new ItemStack(Material.STONE_SPADE);
                        ItemMeta spademeta = spade.getItemMeta();
                        ArrayList<String> spadelore = new ArrayList<>();
                        spadelore.add("Forged from a Reaper's Ribs");
                        spadelore.add(ChatColor.RESET + "");
                        spadelore.add(ChatColor.GREEN + "- Drain's Life");
                        spadelore.add(ChatColor.RESET + "");
                        String spadename = new String(ChatColor.DARK_GRAY + "GraveDigger");
                        spademeta.setLore(spadelore);
                        spademeta.setDisplayName(spadename);
                        spade.setItemMeta(spademeta);
                        spade.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 15);
                        spade.addUnsafeEnchantment(Enchantment.DURABILITY, 9);
                        spade.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 5);
                        inventory.addItem(spade);

                        ItemStack Nep = new ItemStack(Material.BOW);
                        ItemMeta NepMeta = Nep.getItemMeta();
                        NepMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        ArrayList<String> NepLore = new ArrayList<>();
                        NepLore.add("Condensed Shulker Essence");
                        String NepName = new String(ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Levios");
                        NepMeta.setDisplayName(NepName);
                        NepMeta.setLore(NepLore);
                        Nep.setItemMeta(NepMeta);
                        Nep.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                        Nep.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                        inventory.addItem(Nep);

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

                        ItemStack Lust = new ItemStack(Material.BOW);
                        ItemMeta LustMeta = Lust.getItemMeta();
                        ArrayList<String> LustLore = new ArrayList();
                        LustLore.add("Cupid's Legendary Bow");
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
                        Lust.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                        inventory.addItem(Lust);


                        player.sendMessage(ChatColor.YELLOW + "Lorekit Sent.");
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