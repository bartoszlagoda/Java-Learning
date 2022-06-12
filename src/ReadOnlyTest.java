import org.w3c.dom.ls.LSOutput;

public class ReadOnlyTest {
    public static void main(String[] args) {
        ReadOnly readOnly = new ReadOnly();

        System.out.println(readOnly.getName());
        readOnly.setAge(23);
        System.out.println(readOnly.getAge());

    }
}
