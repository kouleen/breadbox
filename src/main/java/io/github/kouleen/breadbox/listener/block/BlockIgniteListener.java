package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;

/**
 * 当一个方块被点燃时触发.
 * @author zhangqing
 * @since 2025/1/27 18:12
 */
@Component
public class BlockIgniteListener implements Listener {

    @EventHandler
    public void onBlockIgniteListener(BlockIgniteEvent blockIgniteEvent){

    }
}
