package PersonFile;
// Klasa bazowa posiadająca dwa podstawowe pola: imię i wiek
public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        System.out.println("--------------------------------------");
        System.out.println("Jestem w konstruktorze Person");
        System.out.println("--------------------------------------");
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("I like pizza!");
    }

    public void walk(){
        System.out.println("I like walking");
    }
}
