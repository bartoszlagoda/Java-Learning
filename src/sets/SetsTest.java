package sets;

import java.util.HashSet;
import java.util.Set;

public class SetsTest {
    public static void main(String[] args) {

        // deklaracja zbioru
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange"); // nie zostanie dodany, bo to duplikat

        // sprawdzenie czy zawiera daną wartość
        System.out.println(fruits.contains("apple"));
        // sprawdzenie rozmiaru seta
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        // deklaracja drugiego zbioru
        Set<String> vege = new HashSet<>();

        vege.add("potatoes");
        vege.add("onion");

        // dodanie wartości seta do innego seta
        vege.addAll(fruits);
        System.out.println(vege.size());

        // przechodzenie po wszystkich elementach Seta
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
