package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

/**
 * 处理告示牌（Sign）文本变化的事件
 * @author zhangqing
 * @since 2025/1/27 18:30
 */
@Component
public class SignChangeListener implements Listener {

    @EventHandler
    public void onSignChangeListener(SignChangeEvent signChangeEvent){

    }
}
