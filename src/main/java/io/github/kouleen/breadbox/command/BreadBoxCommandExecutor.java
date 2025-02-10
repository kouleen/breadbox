package io.github.kouleen.breadbox.command;

import io.github.kouleen.minecraft.core.lang.annotation.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * @author zhangqing
 * @since 2025/1/27 10:55
 */
@Component
public class BreadBoxCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }
}
