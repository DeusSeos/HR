package me.seos.hrw;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Utils {
    protected static boolean itemExists(ItemStack itemStack){
        return (itemStack != null) || (itemStack.getType() != Material.AIR);
    }
}
