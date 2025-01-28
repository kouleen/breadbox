package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;

/**
 * 当一个非玩家的实体被传送门传送时触发本事件
 * @author zhangqing
 * @since 2025/1/28 20:31
 */
@Component
public class EntityPortalListener implements Listener {

    @@EventHandler
    public void onEntityPortalListener(EntityPortalEvent entityPortalEvent){

    }
}
