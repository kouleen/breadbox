package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

/**
 * 玩家被服务器踢出事件.
 * @author zhangqing
 * @since 2025/1/27 16:34
 */
@Component
public class PlayerKickListener implements Listener {

    @EventHandler
    public void onPlayerKickListener(PlayerKickEvent playerKickEvent){

    }
}
