package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

/**
 * 玩家尝试登录服务器的事件
 * @author zhangqing
 * @since 2025/1/27 15:13
 */
@Component
public class AsyncPlayerPreLoginListener implements Listener {

    @EventHandler
    public void onAsyncPlayerPreLoginListener(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent){

    }
}
