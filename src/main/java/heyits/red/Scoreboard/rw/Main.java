package heyits.red.Scoreboard.rw;

import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {
    @Override
    public void onEnable() {
        // You should not put an enable message in your plugin.
        // BungeeCord already does so
        getLogger().info("Yay! It loads!");
        getProxy().getPluginManager().registerCommand(this, new ScoreboardCommand());
        getProxy().getPluginManager().registerListener(this, new Events());
    }
}