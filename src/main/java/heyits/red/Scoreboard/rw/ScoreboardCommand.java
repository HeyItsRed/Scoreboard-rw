package heyits.red.Scoreboard.rw;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.CommandSender;

public class ScoreboardCommand extends Command {
    public ScoreboardCommand() {
        super("sb");
    };
    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        commandSender.sendMessage(new ComponentBuilder("Scoreboard Plugin Loaded").color(ChatColor.GREEN).create());
    }
};


