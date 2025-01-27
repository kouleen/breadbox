package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

/**
 * 当一个生物体在世界中出生时触发该事件.
 * @author zhangqing
 * @since 2025/1/27 22:17
 */
@Component
public class CreatureSpawnListener implements Listener {

    @EventHandler
    public void onCreatureSpawnListener(CreatureSpawnEvent creatureSpawnEvent){

    }
}
