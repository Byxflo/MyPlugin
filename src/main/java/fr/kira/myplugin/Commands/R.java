package fr.kira.myplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class R implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        commandSender.sendMessage("Tu es une merde");
        return true;
    }
}
