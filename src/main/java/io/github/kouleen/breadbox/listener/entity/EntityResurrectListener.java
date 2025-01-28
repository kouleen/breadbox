package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;

/**
 * 中用于处理实体复活相关事件的类。
 *  当游戏中的实体（如玩家、怪物、动物等）复活时，该事件会被触发，这为开发者提供了在实体复活过程中进行自定义干预的机会
 * @author zhangqing
 * @since 2025/1/28 20:37
 */
@Component
public class EntityResurrectListener implements Listener {

    @EventHandler
    public void onEntityResurrectListener(EntityResurrectEvent entityResurrectEvent){

    }
}
