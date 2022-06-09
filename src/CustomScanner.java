import java.util.Scanner; // paczka dla Scannera

public class CustomScanner {

    public static void main(String[] args) {
        // tworzymy obiekt klasy Scanner
        Scanner scanner = new Scanner(System.in); // [typ obiektowy] [nazwa_zmiennej}
        System.out.println("Proszę, podaj swoje imię:");
        // wywołujemy metodę klasy Scanner do wpisywania danych przez użytkownika
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + "!");
        System.out.println("Proszę, podaj pierwszą liczbę:");
        int firstNumber = scanner.nextInt();
        System.out.println(name + ", kwadrat tej liczby to: " + firstNumber*firstNumber);

    }
}
