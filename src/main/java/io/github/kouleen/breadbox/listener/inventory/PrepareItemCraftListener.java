package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;

/**
 * 当玩家在合成台上放置物品并准备合成时，PrepareItemCraftEvent 会被触发。
 * 通过这个事件对象，开发者可以访问合成配方（Recipe）、合成结果物品（ItemStack）、合成台（CraftingInventory）等信息。
 * @author zhangqing
 * @since 2025/1/27 17:44
 */
@Component
public class PrepareItemCraftListener implements Listener {

    @EventHandler
    public void onPrepareItemCraftListener(PrepareItemCraftEvent prepareItemCraftEvent){

    }
}
