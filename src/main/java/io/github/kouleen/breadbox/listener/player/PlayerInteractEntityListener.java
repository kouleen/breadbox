package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

/**
 * 当玩家点击一个实体时调用此事件.
 * @author zhangqing
 * @since 2025/1/27 16:18
 */
@Component
public class PlayerInteractEntityListener implements Listener {

    @EventHandler
    public void onPlayerInteractEntityListener(PlayerInteractEntityEvent playerInteractEntityEvent){

    }
}
