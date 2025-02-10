package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * 玩家进入服务器事件
 * @author zhangqing
 * @since 2025/1/27 10:52
 */
@Component
public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoinListener(PlayerJoinEvent playerJoinEvent){

    }
}
