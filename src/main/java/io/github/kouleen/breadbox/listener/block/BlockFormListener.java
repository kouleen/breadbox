package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;

/**
 * 方块因为某些自然过程（如水源附近形成泥土、熔岩冷却形成玄武岩等）而形成时被触发
 * @author zhangqing
 * @since 2025/1/27 18:08
 */
@Component
public class BlockFormListener implements Listener {

    @EventHandler
    public void onBlockFormListener(BlockFormEvent blockFormEvent){

    }
}
