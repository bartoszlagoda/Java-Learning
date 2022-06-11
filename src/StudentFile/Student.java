package StudentFile;

public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "PWR";

    public void przedstawSie(){
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }

    public void zalogujSie(){
        System.out.println("Loguję się za pomocą " + nick);
    }

    public void podajNrIndeksu(){
        System.out.println("Moj numer indeksu to : " + numerIndeksu);
    }

    public void podajEmail(){
        System.out.println("Moj adres email to : " + email);
    }

    public static void infoUczelni(){
        System.out.println("Moja uczelnia to " + nazwaUczelni);
        druga();
    }

    public static void druga(){
        System.out.println("Jestem drugą metodą");
    }

}
