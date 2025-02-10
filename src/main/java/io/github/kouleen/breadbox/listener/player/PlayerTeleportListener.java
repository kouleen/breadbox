package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

/**
 * 玩家传送事件.
 * @author zhangqing
 * @since 2025/1/27 17:02
 */
@Component
public class PlayerTeleportListener implements Listener {

    @EventHandler
    public void onPlayerTeleportListener(PlayerTeleportEvent playerTeleportEvent){
        Player player = playerTeleportEvent.getPlayer();
        Location locationFrom = playerTeleportEvent.getFrom();
        Location locationTo = playerTeleportEvent.getTo();
        PlayerTeleportEvent.TeleportCause playerTeleportEventCause = playerTeleportEvent.getCause();

    }
}
