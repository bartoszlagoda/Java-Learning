package AutoFile;

public class Auto {

    public String wlasciciel;
    public String marka;
    public String model;
    public Integer rokProdukcji;
    public Integer przebieg;

    public Auto(String wlasciciel, String marka, String model, Integer rokProdukcji, Integer przebieg){
        this.wlasciciel = wlasciciel;
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void jedz(){
        System.out.println("Jade!");
    }

    public void hamuj(){
        System.out.println("Hamuj!");
    }

    public void info(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }
}
