package AppFile;

public class App {

    public String name;

    public App(String name){
        System.out.println("-------------------------------------------");
        System.out.println("Konstruktor klasy App ładuje aplikację....");
        System.out.println("-------------------------------------------");
        this.name = name;
    }

    public void appInfo(){
        System.out.println("Witaj w aplikacji " + name);
        System.out.println("version: 1.1");
    }

}
