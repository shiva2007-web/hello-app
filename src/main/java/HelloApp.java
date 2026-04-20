import java.util.Arrays;
import java.util.stream.Collectors;

public class HelloApp {
    public static void main(String[] args) {
        // UC7: Evolution to Stream-based processing with Input Validation
        String joinedNames = Arrays.stream(args)
                .filter(name -> name != null && !name.trim().isEmpty())
                .filter(name -> !name.matches("\\d+")) // UC7: Ignore purely numeric inputs
                .collect(Collectors.joining(", "));

        if (joinedNames.isEmpty()) {
            System.out.println("Hello, World!");
        } else {
            System.out.println("Hello, " + joinedNames + "!");
        }
    }
}
