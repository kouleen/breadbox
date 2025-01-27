package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EnderDragonChangePhaseEvent;

/**
 * 当末影龙切换控制阶段时会触发此事件‌
 * @author zhangqing
 * @since 2025/1/27 22:20
 */
@Component
public class EnderDragonChangePhaseListener implements Listener {

    @EventHandler
    public void onEnderDragonChangePhaseListener(EnderDragonChangePhaseEvent enderDragonChangePhaseEvent){

    }
}
