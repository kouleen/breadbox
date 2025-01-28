package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerReplenishTradeEvent;

/**
 * 它主要用于处理村民交易补货相关的事件
 *  在 Minecraft 里，村民的交易有一定的使用次数限制，当交易次数达到上限后，经过一段时间或者满足某些条件，交易将会补货，也就是交易次数会重置，此时就会触发 VillagerReplenishTradeEvent 事件。
 *  开发者可以利用这个事件修改补货的规则、阻止补货或者记录补货信息等。
 * @author zhangqing
 * @since 2025/1/28 21:48
 */
@Component
public class VillagerReplenishTradeListener implements Listener {

    @EventHandler
    public void onVillagerReplenishTradeListener(VillagerReplenishTradeEvent villagerReplenishTradeEvent){

    }
}
