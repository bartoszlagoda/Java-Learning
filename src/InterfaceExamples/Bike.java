package InterfaceExamples;

public class Bike implements Vehicle {

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę rowerem z prędkością " + speed);

    }

    @Override
    public void stop() {
        System.out.println("Hamuję rowerem! Naciskam mocno na hamulec!");

    }

    @Override
    public String info() {
        return "Rower";
    }

    public void PompujKola(){
        System.out.println("Co 50 km muszę napompować koła w rowerze!");
    }
}
