package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

/**
 * 玩家离开床时触发此事件
 * @author zhangqing
 * @since 2025/1/27 15:20
 */
@Component
public class PlayerBedLeaveListener implements Listener {

    @EventHandler
    public void onPlayerBedLeaveListener(PlayerBedLeaveEvent playerBedLeaveEvent){

    }
}
