package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRegisterChannelEvent;

/**
 * 玩家注册频道时触发
 * 通常用于在插件中处理玩家注册频道的行为。
 * @author zhangqing
 * @since 2025/1/27 16:49
 */
@Component
public class PlayerRegisterChannelListener implements Listener {

    @EventHandler
    public void onPlayerRegisterChannelListener(PlayerRegisterChannelEvent playerRegisterChannelEvent){

    }
}
