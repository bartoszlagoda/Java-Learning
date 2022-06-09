// Program sprawdza wiek osoby, która chce kupić alkohol
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź swój wiek, aby zakupić alkohol:");
        int age = scanner.nextInt();

        if ((age >= 18) && (age <= 122)){
            System.out.println("Dziękujemy za zakupy. Zapraszamy ponownie!");
        }else if((age > 0) && (age < 18)){
            System.out.println("Niestety nie możesz kupić alkoholu. Jesteś za młody/a");
        }else{
            System.out.println("Błąd! Wpisałeś niepoprawny wiek!");
        }
    }
}
