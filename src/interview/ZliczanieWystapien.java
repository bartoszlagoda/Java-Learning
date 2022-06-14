// zwraca liczbę wystąpień danej liczby
package interview;

import java.util.HashMap;
import java.util.Map;

public class ZliczanieWystapien {
    public static void main(String[] args) {

        liczWystapienia(new int[] {1,2,3,2,5,3,3,3,3,3,3,3,1,5});

    }

    public static void liczWystapienia(int[] numbers){
        Map<Integer,Integer> occurences = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            // w occurences już występuje dana liczba o konkretnym kluczu
            if(occurences.containsKey(numbers[i])){
                // pobranie wartości spod klucza numbers[i] i przypisanie do zmiennej value
                Integer value = occurences.get(numbers[i]);
                // dodanie wartości value + 1 do klucza numbers[i]
                occurences.put(numbers[i], value + 1);
            }else{
                // dodanie wartości 1 do klucza numbers[i]
                occurences.put(numbers[i], 1);
            }
        }
        System.out.println("Ilosc elementow w mapie " + occurences.size());
        for(Integer key : occurences.keySet()){
            System.out.println("Klucz: " + key);
            System.out.println("Wartość : " + occurences.get(key));
        }
    }
}
