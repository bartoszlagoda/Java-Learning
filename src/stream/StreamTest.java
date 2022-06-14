package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        // tworzenie strumienia
        // 1. utworzenie listy z konkretnymi wartościami
        List<String> names = Arrays.asList("Tom", "John", "Mat", "Paul");
        //2. stworzenie strumienia dla powyższej listy
        Stream<String> streamNames = names.stream();
        // 3. Stworzenie strumienia dla nowopowstałej listy Intów
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1,2}).stream();
        // 4. wygenerowanie streama dla wartości Double
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4);
        // 5. wygenerowanie streama dla wartości int w zakresie
        IntStream intStream = IntStream.range(1,100);

        // przetwarzanie danych
        // filter - filtrowanie (podajemy za pomocą lambdy jakiś warunek, który ma spelnić
        // element w naszym strumieniu. Jeżeli spełni ten warunek to zostaje w naszym strumieniu,
        // jeżeli nie spełni, to jest w dalszych operacjach ignorowany.
        //map - pozwala nam zmienić każdy element na coś innego
        // limit - zwraca określoną liczbę elementów
        // peek - pozwala przeprowadzić operację na każdym elemencie

        //operacje pozwalające zakończyć strumień
        // forEach - ykonanie akcji dla każdego elementu ze strumienia
        // count - zwróci ilość elementów w strumieniu
        // allMatch - czy wszystkie elementy w strumieniu spełniają podany warunek, jeśli choć jeden
        // element nie spełnia tych warunków, to metoda zwraca False
        // collect - zwraca nowy typ na podstawie strumienia

        // sprawdź elementy zaczynające się na literę T i zwróc tylko te elementy
        List<String> modifiedNames = streamNames.filter(el -> el.startsWith("T")).
                map(el -> el.toUpperCase()) // TOM
                .collect(Collectors.toList());

        System.out.println(modifiedNames.get(0)); // zwrócony będzie tylko TOM
        System.out.println(modifiedNames.size()); // wielkość listy będzie 1

        // szukamy tylko elementów większych od 20 i potem mnożymy je przez 2 i zwracamy
        // tylko 10 elementów
        long count = intStream.filter(el -> el > 20)
                .map(el -> el * 2)
                //.limit(10) // chcemy pobrać tylko 10 elementów
                .count(); // zliczamy ilość elementów i powinno być ich 10

        System.out.println(count);


    }
}
