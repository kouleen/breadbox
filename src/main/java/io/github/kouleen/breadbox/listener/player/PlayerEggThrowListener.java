package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

/**
 * 玩家抛出鸡蛋时触发本事件，鸡蛋可能孵化.
 * @author zhangqing
 * @since 2025/1/27 15:45
 */
@Component
public class PlayerEggThrowListener implements Listener {

    @EventHandler
    public void onPlayerEggThrowListener(PlayerEggThrowEvent playerEggThrowEvent){

    }
}
