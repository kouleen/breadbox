package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;

/**
 * 玩家切换疾跑状态时调用此事件
 * @author zhangqing
 * @since 2025/1/27 17:07
 */
@Component
public class PlayerToggleSprintListener implements Listener {

    @EventHandler
    public void onPlayerToggleSprintListener(PlayerToggleSprintEvent playerToggleSprintEvent){

    }
}
