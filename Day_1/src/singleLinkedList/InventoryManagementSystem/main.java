package singleLinkedList.InventoryManagementSystem;

public class main {
    public static void main(String[] args) {
        LinkedList inventory = new LinkedList();

        // Add items
        inventory.addAtBeginning("Laptop", 101, 5, 50000.0);
        inventory.addAtEnd("Phone", 102, 10, 20000.0);
        inventory.addAtPosition(2, "Tablet", 103, 7, 30000.0);

        // Display all items
        System.out.println("Inventory Items:");
        inventory.displayInventory();

        // Search for an item
        System.out.println("\nSearch Result:");
        System.out.println(inventory.searchByIdOrName(102, ""));

        // Update quantity
        System.out.println("\nUpdating Quantity:");
        inventory.updateQuantity(101, 8);
        inventory.displayInventory();

        // Remove an item
        System.out.println("\nRemoving Item:");
        inventory.removeById(103);
        inventory.displayInventory();

        // Calculate total value
        System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalValue());

        // Sort by Item Name
        System.out.println("\nSorting by Item Name:");
        inventory.sortInventoryBynameOrPrice(true);
        inventory.displayInventory();

        // Sort by Price
        System.out.println("\nSorting by Price:");
        inventory.sortInventoryBynameOrPrice(false);
        inventory.displayInventory();
    }
    }

