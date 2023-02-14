package xyz.larkyy.playerbodyrotationresolver;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import org.bukkit.craftbukkit.v1_19_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class NMSHandler {

    /*
    public void injectPlayer(Player p) {
        CraftPlayer cp = (CraftPlayer) p;
        var channel = cp.getHandle().connection.connection.channel;

        ChannelDuplexHandler cdh = new ChannelDuplexHandler() {
            @Override
            public void channelRead(ChannelHandlerContext ctx, Object packet) {
                if (packet instanceof ClientboundPlayerPositionPacket p) {
                    p.getXRot()
                }
            }
        };
    }
     */

}
