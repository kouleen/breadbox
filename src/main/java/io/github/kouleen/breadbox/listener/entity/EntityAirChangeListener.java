package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityAirChangeEvent;

/**
 * 用于处理实体进入或离开空气方块时的事件。
 *  当实体（如玩家、生物或物品）从一个非空气方块移动到一个空气方块，
 *  或者从一个空气方块移动到一个非空气方块时，这个事件会被触发
 * @author zhangqing
 * @since 2025/1/27 22:22
 */
@Component
public class EntityAirChangeListener implements Listener {

    @EventHandler
    public void onEntityAirChangeListener(EntityAirChangeEvent entityAirChangeEvent){

    }
}
