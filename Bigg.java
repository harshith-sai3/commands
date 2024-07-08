public class Bigg {
    public static void main(String[] args) {
        // Check if there are exactly three arguments
        if (args.length < 3) {
            System.out.println("Error: Please provide three integers as arguments.");
            return; // Exit the program
        }

        // Parse arguments to integers
        int n1, n2, n3;
        try {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            n3 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integers as arguments.");
            return; // Exit the program
        }

        // Determine the largest number
        if ((n1 >= n2) && (n1 >= n3)) {
            System.out.println("A is bigger");
        } else if ((n2 >= n1) && (n2 >= n3)) {
            System.out.println("B is bigger");
        } else {
            System.out.println("C is bigger");
        }
    }
}

