package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockGrowEvent;

/**
 * 当一个方块在世界中自然生长的时触发此事件(如小麦生长).
 * @author zhangqing
 * @since 2025/1/27 18:12
 */
@Component
public class BlockGrowListener implements Listener {

    @EventHandler
    public void onBlockGrowListener(BlockGrowEvent blockGrowEvent){

    }
}
