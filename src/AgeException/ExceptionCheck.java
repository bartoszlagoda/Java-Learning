package AgeException;

public class ExceptionCheck {
    private int age;

    public String getAge(){
        if (age > 17){
            return "Masz " + age + " lat. Jesteś pełnoletni!";
        }
        return "Nie jesteś jeszcze pełnoletni :(";
    }
    public void setAge(int age){
        if (age < 0){
            throw new InvalidAgeException("Invalid Age Exception. Age cannot be less than 0.");
        }
        this.age = age;
    }
}
