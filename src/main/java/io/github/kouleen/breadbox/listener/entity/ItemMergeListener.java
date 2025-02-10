package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemMergeEvent;

/**
 * 用于处理物品合并相关事件的类。
 *  当两个物品实体合并为一个时，这个事件会被触发。例如，当地上有两个同类型且可堆叠的物品，它们由于某种原因（如靠近彼此）合并成一个数量为两者之和的物品时，就会触发此事件。
 * @author zhangqing
 * @since 2025/1/28 21:18
 */
@Component
public class ItemMergeListener implements Listener {

    @EventHandler
    public void onItemMergeListener(ItemMergeEvent itemMergeEvent){

    }
}
