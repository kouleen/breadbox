package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockCanBuildEvent;

/**
 * 尝试在某个方块上建造时被触发的
 * @author zhangqing
 * @since 2025/1/27 17:55
 */
@Component
public class BlockCanBuildListener implements Listener {

    @EventHandler
    public void onBlockCanBuildListener(BlockCanBuildEvent blockCanBuildEvent){

    }
}
