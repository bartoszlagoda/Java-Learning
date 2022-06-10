public class AutoTest {
    public static void main(String[] args) {
        // typ zmiennej to Auto, jak nazwa klasy
        Auto mercedes = new Auto();
        // przypisanie wartości do konkretnych pól klasy
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rokProdukcji = 2021;
        mercedes.przebieg = 1000;

        // wywołanie metod klasy Auto
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        // stworzenie nowego obiektu klasy Auto
        Auto audi = new Auto();
        // przypisanie wartości do obiektu klasy Auto
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rokProdukcji = 2020;
        audi.przebieg = 0;
        // wywołanie metod klasy Auto dla obiektu audi
        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noName = new Auto();
        noName.jedz();
        noName.hamuj();
        noName.info();

    }
}
