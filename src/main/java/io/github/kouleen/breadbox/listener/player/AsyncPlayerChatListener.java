package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * 当玩家聊天时触发这个事件
 * @author zhangqing
 * @since 2025/1/27 15:10
 */
@Component
public class AsyncPlayerChatListener implements Listener {

    @EventHandler
    public void onAsyncPlayerChatListener(AsyncPlayerChatEvent asyncPlayerChatEvent){

    }
}
