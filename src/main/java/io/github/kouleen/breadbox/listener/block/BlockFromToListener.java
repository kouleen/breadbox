package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFromToEvent;

/**
 * 方块从一个位置移动到另一个位置的事件
 * 这个事件类通常与液体流动、熔岩流动、龙蛋传送等特殊游戏机制相关。
 * 当方块（如水流、熔岩流）从一个位置移动到另一个位置时，这个事件会被触发。此外，龙蛋在某些条件下也会触发这个事件进行传送。
 * @author zhangqing
 * @since 2025/1/27 18:10
 */
@Component
public class BlockFromToListener implements Listener {

    @EventHandler
    public void onBlockFromToListener(BlockFromToEvent blockFromToEvent){

    }
}
