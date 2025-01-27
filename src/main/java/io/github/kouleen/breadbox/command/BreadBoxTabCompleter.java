package io.github.kouleen.breadbox.command;

import io.github.kouleen.breadlib.annotation.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Collections;
import java.util.List;

/**
 * @author zhangqing
 * @since 2025/1/27 10:57
 */
@Component
public class BreadBoxTabCompleter implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return Collections.emptyList();
    }
}
