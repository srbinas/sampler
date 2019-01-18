package de.daniel.spigot.sampler;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Activator extends JavaPlugin {
       
    @Override
    public void onEnable() {  
        System.out.println("Sampler is running!");
    }

    @Override
    public void onDisable() {
        System.out.println("Sampler ends!");
    }
    
    public boolean onCommand(final CommandSender sender, Command command, String label, String[] args) {
        
        String currentCommand = command.getName().toLowerCase();
        
        if (sender.hasPermission("sampler") || sender.hasPermission("samplerop")) {
            if (currentCommand.equals("hallo")) {
                sender.sendMessage(ChatColor.GREEN + "Hello world, " + sender.getName() + "!");
            }
        }
        
        if (sender.hasPermission("samplerop")) {
            if (currentCommand.equals("hallo2")) {
                sender.sendMessage(ChatColor.DARK_RED + "You are an OP user, " + sender.getName() + "!");
            }
        }
        
        return false;
    }
}
