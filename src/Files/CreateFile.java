package Files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt"); // obiekt klasy dla nowego pliku
        if(file.createNewFile()){ // zwraca 0 albo 1 w zależności od stworzenia pliku
            System.out.println("Stworzyłem nowy plik");
        }else{
            System.out.println("Plik już istnieje");
        }
    }
}
