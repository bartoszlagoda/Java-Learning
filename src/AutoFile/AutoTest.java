package AutoFile;

import AutoFile.Auto;

public class AutoTest {
    public static void main(String[] args) {
        // typ zmiennej to AutoFile.Auto, jak nazwa klasy
        Auto mercedes = new Auto("Michał Nowak", "Mercedes", "Klasa S", 2021, 1000);

        // wywołanie metod klasy AutoFile.Auto
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        // stworzenie nowego obiektu klasy AutoFile.Auto
        Auto audi = new Auto("Krzysztof Kowalski", "Audi", "A5", 2020, 0);
        // przypisanie wartości do obiektu klasy AutoFile.Auto
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rokProdukcji = 2020;
        audi.przebieg = 0;
        // wywołanie metod klasy AutoFile.Auto dla obiektu audi
        audi.jedz();
        audi.hamuj();
        audi.info();
    }
}
