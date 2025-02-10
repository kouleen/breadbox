package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTameEvent;

/**
 * 用于处理实体被驯服相关事件的类。
 *  当游戏中的可驯服实体（如狼、鹦鹉等）被玩家成功驯服时，这个事件就会被触发。通过监听该事件，开发者可以自定义与实体驯服相关的逻辑。
 * @author zhangqing
 * @since 2025/1/28 20:54
 */
@Component
public class EntityTameListener implements Listener {

    @EventHandler
    public void onEntityTameListener(EntityTameEvent entityTameEvent){

    }
}
