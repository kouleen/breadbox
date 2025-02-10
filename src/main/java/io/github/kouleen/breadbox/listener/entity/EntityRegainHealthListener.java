package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

/**
 *  用于处理实体恢复生命值相关事件的类。
 *      当游戏中的实体（如玩家、怪物、动物等）恢复生命值时，这个事件就会被触发，开发者可以利用这个事件来实现各种与实体生命值恢复相关的自定义逻辑
 * @author zhangqing
 * @since 2025/1/28 20:35
 */
@Component
public class EntityRegainHealthListener implements Listener {

    @EventHandler
    public void onEntityRegainHealthListener(EntityRegainHealthEvent entityRegainHealthEvent){

    }
}
