package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;

/**
 * 方块因为自然条件消退，融化，消失的事件(比如雪融化).
 * @author zhangqing
 * @since 2025/1/27 18:07
 */
@Component
public class BlockFadeListener implements Listener {

    @EventHandler
    public void onBlockFadeListener(BlockFadeEvent blockFadeEvent){

    }
}
