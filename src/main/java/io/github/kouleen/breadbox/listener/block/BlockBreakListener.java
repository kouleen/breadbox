package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

/**
 * 当一个方块被破坏的时候，调用本事件
 * @author zhangqing
 * @since 2025/1/27 17:47
 */
@Component
public class BlockBreakListener implements Listener {

    @EventHandler
    public void onBlockBreakListener(BlockBreakEvent blockBreakEvent){
        Block eventBlock = blockBreakEvent.getBlock();


    }
}
