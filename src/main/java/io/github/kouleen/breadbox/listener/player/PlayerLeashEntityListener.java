package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerLeashEntityEvent;

/**
 * 用于处理玩家用拴绳拴住实体时触发的事件。
 *  当玩家使用拴绳成功拴住一个实体时，就会触发 PlayerLeashEntityEvent 事件。
 *  这个事件允许插件开发者在玩家拴住实体的这个时刻执行特定的操作，比如阻止拴绳操作、记录拴绳行为等。
 * @author zhangqing
 * @since 2025/1/28 21:32
 */
@Component
public class PlayerLeashEntityListener implements Listener {

    @EventHandler
    public void onPlayerLeashEntityListener(PlayerLeashEntityEvent playerLeashEntityEvent){

    }
}
