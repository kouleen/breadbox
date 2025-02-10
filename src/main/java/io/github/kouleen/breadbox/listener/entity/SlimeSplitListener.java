package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SlimeSplitEvent;

/**
 * 主要用于处理史莱姆分裂相关的事件。
 *  当史莱姆死亡或者受到特定条件触发而分裂成多个小史莱姆时，就会触发 SlimeSplitEvent 事件。
 *  开发者可以利用这个事件实现诸如阻止史莱姆分裂、修改分裂出的小史莱姆数量和大小等功能。
 * @author zhangqing
 * @since 2025/1/28 21:44
 */
@Component
public class SlimeSplitListener implements Listener {

    @EventHandler
    public void onSlimeSplitListener(SlimeSplitEvent slimeSplitEvent){

    }
}
