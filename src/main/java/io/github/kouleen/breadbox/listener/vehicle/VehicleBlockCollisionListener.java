package io.github.kouleen.breadbox.listener.vehicle;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleBlockCollisionEvent;

/**
 * 载具撞击方块的事件
 * @author zhangqing
 * @since 2025/1/28 22:58
 */
@Component
public class VehicleBlockCollisionListener implements Listener {

    @EventHandler
    public void onVehicleBlockCollisionListener(VehicleBlockCollisionEvent vehicleBlockCollisionEvent){

    }
}
