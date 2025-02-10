package io.github.kouleen.breadbox.handle;

import io.github.kouleen.breadbox.BreadBox;
import io.github.kouleen.minecraft.core.utils.ObjectUtils;
import io.github.kouleen.minecraft.plugin.MinecraftPluginRun;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

/**
 * @author zhangqing
 * @since 2025/2/10 18:45
 */
public final class BreadBoxRegisterHandle {

    private final BreadBox breadBox = MinecraftPluginRun.getBean(BreadBox.class);

    public static void registerCommandExecutor(CommandExecutor commandExecutor){
        PluginCommand pluginCommand = Bukkit.getPluginCommand("bbx");
        if(ObjectUtils.isEmpty(pluginCommand)){
            Bukkit.getLogger().severe("BreadBoxRegisterService pluginCommand is null");
            return;
        }
        pluginCommand.setExecutor(commandExecutor);
    }

    public static void registerTabCompleter(TabCompleter tabCompleter){
        PluginCommand pluginCommand = Bukkit.getPluginCommand("bbx");
        if(ObjectUtils.isEmpty(pluginCommand)){
            Bukkit.getLogger().severe("BreadBoxRegisterService pluginCommand is null");
            return;
        }
        pluginCommand.setTabCompleter(tabCompleter);
    }

    public void registerListener(Listener listener){
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(listener,breadBox);
    }
}
