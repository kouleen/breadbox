package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

/**
 * 玩家用快捷键互换主手和副手的物品时触发本事件.
 * @author zhangqing
 * @since 2025/1/27 17:01
 */
@Component
public class PlayerSwapHandItemsListener implements Listener {

    @EventHandler
    public void onPlayerSwapHandItemsListener(PlayerSwapHandItemsEvent playerSwapHandItemsEvent){

    }
}
