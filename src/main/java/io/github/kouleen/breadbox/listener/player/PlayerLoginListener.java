package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * 玩家尝试登录的事件.
 * @author zhangqing
 * @since 2025/1/27 16:36
 */
@Component
public class PlayerLoginListener implements Listener {

    @EventHandler
    public void onPlayerLoginListener(PlayerLoginEvent playerLoginEvent){

    }
}
