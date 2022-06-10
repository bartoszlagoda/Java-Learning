public class Metody {
    public void policzWynik(){
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++){
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
    }

    public int pobierzWynik(){
        // metodę zadeklarowano jako typ int
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++){
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
        // metoda ta musi więc zwracać wartość int
        return result;
    }
    // number zostanie podane w momencie wywołania metody
    public void policzWynikParam(int number){
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < number; i++){
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
    }

    public int add(int firstNumber, int SecondNumber){
        System.out.println("Suma podanych przez Ciebie liczb to : " + (firstNumber+SecondNumber));
        return firstNumber + SecondNumber;
    }
}
