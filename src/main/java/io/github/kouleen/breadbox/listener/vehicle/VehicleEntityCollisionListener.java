package io.github.kouleen.breadbox.listener.vehicle;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;

/**
 * 载具撞击实体的事件
 * @author zhangqing
 * @since 2025/1/28 23:02
 */
@Component
public class VehicleEntityCollisionListener implements Listener {

    @EventHandler
    public void onVehicleEntityCollisionListener(VehicleEntityCollisionEvent vehicleEntityCollisionEvent){

    }
}
