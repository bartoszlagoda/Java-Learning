package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        // wprowadzamy do skanera plik
        Scanner myReader = new Scanner(file);
        // czy nasz plik posiada kolejną linię? Jeżeli tak to ją pobierz i wyświetl na ekranie
        while (myReader.hasNext()){
            // pobranie tej linii
            String line = myReader.nextLine();
            // wypisanie tej linii na ekranie
            System.out.println(line);
        }
    }
}
