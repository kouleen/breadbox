package io.github.kouleen.breadbox.listener.vehicle;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleDamageEvent;

/**
 * 载具被伤害的事件
 * @author zhangqing
 * @since 2025/1/28 23:00
 */
@Component
public class VehicleDamageListener implements Listener {

    @EventHandler
    public void onVehicleDamageListener(VehicleDamageEvent vehicleDamageEvent){

    }
}
