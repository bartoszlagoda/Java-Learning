package lambda;

public class StudentTest {
    public static void main(String[] args) {
        // deklaracja nowego obiektu interfejsu Student
        Student it = new ItStudent();
        // przy wywołaniu wyrażenia lambda należy podać jaki obiekt jest wykorzystywany
        sayHello("John", 36, it);

        // nie musimy definiować nowej klasy, możemy skorzystać z klasy anonimowej
        Student med = new Student() {
            @Override
            public void sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
                System.out.println("I'm " + age);
            }
        };

        sayHello("Kate", 24, med);

        // lambda
        // (parametr) -> System.out.println("text");
        Student notStudent = (name, age) -> {
            System.out.println("I am not a student. My name is " + name +
                "\nI'm " + age);
            if(age>17){
                System.out.println("You can buy a beer");
            }
        };
        sayHello("Tom", 21, notStudent);

    }

    public static void sayHello(String name, int age, Student student){
        student.sayHello(name, age);
    }
}
