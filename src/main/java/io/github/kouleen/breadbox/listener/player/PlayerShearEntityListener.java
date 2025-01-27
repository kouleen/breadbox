package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

/**
 * 玩家对某实体使用剪刀采集物品时调用此事件.
 * @author zhangqing
 * @since 2025/1/27 16:58
 */
@Component
public class PlayerShearEntityListener implements Listener {

    @EventHandler
    public void onPlayerShearEntityListener(PlayerShearEntityEvent playerShearEntityEvent){

    }
}
