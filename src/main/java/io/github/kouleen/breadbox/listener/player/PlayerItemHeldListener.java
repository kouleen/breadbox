package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

/**
 * 玩家更换手持物品时触发
 * @author zhangqing
 * @since 2025/1/27 16:30
 */
@Component
public class PlayerItemHeldListener implements Listener {

    @EventHandler
    public void onPlayerItemHeldListener(PlayerItemHeldEvent playerItemHeldEvent){

    }
}
