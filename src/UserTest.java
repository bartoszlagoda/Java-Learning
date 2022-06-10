public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        User user2 = new User("Bartosz", "Barte09k");
        user.username = "Bartek";
        user.password = "QWERTY";
        user.sayHello();
        System.out.println(user2.username);
        System.out.println(user2.password);
    }
}
