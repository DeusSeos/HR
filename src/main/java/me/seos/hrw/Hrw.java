package me.seos.hrw;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class Hrw extends JavaPlugin {

    private static int kothMinX = -487;
    private static int kothMaxX = -384;
    private static int kothMinY = 0;
    private static int kothMaxY = 256;
    private static int kothMinZ = 639;
    private static int kothMaxZ = 769;

    public Permission playerpermission = new Permission("HRW.godkit");
    public Permission pp1 = new Permission("HRW.legendarykit");
    public Permission pp2 = new Permission("HRW.lorekit");
    public Permission pp3 = new Permission("HRW.eventkit");
    public Permission pp4 = new Permission("HRW.koth");


    public boolean isActive = false;
    //public HashMap<String, Boolean> kothactive = new HashMap<String, Boolean>();
    public HashMap<String, Boolean> toggle = new HashMap<String, Boolean>();
    public HashMap<String, Integer> kothScores = new HashMap<String, Integer>();
    public HashMap<UUID, Integer> anvilcdtime = new HashMap<UUID, Integer>();
    public HashMap<UUID, Integer> zordcdtime = new HashMap<UUID, Integer>();
    public HashMap<UUID, Integer> cdtime = new HashMap<UUID, Integer>();
    public int mastercd = 8;
    public int anvilcd = 120;
    public int zordcd = 10;

    public void zordConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public void toggleConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public void anvilConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public void kothRunnable() {
        new BukkitRunnable() {
            public void run() {
                if (isActive == true) {
                    for (Player player : Bukkit.getServer().getOnlinePlayers()) {
                        String name = player.getName();
                        Location location = player.getLocation();
                        World world = location.getWorld();
                        int x = (int) location.getX();
                        int y = (int) location.getY();
                        int z = (int) location.getZ();
                        if (world == Bukkit.getWorld("HG")) {
                            if ((x >= kothMinX && x <= kothMaxX)
                                    && (y >= kothMinY && y <= kothMaxY)
                                    && (z >= kothMinZ && z <= kothMaxZ)) {
                                if (!kothScores.containsKey(name)) {
                                    kothScores.put(name, 1);
                                }
                                if (kothScores.containsKey(name)) {
                                    kothScores.put(name, kothScores.get(name) + 1);
                                }
                            }
                        }else{
                        }
                    }
                } else {
                    return;
                }
            }
        }.runTaskTimer(this, 0, 20);
    }

    public void update() {
        new BukkitRunnable() {

            @Override
            public void run() {
                if (toggle.isEmpty()) {
                    return;
                }

                for (String string : toggle.keySet()) {
                    Boolean togbool = toggle.get(string);

                    if (togbool == Boolean.TRUE) {
                        Player player = Bukkit.getPlayer(string);
                        ScoreboardManager manager = Bukkit.getScoreboardManager();
                        Scoreboard scoreboard = manager.getNewScoreboard();
                        Objective objective = scoreboard.registerNewObjective("koth", "dummy");
                        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
                        objective.setDisplayName(ChatColor.GREEN + "King of the Hill");
                        //int scoresize = kothScores.size();
                        //int iterator = 0;
                        //for (iterator = 0; iterator == scoresize; iterator++){
                        if (!kothScores.isEmpty()) {
                            for (Map.Entry<String, Integer> entry : kothScores.entrySet()) {
                                String key = entry.getKey();
                                Integer value = entry.getValue();
                                Score score = scoreboard.getObjective("koth").getScore(key);
                                score.setScore(value);
                            }
                        } else {
                            return;
                        }
                        if(player == null){
                            return;
                        }
                        if(player.isOnline()){
                            player.setScoreboard(scoreboard);
                        }

                    } else {
                        return;
                    }
                }
            }
        }.runTaskTimer(this, 0, 20);
    }


    public void runnable() {
        new BukkitRunnable() {

            @Override
            public void run() {

                if (anvilcdtime.isEmpty()) {
                    return;
                }

                for (UUID uuid : anvilcdtime.keySet()) {
                    int cdleft = anvilcdtime.get(uuid);

                    if (cdleft <= 0) {
                        anvilcdtime.remove(uuid);

                    } else {
                        anvilcdtime.put(uuid, cdleft - 1);

                    }
                }
            }
        }.runTaskTimer(this, 0, 20);
    }


    public void runnablerunner() {
        new BukkitRunnable() {

            @Override
            public void run() {

                if (cdtime.isEmpty()) {
                    return;
                }

                for (UUID uuid : cdtime.keySet()) {
                    int timeleft = cdtime.get(uuid);

                    if (timeleft <= 0) {
                        cdtime.remove(uuid);

                    } else {
                        cdtime.put(uuid, timeleft - 1);

                    }
                }
            }
        }.runTaskTimer(this, 0, 20);
    }

    public void zord() {
        new BukkitRunnable() {

            @Override
            public void run() {

                if (zordcdtime.isEmpty()) {
                    return;
                }

                for (UUID uuid : zordcdtime.keySet()) {
                    int timeleft = zordcdtime.get(uuid);

                    if (timeleft <= 0) {
                        zordcdtime.remove(uuid);

                    } else {
                        zordcdtime.put(uuid, timeleft - 1);

                    }
                }
            }
        }.runTaskTimer(this, 0, 20);
    }


    @Override
    public void onEnable() {
        getServer().createWorld(new WorldCreator("HG"));
        PluginManager pm = Bukkit.getServer().getPluginManager();
        Bukkit.getServer().getPluginManager().registerEvents(new SwordEffects(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new TeleportSword(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new UltraDurable(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new JoinLeaveMessage(), this);
        //Bukkit.getServer().getPluginManager().registerEvents(new LoreArmorEquip(), this);
        //pm.registerEvents(new EatFlower(), this);
        pm.registerEvents(new AnvilEvent(), this);
        pm.registerEvents(new LightningBow(), this);
        //pm.registerEvents(new HealEffect(), this);
        pm.registerEvents(new DragonDeath(), this);
        pm.registerEvents(new Zord(), this);
        pm.registerEvents(new ChatChanger(), this);
        pm.addPermission(playerpermission);
        pm.addPermission(pp1);
        pm.addPermission(pp2);
        pm.addPermission(pp3);
        pm.addPermission(pp4);
        this.getCommand("test").setExecutor(new TestCommand());
        this.getCommand("baconskit").setExecutor(new baconkit());
        this.getCommand("koth").setExecutor(new Koth());
        this.getCommand("eventkit").setExecutor(new EventKit());
        this.getCommand("lorekit").setExecutor(new LoreKit());
        this.getCommand("godkit").setExecutor(new GodKit());
        this.getCommand("legendarykit").setExecutor(new LegendaryKit());
        loadConfig();
        anvilConfig();
        zordConfig();
        toggleConfig();
        zord();
        runnablerunner();
        runnable();
        update();
        kothRunnable();
        //kothactive.put("State:", false);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
