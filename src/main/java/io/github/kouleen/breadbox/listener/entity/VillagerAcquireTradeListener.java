package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;

/**
 * 主要用于处理村民获取新交易的相关事件。
 *  当村民通过某种方式（例如与玩家交易、升级等）获取一个新的交易时，就会触发 VillagerAcquireTradeEvent 事件。
 *  开发者可以利用这个事件来修改新交易的内容、阻止特定交易的获取或者记录村民获取交易的信息等。
 * @author zhangqing
 * @since 2025/1/28 21:45
 */
@Component
public class VillagerAcquireTradeListener implements Listener {

    @EventHandler
    public void onVillagerAcquireTradeListener(VillagerAcquireTradeEvent villagerAcquireTradeEvent){

    }
}
