package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerUnleashEntityEvent;

/**
 * 当一个实体被玩家解开拴绳时调用.
 * @author zhangqing
 * @since 2025/1/27 17:08
 */
@Component
public class PlayerUnleashEntityListener implements Listener {

    @EventHandler
    public void onPlayerUnleashEntityListener(PlayerUnleashEntityEvent playerUnleashEntityEvent){

    }
}
