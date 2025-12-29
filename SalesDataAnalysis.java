public class SalesDataAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Product " + i);
        }
        System.out.println("please Enter product sales level:");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Low Sales Product");
        }
        else if (choice == 2) {
            System.out.println("Best-Selling Product");
        }
        else {
            System.out.println("Invalid sales value entered... try again");
        }
    }
}
