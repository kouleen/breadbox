package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

/**
 * 在某些实体或方块（例如漏斗）尝试直接将物品从一个库存移动到另一个库存时被调用
 * @author zhangqing
 * @since 2025/1/27 17:35
 */
@Component
public class InventoryMoveItemListener implements Listener {

    @EventHandler
    public void onInventoryMoveItemListener(InventoryMoveItemEvent inventoryMoveItemEvent){

    }
}
