package kizuki.ac;

import kizuki.ac.packet.*;
import org.bukkit.inventory.*;
import com.comphenix.protocol.events.*;

public class ut extends Packet
{
    ItemStack itemStack;
    
    public ut(final PacketEvent packetEvent) {
        super(packetEvent);
        this.itemStack = (ItemStack) packetEvent.getPacket().getItemModifier().read(0);
    }
    
    public ItemStack getItemStack() {
        return this.itemStack;
    }
    
    public short getId() {
        return (short)this.II.getPacket().getShorts().read(0);
    }
}
