public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return; // Exit early if no args
        }

        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        // Enhanced for-loop (For-Each)
        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}
