package ac.fusion.api;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface FusionAPI {
    FusionPlayer getFusionPlayer(Player player);

    @Deprecated
    FusionPlayer getFusionPlayer(UUID uuid);

    @Deprecated
    FusionPlayer getFusionPlayer(String name);
}
