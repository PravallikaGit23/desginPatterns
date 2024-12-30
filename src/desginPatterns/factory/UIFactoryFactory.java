package desginPatterns.factory;

public class UIFactoryFactory {
    SupportedPlatforms platforms;
    public static UIFactory getUIFactoryFromPlatforms(SupportedPlatforms platforms) {
        if (platforms == SupportedPlatforms.ANDROID) {
            return new AndroidFactory();

        }
        if (platforms == SupportedPlatforms.IOS) {
            return new IOSFactory();
        }
        return null;
    }
}
