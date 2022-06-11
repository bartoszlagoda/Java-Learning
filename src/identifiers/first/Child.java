package identifiers.first;

public class Child extends Parent {
    // klasa potomna w tej samej paczce nie ma dostępu do pól private
    public void testIdentifier(){
        System.out.println(first); // pole publiczne dostępne w klasie dziedziczącej
        System.out.println(second); // pole domyślne dostępne w klasie dziedziczącej
        System.out.println(third); // pole protected dostępne w klasie dziedziczącej
        //System.out.println(fourth); // pole prywatne niedostępne w klasie dziedziczącej
        firstMethod();
        secondMethod();
        thirdMethod();
        //fourthMethod(); // metoda prywatna niedostępna w klasie dziedziczącej
    }
}
