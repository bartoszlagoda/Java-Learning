public class While {
    public static void main(String[] args) {
        // Wartość tej zmiennej powinna spowodować niewykonanie się pętli
        int number = 0; // zmienna referencyjna
        while (number < 20){
            System.out.println("Moja wartość to: " + number + " i jestem mniejszy od 20");
            number++; // inkrementacja wartości po wykonaniu instrukcji
        }
    }
}
