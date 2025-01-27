package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

/**
 * 玩家重生事件.
 * @author zhangqing
 * @since 2025/1/27 16:56
 */
@Component
public class PlayerRespawnListener implements Listener {

    @EventHandler
    public void onPlayerRespawnListener(PlayerRespawnEvent playerRespawnEvent){

    }
}
