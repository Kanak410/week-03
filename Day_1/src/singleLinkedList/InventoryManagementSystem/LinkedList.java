package singleLinkedList.InventoryManagementSystem;

public class LinkedList {
    private Node head;

    // Add an item at the beginning
    public void addAtBeginning(String ItemName, int ItemId, double quantity, double price) {
        Node newNode = new Node(ItemName, ItemId, quantity, price);
        newNode.setNext(head);
        head = newNode;
    }

    // Add an item at the end
    public void addAtEnd(String ItemName, int ItemId, double quantity, double price) {
        Node newNode = new Node(ItemName, ItemId, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    // Add an item at a specific position
    public void addAtPosition(int position, String ItemName, int ItemId, double quantity, double price) {
        if (position == 1) {
            addAtBeginning(ItemName, ItemId, quantity, price);
            return;
        }
        Node newNode = new Node(ItemName, ItemId, quantity, price);
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.getNext();
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    // Remove an item based on Item ID
    public void removeById(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.getItemId() == itemId) {
            head = head.getNext();
            return;
        }
        Node current = head;
        while (current.getNext() != null && current.getNext().getItemId() != itemId) {
            current = current.getNext();
        }
        if (current.getNext() == null) {
            System.out.println("Item not found.");
            return;
        }
        current.setNext(current.getNext().getNext());
    }

    // Update the quantity of an item by Item ID
    public void updateQuantity(int itemId, int newQuantity) {
        Node current = head;
        while (current != null) {
            if (current.getItemId() == itemId) {
                current.setQuantity(newQuantity);
                System.out.println("Quantity updated successfully.");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Item not found.");
    }

    // Search for an item by Item ID or Item Name
    public String searchByIdOrName(int itemId, String itemName) {
        Node current = head;
        while (current != null) {
            if (current.getItemId() == itemId || current.getItem().equalsIgnoreCase(itemName)) {
                return "Item Name: " + current.getItem() + ", Item ID: " + current.getItemId() +
                        ", Quantity: " + current.getQuantity() + ", Price: " + current.getPrice();
            }
            current = current.getNext();
        }
        return "Item not found.";
    }
    public double calculateTotalValue(){
        double totalValue=0;
        Node current=head;
        while(current!=null){
            totalValue+= current.getQuantity()*current.getPrice();
            current=current.getNext();
        }
        return totalValue;
    }
    // Sort the inventory by Item Name or Price in ascending order
    public void sortInventoryBynameOrPrice(boolean byName){
        if(head==null||head.getNext()==null){
            return;
        }
        boolean swap;
        do{
            swap=false;
            Node current=head;
            while(current.getNext()!=null){
                Node nextNode=current.getNext();
                boolean condition =byName;
                if (byName) {
                    condition = current.getItem().compareToIgnoreCase(nextNode.getItem()) > 0;
                } else {
                    condition = current.getPrice() > nextNode.getPrice();
                }
                if (condition) {
                    // Swap data
                    String tempName = current.getItem();
                    int tempId = current.getItemId();
                    double tempQty = current.getQuantity();
                    double tempPrice = current.getPrice();

                    current.setItem(nextNode.getItem());
                    current.setItemId(nextNode.getItemId());
                    current.setQuantity(nextNode.getQuantity());
                    current.setPrice(nextNode.getPrice());

                    nextNode.setItem(tempName);
                    nextNode.setItemId(tempId);
                    nextNode.setQuantity(tempQty);
                    nextNode.setPrice(tempPrice);

                    swap = true;
                }
                current = current.getNext();
            }
        } while (swap);


    }
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println("Item Name: " + current.getItem() + ", Item ID: " + current.getItemId() +
                    ", Quantity: " + current.getQuantity() + ", Price: " + current.getPrice());
            current = current.getNext();
        }
    }




}
