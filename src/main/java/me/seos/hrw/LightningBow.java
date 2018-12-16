package me.seos.hrw;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Pumpkin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.List;
import java.util.UUID;

public class LightningBow implements Listener {

    public UUID uuid;
    public UUID uuid1;
    public UUID uuid2;
    public UUID uuid3;


    @EventHandler
    public void arrowland(EntityShootBowEvent event) {

        ItemStack Bow = event.getBow();
        ItemStack bow = event.getBow();
        ItemMeta bowmeta = bow.getItemMeta();

        if (!bowmeta.hasLore()) {
            return;
        }

        if (bowmeta.hasLore()) {
            List bowlore = bowmeta.getLore();
            if (bowlore.contains(ChatColor.GREEN + "- Shoots Spectres")) {
                Vector arrowvel = event.getProjectile().getVelocity();
                Location arrowloc = event.getProjectile().getLocation();
                World arrowworld = event.getProjectile().getWorld();
                event.setProjectile(null);
                LivingEntity mob = (LivingEntity) arrowworld.spawnEntity(arrowloc, EntityType.CREEPER);
                Creeper nep = (Creeper) mob;
                String nepname = new String(ChatColor.BOLD.toString() + ChatColor.RED.toString() + "Nepenthes");
                nep.setCustomName(nepname);
                nep.setPowered(true);
                nep.setCustomNameVisible(true);
                nep.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 2000, 0, false, false));
                nep.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 2000, 1, false, false));
                nep.setFireTicks(-1);
                nep.setVelocity(arrowvel);
            }

            if (bowlore.contains("Mimic a Dragon")) {
                LivingEntity entity = event.getEntity();
                Player player = (Player) entity;
                Vector arrowvel = event.getProjectile().getVelocity();
                Location arrowloc = event.getProjectile().getLocation();
                World arrowworld = event.getProjectile().getWorld();
                event.setProjectile(null);
                double x = arrowloc.getX();
                double y = arrowloc.getY();
                double z = arrowloc.getZ();
                Location spawnAt = player.getEyeLocation().toVector().add(player.getEyeLocation().getDirection().multiply(2)).toLocation(player.getWorld());
                Fireball fireball = player.getWorld().spawn(spawnAt, Fireball.class);
                fireball.setDirection(arrowvel);
                fireball.setBounce(false);
                fireball.setIsIncendiary(false);
            }

            if (bowlore.contains("Condensed Shulker Essence")) {
                uuid = event.getProjectile().getUniqueId();
            }
            if (bowlore.contains(ChatColor.GREEN + "- Cripples The Enemy")) {
                uuid1 = event.getProjectile().getUniqueId();
            }
            if (bowlore.contains(ChatColor.GREEN + "- Shoots Regeneration Arrows")) {
                uuid2 = event.getProjectile().getUniqueId();
            }
            if (bowlore.contains("A poet is someone who stands outside in")) {
                uuid3 = event.getProjectile().getUniqueId();

            } else {
                return;
            }
        } else {
            return;
        }
    }


    @EventHandler
    public void arrowland(ProjectileHitEvent event) {
        if (event.getEntity() instanceof Arrow) {
            Entity arrow = event.getEntity();
            UUID euuid = event.getEntity().getUniqueId();
            Entity entity = event.getHitEntity();
            Block block = event.getHitBlock();
            if (entity == null) {
                if (euuid.equals(uuid3)) {
                    if (euuid.equals(uuid3)) {
                        World world = block.getWorld();
                        if (world.hasStorm()) {
                            int i = 0;
                            for (i = 0; i<5; i++){
                                Location location = block.getLocation();
                                world.strikeLightning(location);
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (entity instanceof Player) {
                Player dp = (Player) entity;
                if (euuid.equals(uuid)) {
                    dp.removePotionEffect(PotionEffectType.LEVITATION);
                    dp.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 8, false, true));
                }
                if (euuid.equals(uuid1)) {
                    dp.removePotionEffect(PotionEffectType.WEAKNESS);
                    dp.removePotionEffect(PotionEffectType.SLOW);
                    dp.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 40, 1, false, true));
                    dp.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 1, false, true));
                }
                if (euuid.equals(uuid2)) {
                    dp.removePotionEffect(PotionEffectType.REGENERATION);
                    dp.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 2, false, true));
                }
                if (euuid.equals(uuid3)) {
                    World world = dp.getWorld();
                    if (world.hasStorm()) {
                        int i = 0;
                        for (i = 0; i < 5; i++) {
                            Location location = dp.getLocation();
                            world.strikeLightning(location);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }

            }

            if (entity instanceof LivingEntity) {
                LivingEntity dp = (LivingEntity) entity;
                if (euuid.equals(uuid)) {
                    dp.removePotionEffect(PotionEffectType.LEVITATION);
                    dp.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 8, false, true));
                }
                if (euuid.equals(uuid1)) {
                    dp.removePotionEffect(PotionEffectType.WEAKNESS);
                    dp.removePotionEffect(PotionEffectType.SLOW);
                    dp.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 40, 1, false, true));
                    dp.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 1, false, true));
                }
                if (euuid.equals(uuid2)) {
                    dp.removePotionEffect(PotionEffectType.REGENERATION);
                    dp.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 2, false, true));
                }
                if (euuid.equals(uuid3)) {
                    World world = dp.getWorld();
                    if (world.hasStorm()) {
                        int i;
                        for (i = 0; i < 5; i++) {
                            Location location = dp.getLocation();
                            world.strikeLightning(location);
                        }
                    }
                } else {
                    return;
                }
            }

        } else {
            return;
        }
    }
}
