package lambda;

// interfejs, na podstawie którego będzie można utworzyć wyrażenie lambda
@FunctionalInterface
public interface Student {
    // metoda bez ciała
    void sayHello(String name, int age);
    // nie można utworzyć więcej niż jednej metody!
}
