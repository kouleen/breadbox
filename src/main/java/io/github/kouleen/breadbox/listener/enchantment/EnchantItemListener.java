package io.github.kouleen.breadbox.listener.enchantment;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.inventory.ItemStack;


/**
 * 对物品进行附魔时，这个事件会被触发
 * @author zhangqing
 * @since 2025/1/27 21:51
 */
@Component
public class EnchantItemListener implements Listener {

    @EventHandler
    public void onEnchantItemListener(EnchantItemEvent enchantItemEvent){
        ItemStack itemStack = enchantItemEvent.getItem();

    }
}
