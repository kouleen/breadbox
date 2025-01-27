package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupArrowEvent;

/**
 * 当玩家从地上捡起箭时触发本事件.
 * @author zhangqing
 * @since 2025/1/27 16:38
 */
@Component
public class PlayerPickupArrowListener implements Listener {

    @EventHandler
    public void onPlayerPickupArrowListener(PlayerPickupArrowEvent playerPickupArrowEvent){

    }
}
