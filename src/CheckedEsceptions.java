import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedEsceptions {

    // metoda statyczna main będzie również wyrzucać wyjątek
    public static void main(String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("C://Users//barte//IdeaProjects//Java//src//TryFile.txts");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage()); // pobranie wiadomości dotyczącej wyjątku
        } finally{ // ten blok wywoła się zawsze
            System.out.println("Closing file");
        }
    }

    // metoda readFile będzie wyrzucać wyjątek FileNotFoundException
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}
