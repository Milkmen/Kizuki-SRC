package kizuki.ac;

import kizuki.ac.packet.*;
import com.comphenix.protocol.events.*;

public class ug extends Packet
{
    private final short shortId;
    
    public ug(final PacketEvent packetEvent) {
        super(packetEvent);
        this.shortId = (short)this.II.getPacket().getShorts().read(0);
    }
    
    public short getId() {
        return this.shortId;
    }
}
