package kizuki.ac.features.commands.impl;

import org.bukkit.command.*;
import org.jetbrains.annotations.*;
import org.bukkit.entity.*;
import kizuki.ac.*;
import kizuki.ac.features.commands.*;

public class GuiCommand extends AbstractCommand
{
    public GuiCommand() {
        super("gui", "/kizuki gui");
    }
    
    @Override
    public boolean handleCommand(final CommandSender commandSender, @NotNull final Command command, final String s, final String[] array) {
        if (commandSender instanceof Player) {
            rk.iI().II((Player)commandSender);
        }
        return true;
    }
}
