package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.CauldronLevelChangeEvent;

/**
 * 当炼药锅中的水位发生变化时被触发
 * （例如，玩家向炼药锅中加水或从中取水）
 * @author zhangqing
 * @since 2025/1/27 18:23
 */
@Component
public class CauldronLevelChangeListener implements Listener {

    @EventHandler
    public void onCauldronLevelChangeListener(CauldronLevelChangeEvent cauldronLevelChangeEvent){

    }
}
