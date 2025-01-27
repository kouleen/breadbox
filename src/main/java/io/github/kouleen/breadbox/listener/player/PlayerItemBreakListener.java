package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.inventory.ItemStack;

/**
 * 玩家物品损坏的事件
 * 当玩家的物品耐久度降至0时，该事件会被触发
 * @author zhangqing
 * @since 2025/1/27 16:22
 */
@Component
public class PlayerItemBreakListener implements Listener {

    @EventHandler
    public void onPlayerItemBreakListener(PlayerItemBreakEvent playerItemBreakEvent){
        Player player = playerItemBreakEvent.getPlayer();
        ItemStack itemStack = playerItemBreakEvent.getBrokenItem();
        player.sendMessage("你的" + itemStack.getItemMeta().getDisplayName() + "损坏了！");
    }
}
