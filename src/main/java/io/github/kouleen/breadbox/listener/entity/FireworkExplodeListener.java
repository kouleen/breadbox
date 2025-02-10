package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FireworkExplodeEvent;

/**
 * 用于处理烟花爆炸事件的类。
 *  当游戏中的烟花爆炸时，这个事件会被触发，允许开发者对烟花爆炸这一行为进行自定义的响应和操作
 * @author zhangqing
 * @since 2025/1/28 21:06
 */
@Component
public class FireworkExplodeListener implements Listener {

    @EventHandler
    public void onFireworkExplodeListener(FireworkExplodeEvent fireworkExplodeEvent){

    }
}
