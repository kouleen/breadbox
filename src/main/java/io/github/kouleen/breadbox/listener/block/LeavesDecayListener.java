package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;

/**
 * 当树叶消失时触发此事件.
 * @author zhangqing
 * @since 2025/1/27 18:27
 */
@Component
public class LeavesDecayListener implements Listener {

    @EventHandler
    public void onLeavesDecayListener(LeavesDecayEvent leavesDecayEvent){

    }
}
