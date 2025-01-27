package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedMainHandEvent;

/**
 * 当玩家在客户端设置改变主手时触发本事件.
 * @author zhangqing
 * @since 2025/1/27 15:30
 */
@Component
public class PlayerChangedMainHandListener implements Listener {

    @EventHandler
    public void onPlayerChangedMainHandListener(PlayerChangedMainHandEvent playerChangedMainHandEvent){

    }
}
