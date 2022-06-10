import java.util.Scanner;

public class LoopsCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masz do wyboru dwa zadania:\n" +
                "1. Wypisuje elementy z zakresu 1-100 podzielne przez 3\n" +
                "2. Odwraca elementy tablicy [1,3,5] -> [5,3,1]");
        int task = scanner.nextInt();

        switch(task){
            case 1:
                System.out.println("W Switchu wybrano wartość 1");
                for(int i = 0; i < 100; i++){
                    if (i==0){
                        continue;
                    }else if(i%3==0){
                        System.out.println("Liczba : " + i + " jest podzielna przez 3");
                    }
                }
                break;
            case 2:
                System.out.println("W Switchu wybrano wartość 2");
                int[] tablica = new int[]{1,2,3,4,5,6,7,8,9};
                System.out.println("Pierwotna tablica to: ");
                for(int i =0;i < tablica.length; i++){
                    System.out.println(tablica[i]);
                }
                for(int i=0;i<tablica.length/2;i++){
                    int temp = tablica[i]; // dla i=0 będzie 1, dla i=1 będzie 3
                    tablica[i] = tablica[tablica.length-1-i]; //  4 -> 0 3 -> 7
                    tablica[tablica.length-1-i] = temp; //1 // numbers[3] = 3
                    System.out.println("Iteracja numer " + i);
                }
                System.out.println("Nowa tablica to: ");
                for(int i = 0; i < tablica.length; i++){
                    System.out.println(tablica[i]);
                }
        }
    }
}
