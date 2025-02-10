package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

/**
 * 当玩家关闭背包时触发本事件
 * @author zhangqing
 * @since 2025/1/27 17:28
 */
@Component
public class InventoryCloseListener implements Listener {

    @EventHandler
    public void onInventoryCloseListener(InventoryCloseEvent inventoryCloseEvent){

    }
}
