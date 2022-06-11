package identifiers.second;

import identifiers.first.Parent;

public class Random {
    // klasa w innej paczce nie ma dostępu do pol/metod private, default i protected
    public void testIdentifier() {

        Parent parent = new Parent();
        System.out.println(parent.first); // pole publiczne dostępne
        //System.out.println(parent.second); // pole domyślne niedostępne
        //System.out.println(parent.third); // pole protected niedostępne
        //System.out.println(parent.fourth); // pole prywatne niedostępne
        parent.firstMethod();// metoda publiczna dostępna
        //parent.secondMethod(); // metoda domyślna niedostępna
        //parent.thirdMethod(); // metoda protected niedostępna
        //parent.fourthMethod(); // metoda prywatna niedostępna
    }
}
