package io.github.kouleen.breadbox.listener.world;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.StructureGrowEvent;

/**
 * 当一个有机结构试图生长的时调用此事件(树苗 树, 蘑菇 巨型蘑菇, 自然生长的或使用骨粉生长的).
 * @author zhangqing
 * @since 2025/1/28 22:49
 */
@Component
public class StructureGrowListener implements Listener {

    @EventHandler
    public void onStructureGrowListener(StructureGrowEvent structureGrowEvent){

    }
}
