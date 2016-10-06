package me.marti201.nomobattacks;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoMobAttacks extends JavaPlugin implements Listener {

	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onTarget(EntityTargetLivingEntityEvent e){
		
		if(e.getTarget() != null && e.getTarget().getType() == EntityType.PLAYER){
			
			Player player = (Player) e.getTarget();
			
			if(player.hasPermission("nomobattacks.noattack"))
				e.setCancelled(true);
			
		}
		
	}
	
	
}
