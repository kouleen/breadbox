package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemDespawnEvent;

/**
 * 用于处理物品实体消失事件的类。
 *  当物品实体（例如玩家丢弃的物品、怪物掉落的物品等）即将从游戏世界中消失时，这个事件会被触发。这为开发者提供了在物品消失前进行干预或执行特定操作的机会。
 * @author zhangqing
 * @since 2025/1/28 21:15
 */
@Component
public class ItemDeSpawnListener implements Listener {

    @EventHandler
    public void onItemDeSpawnListener(ItemDespawnEvent itemDespawnEvent){

    }
}
