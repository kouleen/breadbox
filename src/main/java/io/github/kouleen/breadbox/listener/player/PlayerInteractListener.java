package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * 当玩家对一个对象或空气进行交互时触发本事件.
 * @author zhangqing
 * @since 2025/1/27 16:19
 */
@Component
public class PlayerInteractListener implements Listener {

    @EventHandler
    public void onPlayerInteractListener(PlayerInteractEvent playerInteractEvent){

    }
}
