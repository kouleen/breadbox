package io.github.kouleen.breadbox.listener.world;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkUnloadEvent;

/**
 * 当一个区块被卸载时调用
 * @author zhangqing
 * @since 2025/1/28 22:46
 */
@Component
public class ChunkUnloadListener implements Listener {

    @EventHandler
    public void onChunkUnloadListener(ChunkUnloadEvent chunkUnloadEvent){

    }
}
