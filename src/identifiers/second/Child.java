package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {
    // klasa potomna w innej paczce nie ma dostępu do pól domyślnych i private
    public void testIdentifier(){
        System.out.println(first); // pole publiczne dostępne w klasie dziedziczącej
        //System.out.println(second); // pole domyślne niedostępne dostępne w klasie dziedziczącej
        System.out.println(third); // pole protected dostępne w klasie dziedziczącej
        //System.out.println(fourth); // pole prywatne niedostępne w klasie dziedziczącej
        firstMethod();
        //secondMethod();
        thirdMethod();
        //fourthMethod(); // metoda prywatna niedostępna w klasie dziedziczącej
    }
}
