package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTeleportEvent;

/**
 * 用于处理实体传送相关事件的类。
 *  当游戏中的实体（如玩家、怪物等）进行传送操作时，该事件会被触发。通过监听这个事件，开发者可以对实体传送行为进行自定义控制和处理。
 * @author zhangqing
 * @since 2025/1/28 20:58
 */
@Component
public class EntityTeleportListener implements Listener {

    @EventHandler
    public void onEntityTeleportListener(EntityTeleportEvent entityTeleportEvent){

    }
}
