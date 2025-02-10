package io.github.kouleen.breadbox.listener.entity;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PigZapEvent;

/**
 * 用于处理猪被闪电击中后转变为僵尸猪灵（在 Minecraft Java Edition 1.16 之前是僵尸猪人）的相关事件
 *  当一只猪被闪电击中并且即将转变为僵尸猪灵时，会触发 PigZapEvent 事件。
 *  这个事件允许插件开发者在猪转变为僵尸猪灵之前进行一些操作，比如取消转变、修改转变后的僵尸猪灵属性等。
 * @author zhangqing
 * @since 2025/1/28 21:26
 */
@Component
public class PigZapListener implements Listener {

    @EventHandler
    public void onPigZapListener(PigZapEvent pigZapEvent){

    }
}
