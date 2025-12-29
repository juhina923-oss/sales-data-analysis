public class SalesDataAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 8; i++) {
            System.out.println("Product " + i);
        }
        System.out.println("please Enter product sales level:");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Product with Low Sales");
        }
        else if (choice == 2) {
            System.out.println("Best-Selling Product");
        }
        else {
            System.out.println("Invalid sales value entered. Please enter 1 or 2.");
        }
    }
}
