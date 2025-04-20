import java.util.Scanner;
import java.util.Vector;

public class ShoppingListManager {
    public static void main(String[] args) {
        // Create a Vector to store shopping list items
        Vector<String> shoppingList = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        // Accept 5 items for the shopping list
        System.out.println("Enter 5 items for your shopping list:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            shoppingList.add(scanner.nextLine());
        }

        System.out.println("\nYour shopping list: " + shoppingList);

        // Task a: Delete an item from the list
        System.out.print("\nEnter the item to delete: ");
        String itemToDelete = scanner.nextLine();
        if (shoppingList.remove(itemToDelete)) {
            System.out.println("Item deleted successfully.");
        } else {
            System.out.println("Item not found in the list.");
        }
        System.out.println("Updated shopping list: " + shoppingList);

        // Task b: Add an item at a specified location
        System.out.print("\nEnter the item to add: ");
        String itemToAdd = scanner.nextLine();
        System.out.print("Enter the position (0 to " + shoppingList.size() + "): ");
        int position = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (position >= 0 && position <= shoppingList.size()) {
            shoppingList.add(position, itemToAdd);
            System.out.println("Item added successfully at position " + position + ".");
        } else {
            System.out.println("Invalid position.");
        }
        System.out.println("Updated shopping list: " + shoppingList);

        // Task c: Add an item at the end of the list
        System.out.print("\nEnter the item to add at the end: ");
        String itemToEnd = scanner.nextLine();
        shoppingList.add(itemToEnd);
        System.out.println("Item added successfully at the end.");
        System.out.println("Final shopping list: " + shoppingList);

        scanner.close();
    }
}
