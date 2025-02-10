package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

/**
 * 玩家等级改变事件
 * @author zhangqing
 * @since 2025/1/27 16:34
 */
@Component
public class PlayerLevelChangeListener implements Listener {

    @EventHandler
    public void onPlayerLevelChangeListener(PlayerLevelChangeEvent playerLevelChangeEvent){

    }
}
