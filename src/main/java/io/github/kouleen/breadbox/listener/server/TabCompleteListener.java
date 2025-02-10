package io.github.kouleen.breadbox.listener.server;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.TabCompleteEvent;

/**
 * 用于处理服务器命令自动补全（Tab 补全）相关的操作。
 *  当玩家在游戏内的聊天框或控制台输入命令时，按下 Tab 键会触发命令的自动补全功能，此时就会触发 TabCompleteEvent 事件。
 * @author zhangqing
 * @since 2025/1/28 22:30
 */
@Component
public class TabCompleteListener implements Listener {

    @EventHandler
    public void onTabCompleteListener(TabCompleteEvent tabCompleteEvent){

    }
}
