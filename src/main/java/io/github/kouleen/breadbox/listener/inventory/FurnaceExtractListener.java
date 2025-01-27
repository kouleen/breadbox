package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceExtractEvent;

/**
 * 当玩家从熔炉取出产物时触发这个事件.
 * @author zhangqing
 * @since 2025/1/27 17:25
 */
@Component
public class FurnaceExtractListener implements Listener {

    @EventHandler
    public void onFurnaceExtractListener(FurnaceExtractEvent furnaceExtractEvent){

    }
}
