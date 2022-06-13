package drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public String get() {
        return "Otwieram przeglądarkę za pomocą przeglądarki Google Chrome";
    }

    @Override
    public String findElementBy(String method, String data) {
        return "Korzystam z metody " + method + " do wyszukania " + data;
    }
}
