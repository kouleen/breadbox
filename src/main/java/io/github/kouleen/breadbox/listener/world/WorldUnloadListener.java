package io.github.kouleen.breadbox.listener.world;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldUnloadEvent;

/**
 * 当一个世界被卸载时调用.
 * @author zhangqing
 * @since 2025/1/28 22:53
 */
@Component
public class WorldUnloadListener implements Listener {

    @EventHandler
    public void onWorldUnloadListener(WorldUnloadEvent worldUnloadEvent){

    }
}
