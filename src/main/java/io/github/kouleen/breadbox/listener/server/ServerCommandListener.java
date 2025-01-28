package io.github.kouleen.breadbox.listener.server;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;

/**
 * 这个事件当服务器后台发送指令时调用.
 *  当在服务器控制台输入命令或者通过某些机制向服务器发送命令时，就会触发 ServerCommandEvent 事件。
 *  这为开发者提供了一个机会，在命令真正执行之前对其进行干预，例如对命令进行合法性检查、修改命令内容、阻止某些危险命令的执行等。
 * @author zhangqing
 * @since 2025/1/28 22:08
 */
@Component
public class ServerCommandListener implements Listener {

    @EventHandler
    public void onServerCommandListener(ServerCommandEvent serverCommandEvent){

    }
}
