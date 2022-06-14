package listy;

import docs.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        // deklaracja obiektu klasy ArrayList
        List<String> names = new ArrayList<>();
        // dodanie elemntów do listy
        names.add("Pawel");
        names.add("Kasia");
        names.add("Ola");
        names.add("Pawel");
        // wywołanie elementów listy
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        // sprawdza na którym indeksie znajduje się 'Pawel'
        System.out.println("Paweł znajduje się na indeksie: " + names.indexOf("Pawel"));
        // sprawdza na jakim ostatnim indeksie znajduje sie 'Pawel'
        System.out.println("Ostatni indeks na którym znajduje się Paweł to : " + names.lastIndexOf("Pawel"));
        // czy lista zawiera element Krysia
        System.out.println("Czy w indeksie znajduje się imię Krysia?" + names.contains("Krysia"));
        System.out.println("Czy w indeksie znajduje się imię Paweł?" + names.contains("Pawel"));
        // czy nasza lista jest pusta
        System.out.println("Czy lista names jest pusta?" + names.isEmpty());

        System.out.println("---------------------------");
        System.out.println("      LISTA LINKED         ");
        System.out.println("---------------------------");

        List<Integer> numbers = new LinkedList<>();

        // dodanie elementów do listy
        for (int i = 0; i < 4; i++){
            numbers.add(i+1);
        }

        // wyświetlenie elementów z listy
        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        // sprawdza na którym indeksie znajduje się 'Pawel'
        System.out.println("Liczba 3 jest w inkdeksie : " + numbers.indexOf(3));
        // sprawdza na jakim ostatnim indeksie znajduje sie 'Pawel'
        System.out.println("Liczba 2 znajduje się na ostatnim indeksie: " + numbers.lastIndexOf(2));
        // czy lista zawiera element Krysia
        System.out.println("Czy lista names zawiera liczbę 1? " + numbers.contains(1));
        System.out.println("Czy lista names zawiera liczbę 2? " + numbers.contains(2));
        // czy nasza lista jest pusta
        System.out.println(" Czy lista names jest pustą listą? " + numbers.isEmpty());

        List<String> diffNames = new ArrayList<>();
        // dodanie wszystkich elementów listy names do nowej listy
        diffNames.addAll(names);
        System.out.println("Wyświetlenie nowej listy addAll, która dziedziczy po names: ");

        for(int i = 0; i < diffNames.size(); i++){
            System.out.println(diffNames.get(i));
        }

        List<PdfDocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PdfDocument()); // dodanie nowego obiektu klasy PdfDocument do listy

        // for([typ zmiennej] [nazwa_pojedynczego_el] : [nazwa_kolekcji]
        for(String name : names){
            System.out.println(name);
        }




    }
}
