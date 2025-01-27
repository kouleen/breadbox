package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

/**
 * 当玩家切换到另一个世界时触发此事件.
 * @author zhangqing
 * @since 2025/1/27 15:31
 */
@Component
public class PlayerChangedWorldListener implements Listener {

    @EventHandler
    public void onPlayerChangedWorldListener(PlayerChangedWorldEvent playerChangedWorldEvent){

    }
}
