package animals;
// klasa abstrakcyjna
public abstract class Animal {

    // deklaracja zmiennej final statycznej
    public final static int legs = 4;
    // deklaracja metody abstrakcyjnej
    public abstract void sound();
    // zwykła metoda
    public void sayHello(){
        System.out.println("Hello! I am an animal.");
    }
}
