package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * 玩家在游戏中点击物品栏中的物品时，会触发这个事件
 * 译注：事实上打开任意容器的物品栏(包括玩家的背包)后点击任何一个地方都会触发这个事件。
 * @author zhangqing
 * @since 2025/1/27 17:27
 */
@Component
public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClickListener(InventoryClickEvent inventoryClickEvent){

    }
}
