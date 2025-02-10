package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

/**
 * 玩家准备躺到床上时触发此事件
 * @author zhangqing
 * @since 2025/1/27 14:57
 */
@Component
public class PlayerBedEnterListener implements Listener {

    @EventHandler
    public void onPlayerBedEnterListener(PlayerBedEnterEvent playerBedEnterEvent){

    }
}
