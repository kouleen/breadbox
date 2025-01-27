package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;

/**
 * 当方块接受到的红石信号变化时触发此事件
 * @author zhangqing
 * @since 2025/1/27 18:21
 */
@Component
public class BlockRedStoneListener implements Listener {

    @EventHandler
    public void onBlockRedStoneListener(BlockRedstoneEvent blockRedstoneEvent){

    }
}
