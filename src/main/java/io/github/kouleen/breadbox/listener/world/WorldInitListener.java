package io.github.kouleen.breadbox.listener.world;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldInitEvent;

/**
 * 当一个世界被初始化时调用.
 * @author zhangqing
 * @since 2025/1/28 22:50
 */
@Component
public class WorldInitListener implements Listener {

    @EventHandler
    public void onWorldInitListener(WorldInitEvent worldInitEvent){

    }
}
