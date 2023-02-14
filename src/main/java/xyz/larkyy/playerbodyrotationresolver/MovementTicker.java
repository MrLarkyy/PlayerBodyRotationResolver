package xyz.larkyy.playerbodyrotationresolver;

import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MovementTicker extends BukkitRunnable {

    private final Map<UUID,PlayerRotation> rotations = new HashMap<>();

    @Override
    public void run() {
        Bukkit.getOnlinePlayers().forEach(p -> {
            PlayerRotation rotation;
            if (rotations.containsKey(p.getUniqueId())) {
                rotation = rotations.get(p.getUniqueId());
            }
            else {
                rotation = new PlayerRotation(p);
                rotations.put(p.getUniqueId(),rotation);
            }
            rotation.tickMovement(p.getLocation());

            var yaw = rotation.getBodyYaw();
            //Bukkit.broadcastMessage("Yaw: "+yaw);

            Vector v = new Vector(1,0,0);
            v.rotateAroundY(Math.toRadians(-yaw-90));
            p.getLocation().getWorld().spawnParticle(Particle.VILLAGER_HAPPY,p.getLocation().add(v),5);
        });
    }
}
