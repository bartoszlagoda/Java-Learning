package drivers;

public class WebDriverChecker {
    public static void main(String[] args)  {

        // wszystkie wartości enuma w liście
        DriverType[] driverTypes = DriverType.values();
        for(int i = 0; i < driverTypes.length; i++){
            System.out.println(driverTypes[i].name); // po name
            System.out.println(driverTypes[i].path); // po path
        }

        //WebDriver driver = getDriver(DriverType.CHROME);
        WebDriver driver = getDriver(DriverType.FIREFOX);

        System.out.println(driver.get());
        System.out.println(driver.findElementBy("NAME", "BUTTON_1"));

        //System.out.println(chromeDriver.get());
        //System.out.println(chromeDriver.findElementBy("XPATH", "//@class['browser']"));
    }

    private static WebDriver getDriver(DriverType type) {
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        }
        System.out.println(type.path);
        return new FirefoxDriver();
    }
}
