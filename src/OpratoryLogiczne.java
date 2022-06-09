// działają na wartościach logicznych zwracając również wartości logiczne
public class OpratoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        // && operator AND -> true wtedy gdy wszystkie wyrażenia są true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && thirdValue); // true
        System.out.println(secondValue && thirdValue); // false

        // || OR -> true gdy jedno wyrażenie składowe jest równe true
        System.out.println(firstValue || secondValue); // true
        System.out.println(secondValue || fourthValue); // false
        System.out.println(secondValue || thirdValue); // true

        // ! NOT - zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstValue); // false
        System.out.println(!secondValue); // true
        System.out.println(!(firstValue && secondValue)); // true
    }
}
