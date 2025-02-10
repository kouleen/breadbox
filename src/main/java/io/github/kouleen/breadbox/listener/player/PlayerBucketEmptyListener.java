package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

/**
 * 玩家用完一只桶后触发此事件
 * @author zhangqing
 * @since 2025/1/27 15:21
 */
@Component
public class PlayerBucketEmptyListener implements Listener {

    @EventHandler
    public void onPlayerBucketEmptyListener(PlayerBucketEmptyEvent playerBucketEmptyEvent){

    }
}
