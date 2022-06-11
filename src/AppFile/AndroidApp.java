package AppFile;

public class AndroidApp extends App{


    public AndroidApp(String name) {
        super(name);
        System.out.println("Konstruktor klasy AndroidApp załadował aplikację.");
        System.out.println("------------------------------------------------------");
    }

    public void runAndroidApp(){

        System.out.println("Wersja na androida");
        System.out.println("Aplikacja została uruchomiona na androidzie!");
    }
}
