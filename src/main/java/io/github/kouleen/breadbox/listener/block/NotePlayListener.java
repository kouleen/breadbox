package io.github.kouleen.breadbox.listener.block;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.NotePlayEvent;

/**
 * 音符盒播放音符的事件[玩家点击/红石触发]
 * @author zhangqing
 * @since 2025/1/27 18:28
 */
@Component
public class NotePlayListener implements Listener {

    @EventHandler
    public void onNotePlayListener(NotePlayEvent notePlayEvent){

    }
}
