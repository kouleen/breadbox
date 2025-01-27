package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.EntityBlockFormEvent;

/**
 * 处理方块由实体形成的事件
 * 比如当雪傀儡走过的地方形成雪块，或者当岩浆与水接触形成石头或黑曜石时（尽管后者通常是通过 BlockFormEvent 或其他相关事件来处理的，而不是 EntityBlockFormEvent）。
 * 在 EntityBlockFormEvent 事件中，你可以获取到关于形成方块的实体和方块本身的信息。
 * 例如，如果是一个雪傀儡在雪地上行走形成了雪块，你可以获取到雪傀儡的实体对象以及新形成的雪块的位置和类型。
 * @author zhangqing
 * @since 2025/1/27 18:26
 */
@Component
public class EntityBlockFormListener implements Listener {

    @EventHandler
    public void onEntityBlockFormListener(EntityBlockFormEvent entityBlockFormEvent){

    }
}
