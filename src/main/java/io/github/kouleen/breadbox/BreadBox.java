package io.github.kouleen.breadbox;

import io.github.kouleen.breadbox.service.BreadBoxRegisterService;
import io.github.kouleen.breadlib.BreadLibApplication;
import io.github.kouleen.breadlib.annotation.Main;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * @author zhangqing
 * @since 2025/1/26 16:33
 */
@Main
public class BreadBox extends JavaPlugin {

    private BreadBoxRegisterService breadBoxRegisterService;

    @Override
    public void onLoad() {
        BreadLibApplication.run(this, getClassLoader());
        this.breadBoxRegisterService = new BreadBoxRegisterService(this);
    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onEnable() {

    }
}
