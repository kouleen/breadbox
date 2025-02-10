package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

/**
 * 用于处理抛射物发射相关的事件。
 *  当一个抛射物（如箭、雪球、鸡蛋、三叉戟等）被发射时，就会触发 ProjectileLaunchEvent 事件。
 *  借助这个事件，开发者可以实现诸如阻止抛射物发射、修改抛射物属性（如速度、方向、伤害值等）、记录发射信息等功能。
 * @author zhangqing
 * @since 2025/1/28 21:39
 */
@Component
public class ProjectileLaunchListener implements Listener {

    @EventHandler
    public void onProjectileLaunchListener(ProjectileLaunchEvent projectileLaunchEvent){

    }
}
