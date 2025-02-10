package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;

/**
 * 它用于处理投掷型药水溅射相关的情况。
 *  当一个投掷型药水在世界中溅射到某个位置时，就会触发 PotionSplashEvent 事件。
 *  借助这个事件，插件开发者能够对药水溅射时的行为进行干预和定制，例如修改药水效果、调整受影响的实体等。
 * @author zhangqing
 * @since 2025/1/28 21:35
 */
@Component
public class PotionSplashListener implements Listener {

    @EventHandler
    public void onPotionSplashListener(PotionSplashEvent potionSplashEvent){

    }
}
