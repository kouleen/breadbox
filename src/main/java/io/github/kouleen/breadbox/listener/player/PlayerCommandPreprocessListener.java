package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

/**
 * 玩家在聊天框里面输入信息以/开头的时候触发此事件
 * @author zhangqing
 * @since 2025/1/27 15:37
 */
@Component
public class PlayerCommandPreprocessListener implements Listener {

    @EventHandler
    public void onPlayerCommandPreprocessListener(PlayerCommandPreprocessEvent playerCommandPreprocessEvent){

    }
}
