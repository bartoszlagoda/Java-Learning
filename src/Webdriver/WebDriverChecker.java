package Webdriver;

public class WebDriverChecker {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        System.out.println(firefoxDriver.get("Mozilla Firefox"));
        System.out.println(firefoxDriver.findElementBy("NAME", "BUTTON_1"));

        System.out.println(chromeDriver.get("Google Chrome"));
        System.out.println(chromeDriver.findElementBy("XPATH", "//@class['browser']"));
    }
}
