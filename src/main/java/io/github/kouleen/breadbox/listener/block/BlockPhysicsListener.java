package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;

/**
 * 方块物理事件(例如是沙子掉落).
 * @author zhangqing
 * @since 2025/1/27 18:16
 */
@Component
public class BlockPhysicsListener implements Listener {

    @EventHandler
    public void onBlockPhysicsListener(BlockPhysicsEvent blockPhysicsEvent){

    }
}
