package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCreativeEvent;

/**
 * 当玩家在创造模式下放下或拿起物品栏中的物品时，以及当他们在创造模式下从物品栏中放下物品时，会调用此事件。
 * @author zhangqing
 * @since 2025/1/27 17:29
 */
@Component
public class InventoryCreativeListener implements Listener {

    @EventHandler
    public void onInventoryCreativeListener(InventoryCreativeEvent inventoryCreativeEvent){

    }
}
