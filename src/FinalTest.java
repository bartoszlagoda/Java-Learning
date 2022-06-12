import PersonFile.Person;

public class FinalTest {
    // zdefiniowanie zmiennej Final
    final int x = 2; // typ zmiennej, której nie można zmienić
    // x = 5; // nie da się zmiennić tej wartości
    final Person peerson = new Person("Tim", 26);
    //peerson.age = 25; // da się zmienić wartość dla tego pola
    //peerson = new Person("Derek", 31); // nie da się przypisać nowych wartości do obiektu
}
