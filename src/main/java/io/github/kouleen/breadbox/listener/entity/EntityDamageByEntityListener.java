package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

/**
 * 当一个实体受到另外一个实体伤害时触发该事件
 * @author zhangqing
 * @since 2025/1/27 22:35
 */
@Component
public class EntityDamageByEntityListener implements Listener {

    @EventHandler
    public void onEntityDamageByEntityListener(EntityDamageByEntityEvent entityDamageByEntityEvent){

    }
}
