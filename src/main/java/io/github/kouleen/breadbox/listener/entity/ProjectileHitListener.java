package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

/**
 * 用于处理抛射物击中目标相关情况的事件类。
 *  当一个抛射物（如箭、雪球、鸡蛋等）击中某个目标（可以是实体，也可以是方块）时，就会触发 ProjectileHitEvent 事件。
 *  通过监听这个事件，开发者可以实现诸如修改抛射物击中后的效果、记录击中信息、阻止特定抛射物的击中行为等功能。
 * @author zhangqing
 * @since 2025/1/28 21:37
 */
@Component
public class ProjectileHitListener implements Listener {

    @EventHandler
    public void onProjectileHitListener(ProjectileHitEvent projectileHitEvent){

    }
}
