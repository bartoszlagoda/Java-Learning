package drivers;

// typ wyliczeniowy Enum
public enum DriverType {
    // podanie wartości zgodne z konwencją
    CHROME("chrome", "/src/resources/chromedriver.exe"),
    FIREFOX("firefox","/src/resources/firefoxdriver.exe");

    // konkretne pola
    String name;
    String path;

    //konstruktor
    private DriverType(String name, String path){
        this.name = name;
        this.path = path;
    }
}
