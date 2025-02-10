package io.github.kouleen.breadbox.listener.server;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.RemoteServerCommandEvent;

/**
 * 用于处理从远程服务器发送过来的命令相关操作的事件类。
 *  当有命令从远程服务器发送到当前服务器时，就会触发 RemoteServerCommandEvent 事件。
 *  这里的远程服务器可以是通过某种网络协议（如 RCON 等）与当前服务器建立连接的其他服务器或者管理终端。开发者可以利用这个事件来实现诸如过滤特定命令、修改命令内容、记录命令执行情况等功能。
 * @author zhangqing
 * @since 2025/1/28 22:08
 */
@Component
public class RemoteServerCommandListener implements Listener {

    @EventHandler
    public void onRemoteServerCommandListener(RemoteServerCommandEvent remoteServerCommandEvent){

    }
}
