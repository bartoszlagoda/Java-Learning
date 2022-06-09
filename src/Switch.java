import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String danie = scanner.nextLine();

        switch(danie){
            case "Pizza":
                System.out.println("Cena to 22 zł");
                break; // przerwanie pętli sterującej
            case "Losos":
                System.out.println("Cena to 35 zł");
                break;
            case "Frytki":
                System.out.println("Cena to 9 zł");
                break;
            default:
                System.out.println("Nie mamy takiego dania w karcie.");
        }
    }
}
