package me.gamerpvg.healplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (player.getHealth() < 20) {
            player.setHealth(20);
            player.setFoodLevel(20);
            player.sendActionBar(ChatColor.GREEN + "Heilung erfolgt!");
        } else {
            player.sendActionBar(ChatColor.DARK_RED + "Heilung nicht möglich!");
        }
        return false;
    }
}
