// Operatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println("Dodawanie : " + addition); // 10
        System.out.println("Odejmowanie : " + subtraction); // -2
        System.out.println("Mnozenie : " + multiplication); // 24
        System.out.println("Dzielenie : " + division); // 0,66
        // jeżeli dzielenie odbędzie się w int, to zwrócona zostanie tylko liczba przed przecinkiem
        System.out.println("Reszta z dzielenia - modulo : " + mod); // ile razy 4 mieści się w 6 = 1, modulo zwraca to co zostało, czyli 2

        firstNumber += secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber);
        firstNumber -= secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po odejmowaniu: " + firstNumber);
        firstNumber *= secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po mnożeniu: " + firstNumber);
        firstNumber /= secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po dzieleniu: " + firstNumber);
        firstNumber %= secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po modulo: " + firstNumber);
    }
}
