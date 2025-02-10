import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        System.err.println("jsj");

        String opt = Optional.of("asdf").orElseGet(() -> "1111");
    }
}
