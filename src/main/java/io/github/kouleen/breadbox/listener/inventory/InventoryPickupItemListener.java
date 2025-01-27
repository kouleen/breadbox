package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryPickupItemEvent;

/**
 * 主要用于监听玩家或实体从地面或其他容器中拾取物品的动作
 * 当玩家或实体（如僵尸）从地面或其他容器中拾取物品时，InventoryPickupItemEvent事件会被触发。
 * @author zhangqing
 * @since 2025/1/27 17:40
 */
@Component
public class InventoryPickupItemListener implements Listener {

    @EventHandler
    public void onInventoryPickupItemListener(InventoryPickupItemEvent inventoryPickupItemEvent){

    }
}
