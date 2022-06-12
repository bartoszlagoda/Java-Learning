package InterfaceExamples;

import InterfaceExamples.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void jazda(int speed) {
        System.out.println("Jadę ciężarówką z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuję ciężarówką!");

    }

    @Override
    public String info() {
        return "Ciężarówka";
    }

    public void Zatankuj(){
        System.out.println("Po przejechaniu 600 km muszę zatankować na stacji paliw!");
    }
}
