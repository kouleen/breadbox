package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

/**
 * 当玩家经验值发生变化时调用此事件.
 * @author zhangqing
 * @since 2025/1/27 15:57
 */
@Component
public class PlayerExpChangeListener implements Listener {

    @EventHandler
    public void onPlayerExpChangeListener(PlayerExpChangeEvent playerExpChangeEvent){

    }
}
