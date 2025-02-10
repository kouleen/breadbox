package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * 当任何一个实体死亡时触发本事件
 * @author zhangqing
 * @since 2025/1/28 20:09
 */
@Component
public class EntityDeathListener implements Listener {

    @EventHandler
    public void onEntityDeathListener(EntityDeathEvent entityDeathEvent){
        // 获取实体死亡掉落物品
        List<ItemStack> itemStacks = entityDeathEvent.getDrops();
        // 清空默认掉落物品
        itemStacks.clear();
        ItemStack itemStack = new ItemStack(Material.DIAMOND_CHESTPLATE,1);
        itemStacks.add(itemStack);
        entityDeathEvent.setDroppedExp(20);
    }

}
