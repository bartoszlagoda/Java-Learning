public class InstrukcjaWarunkowaIfElse {
    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2.0F;
        if(dzielnik!=0){
            // blok kodu definiujemy za pomocą nawiasów klamrowych
            System.out.println("Wynik dzielenia to: " + (dzielna/dzielnik));
        }else{
            // co gdy pierwszy warunek będzie False
            System.out.println("Proszę, podaj inną liczbę.");
        }
        // to się wyświetli przy działaniu ifa i bez tego działania

    }
}
