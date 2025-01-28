package io.github.kouleen.breadbox.listener.hanging;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

/**
 * 专门用于处理由实体导致悬挂物（如画、物品展示框等）被破坏的事件。
 *  当一个实体（可以是玩家、怪物等）破坏悬挂物（如墙上的画、物品展示框）时，就会触发 HangingBreakByEntityEvent 事件。
 *  开发者可以通过监听这个事件，对实体破坏悬挂物的行为进行干预，例如阻止破坏、记录破坏信息等。
 * @author zhangqing
 * @since 2025/1/28 21:50
 */
@Component
public class HangingBreakByEntityListener implements Listener {

    @EventHandler
    public void onHangingBreakByEntityListener(HangingBreakByEntityEvent hangingBreakByEntityEvent){

    }
}
