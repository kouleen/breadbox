package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.util.Vector;

/**
 * 当玩家在实体上点击某实体上的某位置时触发此事件.
 * @author zhangqing
 * @since 2025/1/27 16:03
 */
@Component
public class PlayerInteractAtEntityListener implements Listener {

    @EventHandler
    public void onPlayerInteractAtEntityListener(PlayerInteractAtEntityEvent playerInteractAtEntityEvent){
        Player player = playerInteractAtEntityEvent.getPlayer();
        Entity entity = playerInteractAtEntityEvent.getRightClicked();
        Vector vector = playerInteractAtEntityEvent.getClickedPosition();
        // 获取手的位置
        EquipmentSlot equipmentSlot = playerInteractAtEntityEvent.getHand();
    }
}
