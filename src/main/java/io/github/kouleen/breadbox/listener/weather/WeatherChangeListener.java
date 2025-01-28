package io.github.kouleen.breadbox.listener.weather;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

/**
 * 用于处理天气变化相关事件的类。
 *  在 Minecraft 服务器中，当天气状态发生改变时，就会触发这个事件，
 *  开发者可以利用该事件来实现自定义的天气变化逻辑，例如阻止特定世界的天气变化、在天气变化时执行特定操作等。
 * @author zhangqing
 * @since 2025/1/28 22:35
 */
@Component
public class WeatherChangeListener implements Listener {

    @EventHandler
    public void onWeatherChangeListener(WeatherChangeEvent weatherChangeEvent){

    }
}
