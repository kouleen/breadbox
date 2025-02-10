package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEnterEvent;

/**
 *  当一个实体与传送门接触时触发本事件.
 * @author zhangqing
 * @since 2025/1/28 20:29
 */
@Component
public class EntityPortalEnterListener implements Listener {

    @EventHandler
    public void onEntityPortalEnterListener(EntityPortalEnterEvent entityPortalEnterEvent){

    }
}
