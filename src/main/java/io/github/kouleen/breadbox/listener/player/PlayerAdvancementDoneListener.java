package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

/**
 * 玩家完成一个成就触发事件
 * @author zhangqing
 * @since 2025/1/27 15:15
 */
@Component
public class PlayerAdvancementDoneListener implements Listener {

    @EventHandler
    public void onPlayerAdvancementDoneListener(PlayerAdvancementDoneEvent playerAdvancementDoneEvent){

    }
}
