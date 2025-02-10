package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

/**
 * 用于处理实体与其他对象交互相关事件的类。
 *  当一个实体（例如玩家、动物、怪物等）与另一个对象（方块、物品等）进行交互操作时，这个事件就会被触发。
 *  getEntity():返回参与交互的实体对象。
 *      通过该方法可以获取到触发交互事件的具体实体，进而对该实体进行各种操作，比如判断实体类型、获取实体的属性等。
 *  getBlock():如果交互涉及到方块，此方法返回被交互的方块对象。
 *      可以利用这个方块对象来获取方块的类型、位置等信息，以便根据不同方块类型做出不同响应。
 *  getHand():若交互实体是玩家，此方法返回玩家用于交互的手（主手或副手）。
 *      这在处理玩家使用不同手进行交互的逻辑时很有用，例如玩家用主手和副手点击方块可能有不同的行为。
 *  isCancelled():判断该交互事件是否已被取消。
 *      如果事件被取消，那么默认的交互行为将不会发生。
 * @author zhangqing
 * @since 2025/1/28 20:25
 */
@Component
public class EntityPickupItemListener implements Listener {

    @EventHandler
    public void onEntityPickupItemListener(EntityPickupItemEvent entityPickupItemEvent){

    }
}
