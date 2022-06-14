package maps;

import java.util.HashMap;
import java.util.Map;

public class MapsTest {
    public static void main(String[] args) {

        // definiowanie mapy
        Map<Integer,String> students = new HashMap<>();

        //dodawanie wartości do mapy:
        students.put(1, "Basia");
        students.put(2, "Tomek");
        students.put(3, "Basia");

        // pobranie wartości z mapy:
        System.out.println(students.get(1)); // Basia

        // definiowanie drugiej mapy
        Map<Integer, String> othersStudents = new HashMap<>();
        // dodanie wszystkich elementów students do othersStudents
        othersStudents.putAll(students);
        // sprawdzenie czy zawiera klucz
        System.out.println(students.containsKey(1));
        // sprawdzenie czy zawiera wartość
        System.out.println(students.containsValue("Pawel"));

        System.out.println(students.isEmpty());
        System.out.println(students.size());
        // usuwanie elementów z mapy
        students.remove(1);
        System.out.println(students.size());

        for(Integer key : students.keySet()){
            System.out.println(key); // wypisuje klucz
            System.out.println(students.get(key)); // wypisuje wartość pod kluczem
        }

        for(String student : students.values()){
            System.out.println(student); // wypisuje wartości
        }
    }
}
