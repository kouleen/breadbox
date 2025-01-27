package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * 当一个方块被玩家放置的时候触发此事件.
 * @author zhangqing
 * @since 2025/1/27 18:20
 */
@Component
public class BlockPlaceListener implements Listener {

    @EventHandler
    public void onBlockPlaceListener(BlockPlaceEvent blockPlaceEvent){

    }
}
