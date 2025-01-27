package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockSpreadEvent;

/**
 * 当一个方块基于自然法则地蔓延时触发此事件(比如菌丝的蔓延).
 * @author zhangqing
 * @since 2025/1/27 18:22
 */
@Component
public class BlockSpreadListener implements Listener {

    @EventHandler
    public void onBlockSpreadListener(BlockSpreadEvent blockSpreadEvent){

    }
}
