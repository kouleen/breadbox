package io.github.kouleen.breadbox.listener.world;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;

/**
 * 当传送门被创建时调用.
 * @author zhangqing
 * @since 2025/1/28 22:46
 */
@Component
public class PortalCreateListener implements Listener {

    @EventHandler
    public void onPortalCreateListener(PortalCreateEvent portalCreateEvent){

    }
}
