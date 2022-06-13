package Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test.txt");
        // zapisanie danch do istniejącego pliku
        writer.write("Owner of File : Bartosz Lagoda\n" +
                "Date: 13/06/2022\n" +
                "Text: Crete new File and Write text in this File.");
        // za każdym wywołaniem tekst jest nadpisywany w pliku
        writer.close();
    }
}
