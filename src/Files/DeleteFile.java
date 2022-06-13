package Files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        // metoda da true jeśli uda się usunąć plik
        if(file.delete()){
            System.out.println("Plik został usunięty.");
        }else{
            System.out.println("Nie udało się usunąć pliku.");
        }
    }
}
