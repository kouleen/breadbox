package io.github.kouleen.breadbox.listener.server;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.BroadcastMessageEvent;

/**
 * 用于处理服务器广播消息相关操作的事件类。
 *  当服务器向玩家广播消息时，就会触发 BroadcastMessageEvent 事件。
 *  这里的广播消息可以是服务器管理员手动发送的全局通知，也可以是插件自动触发的消息推送等。开发者通过监听该事件，能够实现诸如修改广播消息内容、阻止特定消息广播、针对不同玩家群体定制消息显示等功能。
 * @author zhangqing
 * @since 2025/1/28 21:58
 */
@Component
public class BroadcastMessageListener implements Listener {

    @EventHandler
    public void onBroadcastMessageListener(BroadcastMessageEvent broadcastMessageEvent){

    }
}
