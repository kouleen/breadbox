package io.github.kouleen.breadbox.listener.vehicle;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleCreateEvent;

/**
 * 载具创建事件
 * @author zhangqing
 * @since 2025/1/28 22:59
 */
@Component
public class VehicleCreateListener implements Listener {

    @EventHandler
    public void onVehicleCreateListener(VehicleCreateEvent vehicleCreateEvent){

    }
}
