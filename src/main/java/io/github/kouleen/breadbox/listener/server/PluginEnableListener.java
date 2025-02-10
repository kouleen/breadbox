package io.github.kouleen.breadbox.listener.server;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginEnableEvent;

/**
 * 用于处理插件启用相关的操作
 *  当一个插件被成功启用时，就会触发 PluginEnableEvent 事件。
 *  插件的启用可能是在服务器启动时自动加载，也可能是通过服务器控制台或插件管理工具手动启用。开发者可以利用这个事件在插件启用的时刻执行一些初始化操作，例如加载配置文件、注册事件监听器、建立数据库连接等。
 * @author zhangqing
 * @since 2025/1/28 22:06
 */
@Component
public class PluginEnableListener implements Listener {

    @EventHandler
    public void onPluginEnableListener(PluginEnableEvent pluginEnableEvent){

    }
}
