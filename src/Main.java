import model.Items;
import service.VendingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        // Add sample items
        vm.addItem(new Items("C1", "Coke", 25, 5));
        vm.addItem(new Items("P1", "Pepsi", 30, 3));
        vm.addItem(new Items("S1", "Soda", 20, 2));


        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Vending Machine!");

        while (running) {
            System.out.println("\n1. Display Items");
            System.out.println("2. Insert Money");
            System.out.println("3. Purchase Item");
            System.out.println("4. Refund");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    vm.displayItems();
                    break;
                case 2:
                    System.out.print("Enter amount to insert: ₹");
                    int amount = scanner.nextInt();
                    vm.insertMoney(amount);
                    break;
                case 3:
                    System.out.print("Enter item code: ");
                    String code = scanner.next();
                    vm.purchase(code);
                    break;
                case 4:
                    vm.refund();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using the Vending Machine!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
