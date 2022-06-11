package identifiers.first;

public class Random {
    // klasa w tej samej paczce nie ma dostępu do pól/metod private
    public void testIdentifier() {

        Parent parent = new Parent();
        System.out.println(parent.first); // pole publiczne dostępne
        System.out.println(parent.second); // pole domyślne dostępne
        System.out.println(parent.third); // pole protected dostępne
        //System.out.println(parent.fourth); // pole prywatne niedostępne
        parent.firstMethod();// metoda publiczna dostępna
        parent.secondMethod(); // metoda domyślna dostępna
        parent.thirdMethod(); // metoda protected dostępna
        //parent.fourthMethod(); // metoda prywatna niedostępna
    }
}
