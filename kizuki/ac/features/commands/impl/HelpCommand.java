package kizuki.ac.features.commands.impl;

import org.bukkit.command.*;
import org.jetbrains.annotations.*;
import kizuki.ac.alert.*;
import kizuki.ac.features.commands.*;

public class HelpCommand extends AbstractCommand
{
    public HelpCommand() {
        super("help", "/kizuki help");
    }
    
    @Override
    public boolean handleCommand(final CommandSender commandSender, @NotNull final Command command, final String s, final String[] array) {
        try {
            commandSender.sendMessage(AlertFormatter.ii(AlertFormatter.lI("help")));
            return true;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
