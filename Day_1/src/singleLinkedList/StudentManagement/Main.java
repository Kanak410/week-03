package singleLinkedList.StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList records=new StudentLinkedList();
        // Add records
        records.addAtBeginning(1, "sakshi", 21, "B");
        records.addAtEnd(2, "kanak", 22, "A");
        records.addAtSpecific(2, 3, "sahil", 24, "A");

        // Display all records
        System.out.println("Student Records:");
        records.display();

        // Search for a record
        System.out.println("\nSearch Result:");
        System.out.println(records.searchRoll(2));

        // Update a grade
        System.out.println("\nUpdating Grade:");
        records.updateGrade(2, "A+");
        records.display();

        // Delete a record
        System.out.println("\nDeleting Record:");
        records.deleteRoll(3);
        records.display();

    }
}
