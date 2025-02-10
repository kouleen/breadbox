package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;

/**
 * 在方块受到损害时被触发
 * 可能由玩家、爆炸、自然磨损等多种原因引起。
 * @author zhangqing
 * @since 2025/1/27 17:57
 */
@Component
public class BlockDamageListener implements Listener {

    @EventHandler
    public void onBlockDamageListener(BlockDamageEvent blockDamageEvent){

    }
}
