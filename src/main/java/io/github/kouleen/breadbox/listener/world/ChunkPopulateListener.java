package io.github.kouleen.breadbox.listener.world;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;

/**
 * 当一个新的区块填充完毕时调用.
 * @author zhangqing
 * @since 2025/1/28 22:40
 */
@Component
public class ChunkPopulateListener implements Listener {

    @EventHandler
    public void onChunkPopulateListener(ChunkPopulateEvent chunkPopulateEvent){

    }
}
