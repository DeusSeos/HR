package me.seos.hrw;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EatFlower implements Listener {

    @EventHandler
    public void rightclickEvent(PlayerInteractEvent e) {
        Player eater = e.getPlayer();
        Action clicktype = e.getAction();
        if (clicktype == Action.RIGHT_CLICK_AIR || clicktype == Action.RIGHT_CLICK_BLOCK) {
            ItemStack flowermain = eater.getInventory().getItemInMainHand();
            int mainslot = eater.getInventory().getHeldItemSlot();
            ItemStack eaterinv = eater.getInventory().getItem(mainslot);
            if (eaterinv == null || !eaterinv.hasItemMeta()){
                return;
            }
            if (flowermain.hasItemMeta()) {
                ItemMeta flowermeta = flowermain.getItemMeta();
                Integer stacksize = eaterinv.getAmount();
                if(flowermeta.getLore().contains("Test")) {
                    eaterinv.setAmount(stacksize-1);
                    eater.getInventory().setItem(mainslot, eaterinv);
                    eater.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 2, true, true));
                    e.setCancelled(true);
                }
                else {
                    return;
                }
            }
            else{
                return;
            }
        }
        else {
            return;
        }
    }
}
