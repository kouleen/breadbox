package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;

/**
 * 用于处理物品实体生成事件的类。
 *  每当有物品实体在游戏世界中生成时，这个事件就会被触发。物品生成的场景有很多，比如玩家丢弃物品、怪物掉落物品、使用命令生成物品等等。该事件允许开发者在物品生成时执行特定的自定义逻辑。
 * @author zhangqing
 * @since 2025/1/28 21:19
 */
@Component
public class ItemSpawnListener implements Listener {

    @EventHandler
    public void onItemSpawnListener(ItemSpawnEvent itemSpawnEvent){

    }
}
