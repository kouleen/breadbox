package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;

/**
 * 玩家损坏物品时触发的事件
 * 当玩家使用物品（如武器、工具等）时，如果物品的耐久度减少，就会触发这个事件。
 * @author zhangqing
 * @since 2025/1/27 16:27
 */
@Component
public class PlayerItemDamageListener implements Listener {

    @EventHandler
    public void onPlayerItemDamageListener(PlayerItemDamageEvent playerItemDamageEvent){

    }
}
