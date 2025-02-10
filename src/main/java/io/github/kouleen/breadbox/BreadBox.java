package io.github.kouleen.breadbox;

import io.github.kouleen.minecraft.core.lang.annotation.MinecraftPluginMain;
import io.github.kouleen.minecraft.plugin.MinecraftPluginRun;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * @author zhangqing
 * @since 2025/1/26 16:33
 */
@MinecraftPluginMain
public class BreadBox extends JavaPlugin {

    @Override
    public void onLoad() {
        MinecraftPluginRun.start(this, getClassLoader());
    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onEnable() {

    }
}
