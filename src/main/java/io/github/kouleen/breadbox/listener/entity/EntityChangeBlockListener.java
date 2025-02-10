package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

/**
 * 当任何实体（不包括玩家）更改块时调用
 * @author zhangqing
 * @since 2025/1/27 22:28
 */
@Component
public class EntityChangeBlockListener implements Listener {

    @EventHandler
    public void onEntityChangeBlockListener(EntityChangeBlockEvent entityChangeBlockEvent){

    }
}
