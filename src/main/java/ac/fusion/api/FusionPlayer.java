package ac.fusion.api;

public interface FusionPlayer {
    int getVL(HackType type);
    void setVL(HackType type, int vl);
    void resetVL();

    boolean isExempted();
    void setExempted(boolean exempted);

    boolean isForced();
    void setForced(boolean forced);
}
