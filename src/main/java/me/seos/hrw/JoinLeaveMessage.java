package me.seos.hrw;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveMessage implements Listener {

    @EventHandler
    public void OnPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.YELLOW + player.getName() + ChatColor.YELLOW + " has connected");
    }

    @EventHandler
    public void OnPlayerQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.YELLOW + player.getName() + ChatColor.YELLOW + " has disconnected");
    }

}
