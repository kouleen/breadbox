package io.github.kouleen.breadbox.listener.enchantment;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.enchantments.EnchantmentOffer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;

/**
 * 物品塞入附魔台的事件 - 可以同时调用。
 * @author zhangqing
 * @since 2025/1/27 22:11
 */
@Component
public class PrepareItemEnchantListener implements Listener {

    @EventHandler
    public void onPrepareItemEnchantListener(PrepareItemEnchantEvent prepareItemEnchantEvent){
        int enchantmentBonus = prepareItemEnchantEvent.getEnchantmentBonus();
        EnchantmentOffer[] enchantmentOffers = prepareItemEnchantEvent.getOffers();
    }
}
