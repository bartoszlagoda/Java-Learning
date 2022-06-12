package Webdriver;

public class WebDriverChecker {
    public static void main(String[] args) {
        WebDriver chromeDriver = getDriver("chrome");
        WebDriver firefoxDriver = getDriver("firefox");

        System.out.println(firefoxDriver.get("Mozilla Firefox"));
        System.out.println(firefoxDriver.findElementBy("NAME", "BUTTON_1"));

        System.out.println(chromeDriver.get("Google Chrome"));
        System.out.println(chromeDriver.findElementBy("XPATH", "//@class['browser']"));
    }

    private static WebDriver getDriver(String browser) {
        if (browser.equals("chrome")) {
            return new ChromeDriver();
        } else if(browser.equals("firefox")) {
            return new FirefoxDriver();
        }
        return null;
    }
}
