package Webdriver;

public interface WebDriver {
    String get(String browser); // "Otwieram przeglądarkę za pomocą Firefoxa/Google Chrome'a."
    String findElementBy(String method, String data); // "Wyszukuję [data] metodą [method]."
}
