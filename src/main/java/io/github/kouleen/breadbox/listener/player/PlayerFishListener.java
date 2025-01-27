package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

/**
 * 当玩家钓鱼时触发本事件.
 * @author zhangqing
 * @since 2025/1/27 16:00
 */
@Component
public class PlayerFishListener implements Listener {

    @EventHandler
    public void onPlayerFishListener(PlayerFishEvent playerFishEvent){

    }
}
