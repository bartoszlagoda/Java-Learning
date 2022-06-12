package AgeException;
import java.util.Scanner;

public class ExceptionCheckTest {
    public static void main(String[] args) {
        ExceptionCheck exceptionCheck = new ExceptionCheck();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź wiek: ");
        int age = scanner.nextInt();
        exceptionCheck.setAge(age);
        System.out.println(exceptionCheck.getAge());
    }
}
