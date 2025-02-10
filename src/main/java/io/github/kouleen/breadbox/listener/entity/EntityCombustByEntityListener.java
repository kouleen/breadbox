package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustByEntityEvent;

/**
 * 当一个实体导致另一个实体燃烧时调用
 * @author zhangqing
 * @since 2025/1/27 22:29
 */
@Component
public class EntityCombustByEntityListener implements Listener {

    @EventHandler
    public void onEntityCombustByEntityListener(EntityCombustByEntityEvent entityCombustByEntityEvent){

    }
}
