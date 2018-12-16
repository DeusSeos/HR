package me.seos.hrw;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatChanger implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void chatevent (AsyncPlayerChatEvent event){
        Player p = event.getPlayer();
        String pname = p.getDisplayName();

        event.setFormat(pname + ": " +  event.getMessage());

    }
}
