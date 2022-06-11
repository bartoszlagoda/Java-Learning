package AppFile;

public class AppTest {
    public static void main(String[] args) {
        AndroidApp androidapp = new AndroidApp("New Application");
        androidapp.appInfo();
        androidapp.runAndroidApp();

        IphoneApp iphoneapp = new IphoneApp("New Application");
        iphoneapp.appInfo();
        iphoneapp.runIphoneApp();

    }
}
