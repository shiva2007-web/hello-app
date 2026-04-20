public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            // Traditional for loop
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                // Add a comma and space except for the last name
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}
