package io.github.kouleen.breadbox.listener.weather;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.LightningStrikeEvent;

/**
 * 当闪电在游戏世界中击中某个位置时，这个事件就会被触发，
 *  它在 Minecraft 服务器中用于处理闪电击中事件。
 *  当闪电在游戏世界中击中某个位置时，这个事件就会被触发
 * @author zhangqing
 * @since 2025/1/28 22:33
 */
@Component
public class LightningStrikeListener implements Listener {

    @EventHandler
    public void onLightningStrikeListener(LightningStrikeEvent lightningStrikeEvent){

    }
}
