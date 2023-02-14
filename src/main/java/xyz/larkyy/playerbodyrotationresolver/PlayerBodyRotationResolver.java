package xyz.larkyy.playerbodyrotationresolver;

import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerBodyRotationResolver extends JavaPlugin {

    @Override
    public void onEnable() {
        new MovementTicker().runTaskTimer(this,1,1);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
