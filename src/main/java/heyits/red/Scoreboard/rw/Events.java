package heyits.red.Scoreboard.rw;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.protocol.packet.ScoreboardDisplay;
import net.md_5.bungee.protocol.packet.ScoreboardObjective;
import net.md_5.bungee.protocol.packet.ScoreboardScore;

public class Events implements Listener {
    @EventHandler
    public void onPostLogin(PostLoginEvent event) {
        ProxiedPlayer p = event.getPlayer();
        ScoreboardObjective objective = new ScoreboardObjective("ScoreboardName", "Title", ScoreboardObjective.HealthDisplay.HEARTS, (byte) 0); //Create new scoreboard
        p.unsafe().sendPacket(objective);
        ScoreboardScore score = new ScoreboardScore("Line 1", (byte) 0, "ScoreboardName", 0); //Add a line to designated Scoreboard
        p.unsafe().sendPacket(score);
        ScoreboardDisplay display = new ScoreboardDisplay((byte) 1, "ScoreboardName"); //Display designated Scoreboard
        p.unsafe().sendPacket(display);
    }
}

