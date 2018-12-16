package me.seos.hrw;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.PlayerInventory;

import java.util.List;
import java.util.UUID;

public class Zord implements Listener {


    private Hrw plugin = Hrw.getPlugin(Hrw.class);


    @EventHandler
    public void playerjoin(PlayerLoginEvent loginEvent) {
        Player player = loginEvent.getPlayer();
        UUID uuid = player.getUniqueId();
        int cdtime = plugin.getConfig().getInt(uuid + ".Cooldown_Left");
        if (cdtime == 0) {
            return;
        } else {
            plugin.zordcdtime.put(uuid, cdtime);
        }
    }

    @EventHandler
    public void playerquit(PlayerQuitEvent quitEvent) {
        Player player = quitEvent.getPlayer();
        UUID uuid = player.getUniqueId();
        plugin.getConfig().set(uuid + "Cooldown left", plugin.zordcdtime.get(uuid));
        plugin.saveConfig();
    }


    @EventHandler
    public void playerclick(PlayerInteractEvent clickEvent) {
        Action action = clickEvent.getAction();
        Player prightclick = clickEvent.getPlayer();
        float pitch = prightclick.getLocation().getPitch();
        float yaw = prightclick.getLocation().getYaw();
        Location lookloc = prightclick.getTargetBlock(null, 15).getLocation();
        double lookx = lookloc.getX();
        double looky = lookloc.getY();
        double lookz = lookloc.getZ();
        World world = prightclick.getWorld();
        String worldname = world.getName();
        Location teleloc = new Location(Bukkit.getWorld(worldname), lookx + 0, looky + 0, lookz + 0, yaw + 0, pitch + 0);
        UUID uuid = prightclick.getUniqueId();


        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            PlayerInventory inventory = prightclick.getInventory();
            if (prightclick.getInventory().getItemInMainHand().getType() != Material.IRON_SWORD) {
                return;
            }
            if (prightclick.getInventory().getItemInOffHand().getType() == Material.BOOK && prightclick.getInventory().getItemInMainHand().getType() == Material.IRON_SWORD) {
                List mainlore = inventory.getItemInMainHand().getItemMeta().getLore();
                List offlore = inventory.getItemInOffHand().getItemMeta().getLore();
                if (mainlore.contains("The previous wielder of this") && offlore.contains("This book keeps blinking!")) {
                    if (plugin.zordcdtime.containsKey(uuid)) {
                        return;
                    } else {
                        plugin.zordcdtime.put(uuid, plugin.zordcd);
                        prightclick.spawnParticle(Particle.FALLING_DUST, teleloc, 10, .5, 1, 0.5, 1);
                        prightclick.spawnParticle(Particle.REDSTONE, teleloc, 10, -.5, 1, -0.5, 2);
                        prightclick.spawnParticle(Particle.FIREWORKS_SPARK, teleloc, 10, 0, 2, 0, 1);
                        prightclick.teleport(teleloc);
                        prightclick.getWorld().playSound(prightclick.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1, 1);


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

