import java.util.Scanner;

// porównują elementy równania i zwracają logiczną wartość (true/false)
public class OperatoryPorownania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Poznajemy zsady operacji porównania w Javie.");
        System.out.println("Twoim zadaniem jest wprowadzić dwie liczby, które zostaną ze sobą porównane.");
        System.out.println("Wprowadź pierwszą liczbę:");
        int firstNumber = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę");
        int secondNumber = scanner.nextInt();

        System.out.println("Czy liczba " + firstNumber + " jest równa liczbie " + secondNumber + "?\n" + (firstNumber == secondNumber));
        System.out.println("Czy liczba " + firstNumber + " jest różna od liczby " + secondNumber + "?\n" + (firstNumber != secondNumber));
        System.out.println("Czy liczba " + firstNumber + " jest większa od liczby " + secondNumber + "?\n" + (firstNumber > secondNumber));
        System.out.println("Czy liczba " + firstNumber + " jest mniejsza od liczby " + secondNumber + "?\n" + (firstNumber < secondNumber));
        System.out.println("Czy liczba " + firstNumber + " jest większa bądź równa liczbie " + secondNumber + "?\n" + (firstNumber >= secondNumber));
        System.out.println("Czy liczba " + firstNumber + " jest mniejsza bądź równa liczbie " + secondNumber + "?\n" + (firstNumber <= secondNumber));
    }
}
