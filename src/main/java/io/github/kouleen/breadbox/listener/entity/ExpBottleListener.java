package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

/**
 * 用于处理经验瓶相关事件的类。
 *  当玩家扔出一个经验瓶时，这个事件就会被触发。这使得开发者可以在玩家使用经验瓶这个行为发生时进行一些自定义的操作或逻辑处理
 * @author zhangqing
 * @since 2025/1/28 21:03
 */
@Component
public class ExpBottleListener implements Listener {

    @EventHandler
    public void onExpBottleListener(ExpBottleEvent expBottleEvent){

    }
}
