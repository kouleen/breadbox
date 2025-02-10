package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;

/**
 * 用于处理实体切换滑翔状态相关事件的类。
 *  当游戏中的实体（主要是玩家在持有鞘翅时）开启或关闭滑翔状态时，这个事件就会被触发。
 * @author zhangqing
 * @since 2025/1/28 21:00
 */
@Component
public class EntityToggleGlideListener implements Listener {

    @EventHandler
    public void onEntityToggleGlideListener(EntityToggleGlideEvent entityToggleGlideEvent){

    }
}
