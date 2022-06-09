import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number < 0){
            System.out.println("Liczba jest ujemna");
        }else if(number == 0){
            System.out.println("Liczba wynosi 0");
        }else{
            System.out.println("Liczba jest dodatnia");
        }
    }
}
