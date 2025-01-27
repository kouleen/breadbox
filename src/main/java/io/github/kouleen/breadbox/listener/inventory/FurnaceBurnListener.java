package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;

/**
 * 当一个物品作为燃料被燃烧的时候触发这个事件.
 * @author zhangqing
 * @since 2025/1/27 17:25
 */
@Component
public class FurnaceBurnListener implements Listener {

    @EventHandler
    public void onFurnaceBurnListener(FurnaceBurnEvent furnaceBurnEvent){

    }
}
