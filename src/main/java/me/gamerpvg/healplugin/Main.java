package me.gamerpvg.healplugin;

import me.gamerpvg.healplugin.commands.HealCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "Plugin aktiviert!");
        // Plugin startup logic

        this.getCommand("heal").setExecutor(new HealCommand());


    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "Plugin deaktiviert!");

        // Plugin shutdown logic
    }
}
