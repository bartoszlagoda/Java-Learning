package drivers;

public interface WebDriver {
    String get(); // "Otwieram przeglądarkę za pomocą Firefoxa/Google Chrome'a."
    String findElementBy(String method, String data); // "Wyszukuję [data] metodą [method]."
}
