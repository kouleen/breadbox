package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreakDoorEvent;

/**
 * 当实体破坏门时触发本事件.
 * @author zhangqing
 * @since 2025/1/27 22:23
 */
@Component
public class EntityBreakDoorListener implements Listener {

    @EventHandler
    public void onEntityBreakDoorListener(EntityBreakDoorEvent entityBreakDoorEvent){

    }
}
