package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;

/**
 * 玩家切换飞行状态则调用此事件.
 * @author zhangqing
 * @since 2025/1/27 17:06
 */
@Component
public class PlayerToggleFlightListener implements Listener {

    @EventHandler
    public void onPlayerToggleFlightListener(PlayerToggleFlightEvent playerToggleFlightEvent){

    }
}
