package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEvent;

/**
 * 当玩家使用桶时触发本事件
 * @author zhangqing
 * @since 2025/1/27 15:27
 */
@Component
public class PlayerBucketListener implements Listener {

    @EventHandler
    public void onPlayerBucketListener(PlayerBucketEvent playerBucketEvent){

    }

}
