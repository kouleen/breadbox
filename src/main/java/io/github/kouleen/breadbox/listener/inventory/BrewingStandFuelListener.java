package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewingStandFuelEvent;

/**
 * 在酿造台的燃料水平发生变化时触发
 * 这包括燃料被添加或移除的情况。
 * @author zhangqing
 * @since 2025/1/27 17:22
 */
@Component
public class BrewingStandFuelListener implements Listener {

    @EventHandler
    public void onBrewingStandFuelListener(BrewingStandFuelEvent brewingStandFuelEvent){

    }
}
