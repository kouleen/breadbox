package io.github.kouleen.breadbox.listener.vehicle;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleExitEvent;

/**
 * 实体退出载具的事件
 * @author zhangqing
 * @since 2025/1/28 23:03
 */
@Component
public class VehicleExitListener implements Listener {

    @EventHandler
    public void onVehicleExitListener(VehicleExitEvent vehicleExitEvent){

    }
}
