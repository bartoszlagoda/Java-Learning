package Webdriver;

public class ChromeDriver implements WebDriver{
    @Override
    public String get(String browser) {
        return "Otwieram przeglądarkę " + browser;
    }

    @Override
    public String findElementBy(String method, String data) {
        return "Korzystam z metody " + method + " do wyszukania " + data;
    }
}
