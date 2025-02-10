package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLocaleChangeEvent;

/**
 * 玩家改变他们的语言设置时触发本事件.
 * @author zhangqing
 * @since 2025/1/27 16:35
 */
@Component
public class PlayerLocaleChangeListener implements Listener {

    @EventHandler
    public void onPlayerLocaleChangeListener(PlayerLocaleChangeEvent playerLocaleChangeEvent){

    }
}
