package drivers;

public class WebDriverSecondTest {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver firefoxSecond = new FirefoxDriver();
        WebDriver firefoxThird = new FirefoxDriver();

        WebDriver safari = new WebDriver() { // tylko ten jeden obiekt może być stworzony
            @Override
            public String get() {
                return ("Opening page with Safari");
            }

            @Override
            public String findElementBy(String method, String data) {
                return ("Finding element with Safari");
            }
        };

        System.out.println(safari.get());
        System.out.println(safari.findElementBy("XPATH","\\@class['reunion']"));
    }
}
