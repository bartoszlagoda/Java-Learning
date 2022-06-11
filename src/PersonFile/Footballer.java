package PersonFile;

public class Footballer extends Person {
// Klasa, która będzie dziedziczyć po klasie Person
    // aktualnie wprowadzono podstawowe dane
    public String fotballClub;

    public Footballer(String name, int age, String fotballClub) {
        super(name, age);
        System.out.println("--------------------------------------");
        System.out.println("Jestem w konstruktorze Footballer");
        System.out.println("--------------------------------------");
        this.fotballClub = fotballClub;
    }

    public void eat(){
        System.out.println("I like healthy food!");
    }

    public void playFootball(){
        System.out.println("I'm playing football for " + fotballClub);
    }
}
