package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadbox.BreadBox;
import io.github.kouleen.minecraft.core.lang.annotation.AutoInject;
import io.github.kouleen.minecraft.core.lang.annotation.Component;
import io.github.kouleen.minecraft.core.utils.ObjectUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;


/**
 * 玩家尝试登录服务器的事件
 * @author zhangqing
 * @since 2025/1/27 15:13
 */
@Component
public class AsyncPlayerPreLoginListener implements Listener {

    @AutoInject
    private BreadBox breadBox;

    @EventHandler(priority = EventPriority.LOWEST)
    public void onAsyncPlayerPreLoginListenerLowest(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent){
        breadBox.getLogger().info("AsyncPlayerPreLoginListener onAsyncPlayerPreLoginListenerLowest");
        if (AsyncPlayerPreLoginEvent.Result.ALLOWED != asyncPlayerPreLoginEvent.getLoginResult()) {
            return;
        }
        String name = asyncPlayerPreLoginEvent.getName();
        if(ObjectUtils.isEmpty(asyncPlayerPreLoginEvent.getAddress())){
            asyncPlayerPreLoginEvent.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER,"Error retrieving message");
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onAsyncPlayerPreLoginEventHighest(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent){
        breadBox.getLogger().info("AsyncPlayerPreLoginListener onAsyncPlayerPreLoginEventHighest");
        if (AsyncPlayerPreLoginEvent.Result.ALLOWED != asyncPlayerPreLoginEvent.getLoginResult()) {
            return;
        }
    }
}
