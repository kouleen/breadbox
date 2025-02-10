package io.github.kouleen.breadbox.listener.inventory;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;

/**
 * 专门用于处理与铁砧相关的特定事件
 * 修改铁砧界面上的物品、限制玩家在铁砧上的操作等
 * @author zhangqing
 * @since 2025/1/27 17:42
 */
@Component
public class PrepareAnvilListener implements Listener {

    @EventHandler
    public void onPrepareAnvilListener(PrepareAnvilEvent prepareAnvilEvent){

    }
}
