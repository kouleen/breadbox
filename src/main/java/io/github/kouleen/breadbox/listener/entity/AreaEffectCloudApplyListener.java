package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.AreaEffectCloudApplyEvent;

/**
 * 当滞留药水应用它的效果时触发本事件，期间每5 tick发生一次。
 * @author zhangqing
 * @since 2025/1/27 22:16
 */
@Component
public class AreaEffectCloudApplyListener implements Listener {

    @EventHandler
    public void onAreaEffectCloudApplyListener(AreaEffectCloudApplyEvent areaEffectCloudApplyEvent){

    }
}
