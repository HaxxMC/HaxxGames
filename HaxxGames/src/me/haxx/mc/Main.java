package me.haxx.mc;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getLogger().log(Level.INFO, "§c[Haxx Games] §aEnabled.");
	}

	@Override
	public void onDisable() {

	}

}
