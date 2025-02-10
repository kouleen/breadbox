package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;

/**
 * 当玩家或其他实体打开一个库存（如背包、箱子、熔炉等）时，会触发
 * @author zhangqing
 * @since 2025/1/27 17:37
 */
@Component
public class InventoryOpenListener implements Listener {

    @EventHandler
    public void onInventoryOpenListener(InventoryOpenEvent inventoryOpenEvent){

    }
}
