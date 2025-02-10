package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

/**
 * 处理玩家死亡相关事件的类。
 *  当玩家在游戏里死亡时，就会触发 PlayerDeathEvent 事件。
 *  开发者可以利用这个事件来实现诸如自定义死亡消息、控制玩家死亡后的掉落物、给予玩家特殊奖励或惩罚等功能。
 * @author zhangqing
 * @since 2025/1/28 21:28
 */
@Component
public class PlayerDeathListener implements Listener {

    @EventHandler
    public void onPlayerDeathListener(PlayerDeathEvent playerDeathEvent){

    }
}
