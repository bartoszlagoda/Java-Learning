import drivers.ChromeDriver;
import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ExceptionExamples {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        WebDriver chromeDriver = getDriver("chrome");
        WebDriver firefoxDriver = getDriver("firefoxa");

        System.out.println(firefoxDriver.get());
        System.out.println(firefoxDriver.findElementBy("NAME", "BUTTON_1"));

        System.out.println(chromeDriver.get());
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
