package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;

/**
 * 处理实体将目标锁定为活体实体（LivingEntity）这一行为的事件类。
 *  该事件在一个实体将另一个活体实体作为目标时触发，相较于 EntityTargetEvent，它更专注于目标为活体实体的情况，这对于处理涉及到攻击、追踪等针对活体目标的场景非常有用。
 * @author zhangqing
 * @since 2025/1/28 20:57
 */
@Component
public class EntityTargetLivingEntityListener implements Listener {

    @EventHandler
    public void onEntityTargetLivingEntityListener(EntityTargetLivingEntityEvent entityTargetLivingEntityEvent){

    }
}
