package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExplosionPrimeEvent;

/**
 * 用于处理实体引发爆炸前相关事件的类。
 *  当一个实体（例如苦力怕、TNT 等）即将发生爆炸时，该事件会被触发。这为开发者提供了在爆炸实际发生之前干预和控制爆炸行为的机会。
 * @author zhangqing
 * @since 2025/1/28 21:05
 */
@Component
public class ExplosionPrimeListener implements Listener {

    @EventHandler
    public void onExplosionPrimeListener(ExplosionPrimeEvent explosionPrimeEvent){

    }
}
