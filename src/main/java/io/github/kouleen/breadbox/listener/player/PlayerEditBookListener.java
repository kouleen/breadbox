package io.github.kouleen.breadbox.listener.player;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import io.github.kouleen.minecraft.core.utils.ObjectUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEditBookEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * @author zhangqing
 * @since 2025/1/27 15:44
 */
@Component
public class PlayerEditBookListener implements Listener {

    @EventHandler
    public void onPlayerEditBookListener(PlayerEditBookEvent playerEditBookEvent){
        Player player = playerEditBookEvent.getPlayer();
        PlayerInventory playerInventory = player.getInventory();
        int playerEditBookEventSlot = playerEditBookEvent.getSlot();
        ItemStack itemStack = playerInventory.getItem(playerEditBookEventSlot);
        ItemMeta itemMeta = itemStack.getItemMeta();
        if(ObjectUtils.isEmpty(itemStack) || !(itemMeta instanceof BookMeta)){
            return;
        }
        playerEditBookEvent.setCancelled(true);
        playerInventory.setItem(playerEditBookEventSlot,null);
        BookMeta newBookMeta = playerEditBookEvent.getNewBookMeta();
        itemStack.setItemMeta(newBookMeta);
    }
}
