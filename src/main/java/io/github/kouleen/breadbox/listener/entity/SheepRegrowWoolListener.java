package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SheepRegrowWoolEvent;

/**
 * 主要用于处理羊重新长出羊毛这一事件。
 *  当羊重新长出羊毛时，会触发 SheepRegrowWoolEvent 事件。
 *  常见的羊重新长羊毛的情况包括羊吃草后自然恢复羊毛等。通过监听这个事件，开发者可以实现如阻止羊长羊毛、记录长羊毛事件等功能。
 * @author zhangqing
 * @since 2025/1/28 21:42
 */
@Component
public class SheepRegrowWoolListener implements Listener {

    @EventHandler
    public void onSheepRegrowWoolListener(SheepRegrowWoolEvent sheepRegrowWoolEvent){

    }
}
