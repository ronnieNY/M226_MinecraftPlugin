package com.tbz.mcplugin.mcplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("testcommand")) {
            sender.sendMessage("You just ran /testcommand!");
        }
        return false;
    }

}
