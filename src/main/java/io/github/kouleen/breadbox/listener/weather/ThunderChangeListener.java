package io.github.kouleen.breadbox.listener.weather;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.ThunderChangeEvent;

/**
 * 用于处理与天气中雷电变化相关的事件。
 *  ThunderChangeEvent属于 Bukkit 的事件系统，主要在服务器端运行，用于让插件开发者能够监听和响应游戏中雷电天气状态的改变。比如，当游戏从无雷电状态变为有雷电，或者从有雷电变为无雷电时，这个事件就会被触发。
 * @author zhangqing
 * @since 2025/1/28 22:34
 */
@Component
public class ThunderChangeListener implements Listener {

    @EventHandler
    public void onThunderChangeListener(ThunderChangeEvent thunderChangeEvent){

    }
}
