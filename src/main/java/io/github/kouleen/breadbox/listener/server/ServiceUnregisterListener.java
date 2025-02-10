package io.github.kouleen.breadbox.listener.server;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServiceUnregisterEvent;

/**
 * 当一个服务从服务器的服务管理器中注销时，会触发该事件。
 *  开发者可以监听此事件，在服务注销时进行资源清理，比如关闭与该服务相关的数据库连接、释放内存等。
 * @author zhangqing
 * @since 2025/1/28 22:28
 */
@Component
public class ServiceUnregisterListener implements Listener {

    @EventHandler
    public void onServiceUnregisterListener(ServiceUnregisterEvent serviceUnregisterEvent){

    }
}
