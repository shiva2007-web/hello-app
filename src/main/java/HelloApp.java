public class HelloApp {
    public static void main(String[] args) {
        // Ternary Operator: (condition) ? value_if_true : value_if_false
        String name = (args.length > 0) ? args[0] : "World";
        
        System.out.println("Hello, " + name + "!");
    }
}
