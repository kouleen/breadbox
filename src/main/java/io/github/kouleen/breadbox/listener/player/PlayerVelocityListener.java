package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerVelocityEvent;

/**
 * 玩家移动速度变化事件.
 * @author zhangqing
 * @since 2025/1/27 17:12
 */
@Component
public class PlayerVelocityListener implements Listener {

    @EventHandler
    public void onPlayerVelocityListener(PlayerVelocityEvent playerVelocityEvent){

    }
}
