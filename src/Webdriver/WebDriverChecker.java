package Webdriver;

public class WebDriverChecker {
    public static void main(String[] args)  {
        WebDriver chromeDriver = getDriver(DriverType.CHROME);
        WebDriver firefoxDriver = getDriver(DriverType.FIREFOX);

        System.out.println(firefoxDriver.get("Mozilla Firefox"));
        System.out.println(firefoxDriver.findElementBy("NAME", "BUTTON_1"));

        System.out.println(chromeDriver.get("Google Chrome"));
        System.out.println(chromeDriver.findElementBy("XPATH", "//@class['browser']"));
    }

    private static WebDriver getDriver(DriverType type) {
        if (type == DriverType.CHROME) {
            return new ChromeDriver();
        }
        return new FirefoxDriver();
    }
}
