package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;

/**
 * 当一个方块被火烧掉的时候触发此事件.
 * @author zhangqing
 * @since 2025/1/27 17:54
 */
@Component
public class BlockBurnListener implements Listener {

    @EventHandler
    public void onBlockBurnListener(BlockBurnEvent blockBurnEvent){

    }
}
