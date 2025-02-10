package io.github.kouleen.breadbox.listener.server;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginDisableEvent;

/**
 * 用于处理插件被禁用时的相关操作。
 *  当一个插件被禁用时，无论是通过服务器控制台命令、服务器重启，还是其他方式触发，都会触发 PluginDisableEvent 事件。
 *  这为开发者提供了一个机会，在插件停止运行之前进行一些收尾工作，以确保数据的完整性和系统的稳定性。
 * @author zhangqing
 * @since 2025/1/28 22:05
 */
@Component
public class PluginDisableListener implements Listener {

    @EventHandler
    public void onPluginDisableListener(PluginDisableEvent pluginDisableEvent){

    }
}
