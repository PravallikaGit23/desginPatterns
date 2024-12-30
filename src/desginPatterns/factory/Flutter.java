package desginPatterns.factory;

public class Flutter {
    SupportedPlatforms platforms;

    public Flutter(SupportedPlatforms platforms) {
        this.platforms = platforms;
    }
    public void setTheme() {
        System.out.println("Setting theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.getUIFactoryFromPlatforms(SupportedPlatforms.ANDROID);
    }

}
