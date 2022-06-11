package PersonFile;

public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "University");
        //teacher.name = "Tom";
        //teacher.age = 29;
        //teacher.school = "University";
        /*teacher.sayHello();
        teacher.teachMath();*/
        teacher.walk();
        teacher.eat();

        Footballer footballer = new Footballer("Mike", 21, "Boca Juniors");
        //footballer.name = "Mike";
        //footballer.age = 21;
        //footballer.fotballClub = "Boca Juniors";
        //footballer.playFootball();
        //footballer.walk();
        footballer.eat();
    }

}
