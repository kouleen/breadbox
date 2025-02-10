package io.github.kouleen.breadbox.listener.world;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

/**
 * 当一个区块被加载时调用.
 * @author zhangqing
 * @since 2025/1/28 22:39
 */
@Component
public class ChunkLoadListener implements Listener {

    @EventHandler
    public void onChunkLoadListener(ChunkLoadEvent chunkLoadEvent){

    }
}
