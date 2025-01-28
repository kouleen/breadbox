package io.github.kouleen.breadbox.listener.hanging;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakEvent;

/**
 * 它用于处理悬挂物（如绘画、物品展示框等）被破坏的相关事件。
 *  当一个悬挂物（Hanging 类型的实体）被破坏时，就会触发 HangingBreakEvent 事件。
 *  悬挂物被破坏的原因可能有多种，例如被玩家破坏、被爆炸波及、被箭射中等等。该事件允许开发者在悬挂物被破坏之前执行一些操作，比如阻止破坏、记录破坏信息等。
 * @author zhangqing
 * @since 2025/1/28 21:52
 */
@Component
public class HangingBreakListener implements Listener {

    @EventHandler
    public void onHangingBreakListener(HangingBreakEvent hangingBreakEvent){

    }
}
