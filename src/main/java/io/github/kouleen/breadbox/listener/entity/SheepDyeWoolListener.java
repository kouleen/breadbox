package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SheepDyeWoolEvent;

/**
 * 主要用于处理玩家给羊染色羊毛这一操作相关的事件
 *  当玩家使用染料对羊的羊毛进行染色时，就会触发 SheepDyeWoolEvent 事件。
 *  通过监听这个事件，开发者可以对染色操作进行干预，例如阻止染色、修改染色的颜色等。
 * @author zhangqing
 * @since 2025/1/28 21:41
 */
@Component
public class SheepDyeWoolListener implements Listener {

    @EventHandler
    public void onSheepDyeWoolListener(SheepDyeWoolEvent sheepDyeWoolEvent){

    }
}
