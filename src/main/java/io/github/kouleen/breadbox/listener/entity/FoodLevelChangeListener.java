package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

/**
 * 用于处理实体食物等级变化相关事件的类。
 *  当一个实体（通常是玩家）的食物等级发生改变时，这个事件就会被触发。这使得开发者能够在食物等级变化时执行自定义逻辑，比如根据食物等级变化给予玩家特殊效果，或者限制某些操作等。
 * @author zhangqing
 * @since 2025/1/28 21:09
 */
@Component
public class FoodLevelChangeListener implements Listener {

    @EventHandler
    public void onFoodLevelChangeListener(FoodLevelChangeEvent foodLevelChangeEvent){

    }
}
