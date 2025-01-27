package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreeperPowerEvent;

/**
 * 当苦力怕被闪电击中时调用
 * @author zhangqing
 * @since 2025/1/27 22:18
 */
@Component
public class CreeperPowerListener implements Listener {

    @EventHandler
    public void onCreeperPowerListener(CreeperPowerEvent creeperPowerEvent){

    }
}
