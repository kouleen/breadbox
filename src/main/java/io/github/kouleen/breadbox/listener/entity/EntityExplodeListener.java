package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

/**
 * 当一个实体爆炸的时候触发本事件
 *  getEntity()：返回引发爆炸的实体。
 *      这允许开发者确定是哪个实体触发了爆炸事件，比如判断是苦力怕还是 TNT 爆炸等。
 *  getLocation()：获取爆炸发生的位置。
 *      可以通过这个位置信息进行一些与位置相关的操作，比如在爆炸点周围生成特殊效果等。
 *  blockList()：获取即将在爆炸中被破坏的方块列表。
 *      开发者可以对这个列表进行修改，例如移除某些方块使其不被爆炸破坏，或者添加额外的方块让它们在爆炸时也受到影响。
 *  setCancelled(boolean cancel)：设置该爆炸事件是否被取消。
 *      如果设置为 true，爆炸将不会发生，所有与爆炸相关的默认行为（如方块破坏、实体伤害等）都将被阻止。
 * @author zhangqing
 * @since 2025/1/28 20:12
 */
@Component
public class EntityExplodeListener implements Listener {

    @EventHandler
    public void onEntityExplodeListener(EntityExplodeEvent entityExplodeEvent){
        Entity entity = entityExplodeEvent.getEntity();
        // 如果实体是苦力怕
        if(entity instanceof Creeper){
            entityExplodeEvent.setCancelled(true);

        }
    }

}
