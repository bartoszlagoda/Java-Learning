public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik(); // to wydrukuje rezultat metody
        int result = metody.pobierzWynik(); // to też wydrukuje rezultat metody
        int result2 = result * 2;
        System.out.println("=============================================");
        System.out.println("Wynik przed mnożeniem to: " + result);
        System.out.println("Wynik pomnożony przez 2 da nam: " + result2);
        System.out.println("=============================================");
        System.out.println("Metoda z parametrem");
        metody.policzWynikParam(230);
        metody.policzWynikParam(23);
        metody.policzWynikParam(100);
        metody.add(2,3);
        metody.add(2,6);
        int a = metody.add(13,14);
        int b = metody.add(25,67);
        System.out.println("Wynikiem z dodawania " + a + " oraz " + b + " jest : " + (a+b));
    }
}
