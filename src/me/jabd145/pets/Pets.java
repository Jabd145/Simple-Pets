package me.jabd145.pets;

import me.bigteddy98.red.PetMaker;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Pets extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
	        Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	  @Override
	    public boolean onCommand(CommandSender sender, Command cmd, String label, final String[] args) {
		  if(cmd.getName().equalsIgnoreCase("creeper")){
	        final Player p = (Player) sender;
	        Creeper creeper = p.getWorld().spawn(p.getLocation(), Creeper.class);
	        creeper.setCustomName(ChatColor.BLUE + p.getName() + "'s Pet");
	        creeper.setCustomNameVisible(true);
	        creeper.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 500000000, 100000));
	        creeper.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 500000000, 100000));
	        PetMaker.makePet(creeper, p.getUniqueId());
	        return true;
		  }
		  if(cmd.getName().equalsIgnoreCase("simplepets")){
		        final Player p = (Player) sender;
		        p.sendMessage(ChatColor.AQUA + "---------------" + ChatColor.WHITE + "{" + ChatColor.GOLD + "SimplePets" + ChatColor.WHITE + "}" + ChatColor.AQUA + "---------------");
		        p.sendMessage(ChatColor.DARK_GREEN + "/creeper" + ChatColor.WHITE + ": creates a creeper pet!");
		        p.sendMessage("");
		        p.sendMessage(ChatColor.GREEN + "/slime" + ChatColor.WHITE + ": creates a slime pet!");
		        p.sendMessage("");
		        p.sendMessage(ChatColor.YELLOW + "/cat" + ChatColor.WHITE + ": creates a slime pet!");
		        p.sendMessage("");
		        p.sendMessage(ChatColor.RED + "/mooshroom" + ChatColor.WHITE + ": creates a mooshroom pet!");
		        p.sendMessage("");
		        p.sendMessage(ChatColor.GRAY + "/bat" + ChatColor.WHITE + ": creates a bat pet!");
		        p.sendMessage("");
		        p.sendMessage(ChatColor.AQUA + "------------------------------------------");
		        return true;
			  }
		  if(cmd.getName().equalsIgnoreCase("cat")){
		        final Player p = (Player) sender;
		        Ocelot ocelot = p.getWorld().spawn(p.getLocation(), Ocelot.class);
		        ocelot.setCustomName(ChatColor.BLUE + p.getName() + "'s Pet");
		        ocelot.setCustomNameVisible(true);
		        ocelot.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 500000000, 100000));
		        ocelot.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 500000000, 100000));
		        PetMaker.makePet(ocelot, p.getUniqueId());
		        return true;
			  }
		  
		  
		  if(cmd.getName().equalsIgnoreCase("mooshroom")){
		        final Player p = (Player) sender;
		        MushroomCow m = p.getWorld().spawn(p.getLocation(), MushroomCow.class);
		        m.setCustomName(ChatColor.BLUE + p.getName() + "'s Pet");
		        m.setCustomNameVisible(true);
		        m.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 500000000, 100000));
		        m.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 500000000, 100000));
		        PetMaker.makePet(m, p.getUniqueId());
		        return true;
			  }
		  if(cmd.getName().equalsIgnoreCase("bat")){
		        final Player p = (Player) sender;
		        Bat bat = p.getWorld().spawn(p.getLocation(), Bat.class);
		        bat.setCustomName(ChatColor.BLUE + p.getName() + "'s Pet");
		        bat.setCustomNameVisible(true);
		        bat.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 500000000, 100000));
		        bat.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 500000000, 100000));
		        PetMaker.makePet(bat, p.getUniqueId());
		        return true;
			  }
		  if(cmd.getName().equalsIgnoreCase("slime")){
		        final Player p = (Player) sender;
		        Slime slime = p.getWorld().spawn(p.getLocation(), Slime.class);
		        slime.setCustomName(ChatColor.BLUE + p.getName() + "'s Pet");
		        slime.setCustomNameVisible(true);
		        slime.setSize(1);
		        slime.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 500000000, 100000));
		        slime.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 500000000, 100000));
		        PetMaker.makePet(slime, p.getUniqueId());
		        return true;
			  }
		return false;
	    }
	
	
}
