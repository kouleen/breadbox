package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

/**
 * 物品被方块(比如发射器,投掷器等)射出的事件.
 * @author zhangqing
 * @since 2025/1/27 18:02
 */
@Component
public class BlockDispenseListener implements Listener {

    @EventHandler
    public void onBlockDispenseListener(BlockDispenseEvent blockDispenseEvent){

    }
}
