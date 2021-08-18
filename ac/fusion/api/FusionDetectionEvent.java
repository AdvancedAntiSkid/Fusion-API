package ac.fusion.api;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.entity.Player;

import java.util.Map;

public class FusionDetectionEvent extends Event implements Cancellable {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final FusionPlayer fusionPlayer;
    private final Player player;
    private final HackType hackType;
    private final Map<String, Object> details;
    private final float vl;

    private boolean cancelled;
    private boolean shown;

    /**
     *  Gets called every time a player fails a check.
     * @param fusionPlayer - api player
     * @param player - bukkit player
     * @param hackType - flag type
     * @param details - flag details (eg. cps: 20.0)
     * @param shown - vl reached the min-vl limit
     * @param vl - current vl
     */
    public FusionDetectionEvent(FusionPlayer fusionPlayer, Player player, HackType hackType, Map<String, Object> details, float vl, boolean shown) {
        this.fusionPlayer = fusionPlayer;
        this.player = player;
        this.hackType = hackType;
        this.details = details;
        this.vl = vl;
        this.shown = shown;
    }

    public FusionPlayer getFusionPlayer() {
        return fusionPlayer;
    }

    public Player getPlayer() {
        return player;
    }

    public HackType getHackType() {
        return hackType;
    }

    public Map<String, Object> getDetails() {
        return details;
    }

    public float getVl() {
        return vl;
    }

    public boolean isShown() {
        return shown;
    }

    public void setShown(boolean shown) {
        this.shown = shown;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
