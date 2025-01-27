package io.github.kouleen.breadbox.service;

import io.github.kouleen.breadbox.BreadBox;
import io.github.kouleen.breadlib.utils.ObjectUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

/**
 * @author zhangqing
 * @since 2025/1/27 15:00
 */
public class BreadBoxRegisterService {

    private final BreadBox breadBox;

    public BreadBoxRegisterService(BreadBox breadBox){
        this.breadBox = breadBox;
    }

    public void registerCommandExecutor(CommandExecutor commandExecutor){
        PluginCommand pluginCommand = Bukkit.getPluginCommand("bbx");
        if(ObjectUtils.isEmpty(pluginCommand)){
            Bukkit.getLogger().severe("BreadBoxRegisterService pluginCommand is null");
            return;
        }
        pluginCommand.setExecutor(commandExecutor);
    }

    public void registerTabCompleter(TabCompleter tabCompleter){
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
