package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;

/**
 * 当实体燃烧时触发该事件
 * @author zhangqing
 * @since 2025/1/27 22:30
 */
@Component
public class EntityCombustListener implements Listener {

    @EventHandler
    public void onEntityCombustListener(EntityCombustEvent entityCombustEvent){

    }
}
