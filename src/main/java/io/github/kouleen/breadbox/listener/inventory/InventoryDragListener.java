package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;

/**
 * 玩家在游戏中拖动物品时，会触发这个事件
 * @author zhangqing
 * @since 2025/1/27 17:32
 */
@Component
public class InventoryDragListener implements Listener {

    @EventHandler
    public void onInventoryDragListener(InventoryDragEvent inventoryDragEvent){

    }
}
