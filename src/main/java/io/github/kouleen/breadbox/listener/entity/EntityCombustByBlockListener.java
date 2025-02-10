package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustByBlockEvent;

/**
 * 当方块导致实体燃烧时调用
 * @author zhangqing
 * @since 2025/1/27 22:28
 */
@Component
public class EntityCombustByBlockListener implements Listener {

    @EventHandler
    public void onEntityCombustByBlockListener(EntityCombustByBlockEvent entityCombustByBlockEvent){

    }
}
