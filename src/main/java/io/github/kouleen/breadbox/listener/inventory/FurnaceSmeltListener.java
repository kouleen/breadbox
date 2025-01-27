package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceSmeltEvent;

/**
 * 当一个物品被熔炼完毕时触发这个事件.
 * @author zhangqing
 * @since 2025/1/27 17:26
 */
@Component
public class FurnaceSmeltListener implements Listener {

    @EventHandler
    public void onFurnaceSmeltListener(FurnaceSmeltEvent furnaceSmeltEvent){

    }
}
