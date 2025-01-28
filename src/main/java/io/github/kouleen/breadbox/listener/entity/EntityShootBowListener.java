package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *  用于处理实体射箭相关事件的类。
 *      当游戏中的实体（如玩家、骷髅等）使用弓进行射箭操作时，该事件就会被触发。通过监听这个事件，开发者可以对实体射箭的行为进行各种自定义控制和处理。
 * @author zhangqing
 * @since 2025/1/28 20:39
 */
@Component
public class EntityShootBowListener implements Listener {

    @EventHandler
    public void onEntityShootBowListener(EntityShootBowEvent entityShootBowEvent){
        LivingEntity livingEntity = entityShootBowEvent.getEntity();

        ItemStack itemStack = entityShootBowEvent.getBow();
        ItemMeta itemMeta = itemStack.getItemMeta();
        if(itemMeta.hasEnchant(Enchantment.ARROW_DAMAGE)){

        }

        Entity entity = entityShootBowEvent.getProjectile();
        if(entity instanceof Arrow){
            Arrow arrow = (Arrow) entity;
            arrow.setVelocity(arrow.getVelocity().multiply(1.5));
        }

        // 获取射箭时的力量。这个值决定了箭射出的初始速度和距离。开发者可以根据这个值来实现一些特殊效果，例如根据射箭力量不同造成不同伤害。
        float force = entityShootBowEvent.getForce();
    }
}
