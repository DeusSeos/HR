package me.seos.hrw;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scoreboard.*;

import java.util.UUID;

public class Koth implements CommandExecutor {

    private Hrw plugin = Hrw.getPlugin(Hrw.class);

    @EventHandler
    public void playerjoin(PlayerLoginEvent loginEvent) {
        Player player = loginEvent.getPlayer();
        String name = player.getName();
        plugin.toggle.put(name, false);
    }

    @EventHandler
    public void playerquit(PlayerQuitEvent quitEvent) {
        Player player = quitEvent.getPlayer();
        String name = player.getName();
        plugin.toggle.remove(name);
    }


    @SuppressWarnings("deprecation")
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("koth")) {

            if (!sender.hasPermission("HRW.koth")) {
                sender.sendMessage(ChatColor.RED + "You do not have access to this command.");
            }

            if (args.length < 1) {
                sender.sendMessage(ChatColor.LIGHT_PURPLE + "KotH Commands");
                sender.sendMessage(ChatColor.GREEN + "Start Koth Event || /koth start");
                sender.sendMessage(ChatColor.GREEN + "End Koth Event   || /koth end");
                sender.sendMessage(ChatColor.GREEN + "Set Rewards      || /koth rewards");
                sender.sendMessage(ChatColor.GREEN + "Display Top 10   || /koth board");

            } else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("start")) {
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.sendTitle(ChatColor.GREEN + "King of the Hill", ChatColor.LIGHT_PURPLE + "Starts in 5 minutes", 10, 60, 10);
                        Bukkit.getScheduler().runTaskLater(plugin, () -> player.sendTitle(ChatColor.GREEN + "King of the Hill", ChatColor.LIGHT_PURPLE + "Starts in 1 minute", 10, 60, 10), 4800); //20 ticks equal 1 second
                        Bukkit.getScheduler().runTaskLater(plugin, () -> player.sendTitle(ChatColor.GREEN + "King of the Hill", ChatColor.GREEN + "has begun!", 10, 60, 10), 6000); //20 ticks equal 1 second
                        //Bukkit.getScheduler().runTaskLater(plugin, () -> plugin.isActive = true, 6000); //20 ticks equal 1 second
                    }
                    plugin.isActive = true;
                }
                if (args[0].equalsIgnoreCase("end")) {
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.sendTitle(ChatColor.GREEN + "King of the Hill", ChatColor.LIGHT_PURPLE + "Has ended.", 10, 40, 10);
                    }
                    plugin.isActive = false;
                }
                if (args[0].equalsIgnoreCase("show")) {
                    Player player = (Player) sender;
                    Boolean toggle = plugin.toggle.get(player.getName());
                    if ((toggle == null) || !toggle) {
                        plugin.toggle.put(player.getName(), true);
                    }
                    else {
                        plugin.toggle.put(player.getName(), false);
                        player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
                    }
                }
            }
            return true;
        }
        return true;
    }
}
