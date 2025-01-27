package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;

/**
 * 玩家在聊天界面中输入文本并按下Tab键时触发事件
 * @author zhangqing
 * @since 2025/1/27 15:36
 */
@Component
public class PlayerChatTabCompleteListener implements Listener {

    @EventHandler
    public void onPlayerChatTabCompleteListener(PlayerChatTabCompleteEvent playerChatTabCompleteEvent){

    }
}
