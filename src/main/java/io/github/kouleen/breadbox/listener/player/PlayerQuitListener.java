package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * 玩家离开服务器事件.
 * @author zhangqing
 * @since 2025/1/27 16:44
 */
@Component
public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onPlayerQuitListener(PlayerQuitEvent playerQuitEvent){

    }
}
