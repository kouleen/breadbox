package io.github.kouleen.breadbox.listener.world;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldLoadEvent;

/**
 * 当一个世界被加载时调用.
 * @author zhangqing
 * @since 2025/1/28 22:51
 */
@Component
public class WorldLoadListener implements Listener {

    @EventHandler
    public void onWorldLoadListener(WorldLoadEvent worldLoadEvent){

    }
}
