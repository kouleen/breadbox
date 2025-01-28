package io.github.kouleen.breadbox.listener.server;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServiceRegisterEvent;

/**
 * 当一个服务被注册到服务器的服务管理器时，会触发该事件
 *  开发者可以监听此事件，在服务注册时进行一些初始化操作，例如为该服务关联一些数据或者进行权限检查。
 * @author zhangqing
 * @since 2025/1/28 22:26
 */
@Component
public class ServiceRegisterListener implements Listener {

    @EventHandler
    public void onServiceRegisterListener(ServiceRegisterEvent serviceRegisterEvent){

    }
}
