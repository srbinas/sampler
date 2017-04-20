package de.daniel.spigot.sampler;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Activator extends JavaPlugin {
       
    @Override
    public void onEnable() {  
        System.out.println("Sampler läuft!");
    }

    @Override
    public void onDisable() {
        System.out.println("Sampler endet!");
    }
    
    public boolean onCommand(final CommandSender sender, Command command, String label, String[] args) {
        
        String currentCommand = command.getName().toLowerCase();
        
        if (sender.hasPermission("sampler") || sender.hasPermission("samplerop")) {
            if (currentCommand.equals("hallo")) {
                sender.sendMessage(ChatColor.GREEN + "Funzt doch perfekt, " + sender.getName() + "!");
            }
        }
        
        if (sender.hasPermission("samplerop")) {
            if (currentCommand.equals("hallo2")) {
                sender.sendMessage(ChatColor.DARK_RED + "NOCH DAZU: Du bist op, " + sender.getName() + "!");
            }
        }
        
        return false;
    }
}