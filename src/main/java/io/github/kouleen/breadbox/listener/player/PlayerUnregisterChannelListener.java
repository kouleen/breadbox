package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerUnregisterChannelEvent;

/**
 * 当玩家注销频道时触发事件.
 * @author zhangqing
 * @since 2025/1/27 17:11
 */
@Component
public class PlayerUnregisterChannelListener implements Listener {

    @EventHandler
    public void onPlayerUnregisterChannelListener(PlayerUnregisterChannelEvent playerUnregisterChannelEvent){

    }
}
