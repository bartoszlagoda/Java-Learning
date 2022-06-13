package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public String get() {
        return "Otwieram przeglądarkę za pomocą przeglądarki Mozilla Firefox";
    }

    @Override
    public String findElementBy(String method, String data) {
        return "Korzystam z metody " + method + " do wyszukania " + data;
    }
}
