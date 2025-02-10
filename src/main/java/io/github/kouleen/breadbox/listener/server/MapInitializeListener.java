package io.github.kouleen.breadbox.listener.server;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.MapInitializeEvent;

/**
 * 用于处理地图初始化相关的事件。
 *  当一个新的地图物品（MapItem）被创建并初始化时，就会触发 MapInitializeEvent 事件。
 *  这通常发生在玩家首次获得地图、地图被重置或插件创建新地图时。开发者可以利用这个事件来设置地图的初始属性，如地图的缩放级别、显示区域等，还可以添加自定义的地图标记、修改地图渲染器等。
 * @author zhangqing
 * @since 2025/1/28 22:03
 */
@Component
public class MapInitializeListener implements Listener {

    @EventHandler
    public void onMapInitializeListener(MapInitializeEvent mapInitializeEvent){

    }
}
