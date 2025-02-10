package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;

/**
 * 当一个实体与另一个实体繁殖时调用
 * @author zhangqing
 * @since 2025/1/27 22:26
 */
@Component
public class EntityBreedListener implements Listener {

    @EventHandler
    public void onEntityBreedListener(EntityBreedEvent entityBreedEvent){

    }
}
