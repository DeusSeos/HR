package me.seos.hrw;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("test")) {
            Player player = (Player) sender;
            if (!sender.hasPermission("Hrw.koth")) {
                sender.sendMessage(ChatColor.RED + "You do not have access to this command.");
            }
            if (args.length < 1) {

                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("board")) {
                        ScoreboardManager manager = Bukkit.getScoreboardManager();
                        Scoreboard scoreboard = manager.getNewScoreboard();
                        scoreboard.registerNewObjective("test", "dummy");
                        Objective objective = scoreboard.getObjective("test");
                        objective.setDisplayName(ChatColor.GREEN + "King of the Hill");
                        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
                        player.setScoreboard(scoreboard);

                    }

                    if (args[0].equalsIgnoreCase("up")) {
                        ScoreboardManager manager = Bukkit.getScoreboardManager();
                        Scoreboard scoreboard = manager.getMainScoreboard();
                        Objective objective = scoreboard.getObjective("test");
                        Score score = objective.getScore(player.getName());
                        score.setScore(score.getScore()+1);
                        player.setScoreboard(scoreboard);

                    }

                    else {
                        return true;
                    }
                }

                return true;
            }
            return true;
        }
        return true;
    }
}
