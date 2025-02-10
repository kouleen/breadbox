package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

/**
 * 当玩家游戏模式发生变化时调用此事件.
 * @author zhangqing
 * @since 2025/1/27 16:02
 */
@Component
public class PlayerGameModeChangeListener implements Listener {

    @EventHandler
    public void onPlayerGameModeChangeListener(PlayerGameModeChangeEvent playerGameModeChangeEvent){

    }
}
