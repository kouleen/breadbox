package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCreatePortalEvent;

/**
 * 当某个实体（如玩家或怪物）尝试在世界中创建传送门时，这个事件会被触发。
 * @author zhangqing
 * @since 2025/1/27 22:31
 */
@Component
public class EntityCreatePortalListener implements Listener {

    @EventHandler
    public void onEntityCreatePortalListener(EntityCreatePortalEvent entityCreatePortalEvent){

    }
}
