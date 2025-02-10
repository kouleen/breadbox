package io.github.kouleen.breadbox.listener.world;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.SpawnChangeEvent;

/**
 * 一个在世界的出生点被改变时调用的事件.包含这个世界之前的出生点.
 * @author zhangqing
 * @since 2025/1/28 22:48
 */
@Component
public class SpawnChangeListener implements Listener {

    @EventHandler
    public void onSpawnChangeListener(SpawnChangeEvent spawnChangeEvent){

    }
}
