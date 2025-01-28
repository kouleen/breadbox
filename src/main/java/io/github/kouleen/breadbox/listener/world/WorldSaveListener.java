package io.github.kouleen.breadbox.listener.world;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldSaveEvent;

/**
 * 当一个世界被保存时调用.
 * @author zhangqing
 * @since 2025/1/28 22:52
 */
@Component
public class WorldSaveListener implements Listener {

    @EventHandler
    public void onWorldSaveListener(WorldSaveEvent worldSaveEvent){

    }
}
