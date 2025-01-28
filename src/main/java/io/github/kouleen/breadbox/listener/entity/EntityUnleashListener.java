package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityUnleashEvent;

/**
 * 用于处理实体被“释放”相关的事件。
 *  不过需要注意的是，在常规的 Minecraft 游戏逻辑以及标准 Bukkit 环境中，这个事件使用场景相对不那么常见，不像其他一些如 EntityDamageEvent 等事件那样高频使用。
 * @author zhangqing
 * @since 2025/1/28 21:02
 */
@Component
public class EntityUnleashListener implements Listener {

    @EventHandler
    public void onEntityUnleashListener(EntityUnleashEvent entityUnleashEvent){

    }
}
