package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.HorseJumpEvent;

/**
 * 用于处理马匹跳跃相关事件的类。
 *  当游戏中的马进行跳跃动作时，该事件会被触发，开发者可以利用这个事件来实现一些与马跳跃相关的自定义功能。
 * @author zhangqing
 * @since 2025/1/28 21:11
 */
@Component
public class HorseJumpListener implements Listener {

    @EventHandler
    public void onHorseJumpListener(HorseJumpEvent horseJumpEvent){

    }
}
