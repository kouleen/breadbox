package io.github.kouleen.breadbox.listener.hanging;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingPlaceEvent;

/**
 * 用于处理悬挂物放置相关操作的事件类。
 *  当玩家或者实体在游戏世界中成功放置一个悬挂物时，就会触发 HangingPlaceEvent 事件。
 *  开发者可以通过监听此事件，实现诸如阻止特定位置的悬挂物放置、记录悬挂物放置信息等功能。
 * @author zhangqing
 * @since 2025/1/28 21:54
 */
@Component
public class HangingPlaceListener implements Listener {

    @EventHandler
    public void onHangingPlaceListener(HangingPlaceEvent hangingPlaceEvent){

    }
}
