package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewEvent;

/**
 * 当酿造完成时触发这个事件.
 * @author zhangqing
 * @since 2025/1/27 17:20
 */
@Component
public class BrewListener implements Listener {

    @EventHandler
    public void onBrewListener(BrewEvent brewEvent){

    }
}
