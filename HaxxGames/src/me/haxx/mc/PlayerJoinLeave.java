package me.haxx.mc;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinLeave implements Listener {


	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();

		p.sendMessage("§a✠ " + "§bWelcome to the Haxx Games Server!" + " §a✠");
		e.setJoinMessage("§6[§a+§6]§7" + p.getName());
	}
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		
		e.setQuitMessage("§6[§c-§6]§7" + p.getName());
	}
}
