package io.github.kouleen.breadbox.listener.server;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

/**
 * 它会在客户端向服务器发送 ping 请求以获取服务器列表信息时被触发。
 *  在 Minecraft 游戏里，当玩家在主菜单界面刷新服务器列表，客户端就会向服务器发送 ping 请求，
 *  服务器接收到请求后，就会触发该事件。开发者借助这个事件可以对服务器展示给客户端的信息进行定制，如修改服务器的 MOTD（Message of the Day）、在线玩家数量显示、服务器图标等，从而增强服务器的个性化与吸引力。
 * @author zhangqing
 * @since 2025/1/28 22:17
 */
@Component
public class ServerListPingListener implements Listener {

    @EventHandler
    public void onServerListPingListener(ServerListPingEvent serverListPingEvent){

    }
}
