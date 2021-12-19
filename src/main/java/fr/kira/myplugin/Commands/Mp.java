package fr.kira.myplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.swing.*;
import java.util.Arrays;

public class Mp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        if (args.length>=2) {
            Player player = Bukkit.getPlayer(args[0]);
            if (player==null) {
                commandSender.sendMessage("Ce joueur n'est pas connecté, utilise ta matière grise.");
            }
            else {
                String[] messages = Arrays.copyOfRange(args, 1, args.length);
                String message = String.join(" ", messages);
                player.sendMessage(message);
            }
        }
        else {
            commandSender.sendMessage("Met les bon nombres d'arguments, même si tu sais pas ce que c'est ni pourquoi.");
        }
        return true;
    }
}
