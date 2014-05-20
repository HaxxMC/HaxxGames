package me.haxx.mc;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static void registerEvents(org.bukkit.plugin.Plugin plugin,
			Listener... listeners) {
		for (Listener listener : listeners) {
			Bukkit.getServer().getPluginManager()
					.registerEvents(listener, plugin);
		}
	}
	
	@Override
	public void onEnable() {
		registerEvents(this, new PlayerJoinLeave());
		getServer().getLogger().log(Level.INFO, "§c[Haxx Games] §aEnabled.");
	}

	@Override
	public void onDisable() {

	}

}
