package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

/**
 * 当一个物品被合成的时候触发这个事件.
 * @author zhangqing
 * @since 2025/1/27 17:23
 */
@Component
public class CraftItemListener implements Listener {

    @EventHandler
    public void onCraftItemListener(CraftItemEvent craftItemEvent){

    }
}
