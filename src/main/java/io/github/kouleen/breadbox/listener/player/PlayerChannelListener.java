package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChannelEvent;

/**
 * 当玩家加入或离开频道‌触发本事件
 * @author zhangqing
 * @since 2025/1/27 15:32
 */
@Component
public class PlayerChannelListener implements Listener {

    @EventHandler
    public void onPlayerChannelListener(PlayerChannelEvent playerChannelEvent){

    }
}
