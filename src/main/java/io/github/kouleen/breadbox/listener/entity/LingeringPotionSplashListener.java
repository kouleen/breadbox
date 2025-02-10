package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.LingeringPotionSplashEvent;

/**
 * 用于处理与滞留型药水溅射相关的事件
 *  当一个滞留型药水在世界中溅射时，就会触发LingeringPotionSplashEvent事件。
 *  这个事件允许插件开发者在滞留型药水溅射时执行特定的操作，例如修改药水效果、获取受影响的实体等。
 * @author zhangqing
 * @since 2025/1/28 21:21
 */
@Component
public class LingeringPotionSplashListener implements Listener {

    @EventHandler
    public void onLingeringPotionSplashListener(LingeringPotionSplashEvent lingeringPotionSplashEvent){

    }
}
