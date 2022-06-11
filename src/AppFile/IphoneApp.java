package AppFile;

public class IphoneApp extends App{

    public IphoneApp(String name) {
        super(name);
        System.out.println("Konstruktor klasy IphoneApp załadował aplikację.");
        System.out.println("------------------------------------------------------");
    }

    public void runIphoneApp(){

        System.out.println("Wersja na Iphone'a");
        System.out.println("Aplikacja została uruchomiona na Iphonie!");
    }
}
