package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;

/**
 * 玩家下载并使用指定的资源包时，会触发此事件
 * 插件可以通过监听此事件来获取资源包的状态，包括是否下载、是否应用等‌
 * @author zhangqing
 * @since 2025/1/27 16:52
 */
@Component
public class PlayerResourcePackStatusListener implements Listener {

    @EventHandler
    public void onPlayerResourcePackStatusListener(PlayerResourcePackStatusEvent playerResourcePackStatusEvent){

    }
}
