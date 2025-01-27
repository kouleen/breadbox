package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;

/**
 * 当一个实体受到来自方块的伤害时触发该事件
 * @author zhangqing
 * @since 2025/1/27 22:34
 */
@Component
public class EntityDamageByBlockListener implements Listener {

    @EventHandler
    public void onEntityDamageByBlockListener(EntityDamageByBlockEvent entityDamageByBlockEvent){

    }
}
