package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockMultiPlaceEvent;

/**
 * 当玩家一次性放置多个方块时，这个事件会被触发
 * 这通常发生在玩家使用具有特殊功能的物品或命令时，如填充方块命令方块、结构方块等。
 * @author zhangqing
 * @since 2025/1/27 18:14
 */
@Component
public class BlockMultiPlaceListener implements Listener {

    @EventHandler
    public void onBlockMultiPlaceListener(BlockMultiPlaceEvent blockMultiPlaceEvent){

    }
}
