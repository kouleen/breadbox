package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

/**
 * 玩家消耗物品时触发的事件
 * @author zhangqing
 * @since 2025/1/27 16:26
 */
@Component
public class PlayerItemConsumeListener implements Listener {

    @EventHandler
    public void onPlayerItemConsumeListener(PlayerItemConsumeEvent playerItemConsumeEvent){

    }
}
