
/**
 * Main class demonstrating the Validatable interface pattern.
 * Shows how validation prevents invalid objects from being created.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Validatable Interface Demo ===\n");
        
        // Example 1: Valid student - object is created successfully
        System.out.println("Creating valid student:");
        try {
            Student student1 = new Student("Alice Johnson", 20, "S12345");
            System.out.println("Success! " + student1);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed: " + e.getMessage());
        }
        
        System.out.println();
        
        // Example 2: Invalid student - empty name
        System.out.println("Attempting to create student with empty name:");
        try {
            Student student2 = new Student("", 20, "S12346");
            System.out.println("Success! " + student2);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed: " + e.getMessage());
        }
        
        System.out.println();
        
        // Example 3: Invalid student - negative age
        System.out.println("Attempting to create student with negative age:");
        try {
            Student student3 = new Student("Bob Smith", -5, "S12347");
            System.out.println("Success! " + student3);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed: " + e.getMessage());
        }
        
        System.out.println();
        
        // Example 4: Invalid student - empty student ID
        System.out.println("Attempting to create student with empty ID:");
        try {
            Student student4 = new Student("Carol White", 22, "");
            System.out.println("Success! " + student4);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed: " + e.getMessage());
        }
        
        System.out.println();
        
        // Example 5: Another valid student
        System.out.println("Creating another valid student:");
        try {
            Student student5 = new Student("David Brown", 19, "S12348");
            System.out.println("Success! " + student5);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed: " + e.getMessage());
        }
    }
}
