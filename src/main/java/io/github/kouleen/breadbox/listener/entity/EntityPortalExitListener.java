package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalExitEvent;

/**
 * 用于处理实体离开传送门相关事件的类。
 *  当游戏中的实体（如玩家、怪物、动物等）从传送门中出来时，这个事件就会被触发。通过监听此事件，开发者能够在实体离开传送门的时刻执行特定的操作。
 * @author zhangqing
 * @since 2025/1/28 20:32
 */
@Component
public class EntityPortalExitListener implements Listener {

    @EventHandler
    public void onEntityPortalExitListener(EntityPortalExitEvent entityPortalExitEvent){

    }
}
