package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

/**
 * 玩家丢出物品事件.
 * @author zhangqing
 * @since 2025/1/27 15:43
 */
@Component
public class PlayerDropItemListener implements Listener {

    @EventHandler
    public void onPlayerDropItemListener(PlayerDropItemEvent playerDropItemEvent){

    }
}
