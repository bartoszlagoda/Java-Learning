import Webdriver.FirefoxDriver;
import Webdriver.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        double c = a/b; // niejawna konwersja a na typ double
        int d = a/(int)b; // jawna konwersja b na typ integer

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver; // konwersja na typ Firefox
        System.out.println(firefoxDriver.get("Mozilla Firefox"));
    }
}
