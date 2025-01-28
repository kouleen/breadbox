package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

/**
 * 用于处理实体目标选择相关事件的类。
 *  当一个实体（如怪物）选择另一个实体（目标）作为其攻击目标、追踪目标等情况时，这个事件就会被触发。通过监听此事件，开发者可以自定义实体选择目标的行为。
 * @author zhangqing
 * @since 2025/1/28 20:55
 */
@Component
public class EntityTargetListener implements Listener {

    @EventHandler
    public void onEntityTargetListener(EntityTargetEvent entityTargetEvent){

    }
}
