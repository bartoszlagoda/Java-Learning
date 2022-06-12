public class ReadOnly {

    private String name = "Bartek";
    private String lastname = "Nowak";
    private int age = 35;

    // metoda getName daje dostęp obiektowi klasy do prywatnego pola name
    public String getName() {
        return name;
    }

    // metoda getAge daje dostęp obiektowi klasy do prywatnego pola age
    public int getAge(){
        return age;
    }

    //metoda setName pozwala obiektowi klasy zmienić wartość prywatnego pola Name
    public void setAge(int age) {

        if (age < 0){
            // rzuć wyjątkiem, jeśli wartość będzie ujemna
            throw new IllegalArgumentException("Błąd! Wiek nie może być ujemny!");
        }
        this.age = age;
    }
}
