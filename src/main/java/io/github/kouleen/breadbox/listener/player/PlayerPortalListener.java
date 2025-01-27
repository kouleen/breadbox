package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

/**
 * 玩家通过传送门或末地传送门时触发
 * 玩家进入或离开一个维度时，这个事件就会被调用‌
 * @author zhangqing
 * @since 2025/1/27 16:40
 */
@Component
public class PlayerPortalListener implements Listener {

    @EventHandler
    public void onPlayerPortalListener(PlayerPortalEvent playerPortalEvent){
        PlayerTeleportEvent.TeleportCause playerPortalEventCause = playerPortalEvent.getCause();


    }
}
