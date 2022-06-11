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
        // przypisanie wartości do obiektu klasy AutoFile.Auto
        Auto audi = new Auto("Krzysztof Kowalski", "Audi", "A5", 2020, 0);

        // wywołanie metod klasy AutoFile.Auto dla obiektu audi
        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto citroen = new Auto();

        citroen.wlasciciel = "Kamil Piotrowski";
        citroen.marka = "Citroen";
        citroen.model = "C2";
        citroen.rokProdukcji = 2010;
        citroen.przebieg = 65400;

        citroen.info();
    }
}
