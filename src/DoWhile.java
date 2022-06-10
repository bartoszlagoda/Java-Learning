public class DoWhile {
    public static void main(String[] args) {
        int number = 21; // zmienna referencyjna
        do {
            System.out.println("Moja wartość to: " + number + " i jestem mniejszy od 20");
            number++;
        }
        while(number < 20);
    }
}
