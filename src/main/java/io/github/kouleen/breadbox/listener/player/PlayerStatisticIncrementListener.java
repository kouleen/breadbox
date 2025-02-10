package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;

/**
 * 当玩家统计信息增长时触发本事件.
 * @author zhangqing
 * @since 2025/1/27 17:00
 */
@Component
public class PlayerStatisticIncrementListener implements Listener {

    @EventHandler
    public void onPlayerStatisticIncrementListener(PlayerStatisticIncrementEvent playerStatisticIncrementEvent){

    }
}
