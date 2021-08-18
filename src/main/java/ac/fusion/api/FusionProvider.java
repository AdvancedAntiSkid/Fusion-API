package ac.fusion.api;

public class FusionProvider {
    private static FusionAPI api;

    public static FusionAPI getApi() {
        return api;
    }

    @Deprecated
    public static void setApi(FusionAPI api) {
        FusionProvider.api = api;
    }
}
