package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;

/**
 * 方块爆炸事件.
 * @author zhangqing
 * @since 2025/1/27 18:06
 */
@Component
public class BlockExplodeListener implements Listener {

    @EventHandler
    public void onBlockExplodeListener(BlockExplodeEvent blockExplodeEvent){

    }
}
