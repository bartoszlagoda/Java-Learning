import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Drogi użytkowniku,\nponiżej znajduje się kalkulator, który wykona dla Ciebie podstawowe działania\n" +
                "na liczbach, które ty przekażesz. Tymi podstawowymi działaniami będą:\n" +
                "Dodawanie, odejmowanie, mnożenie, dzielenie i modulo.\n\nPodaj pierwszą liczbę:");
        float firstNumber = scanner.nextFloat();
        System.out.println("Podaj drugą liczbę:");
        float secondNumber = scanner.nextFloat();
        System.out.println("Oto wyniki działań:\n");
        System.out.println("Wynikiem dodawania powyższych liczb jest : " + (firstNumber + secondNumber));
        System.out.println("Wynikiem odejmowania powyższych liczb jest : " + (firstNumber - secondNumber));
        System.out.println("Wynikiem mnożenia powyższych liczb jest : " + (firstNumber * secondNumber));
        System.out.println("Wynikiem dzielenia powyższych liczb jest : " + (firstNumber / secondNumber));
        System.out.println("Wynikiem modulo powyższych liczb jest : " + (firstNumber % secondNumber));
    }
}
