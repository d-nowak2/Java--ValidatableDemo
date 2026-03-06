/**
 * Student class that implements Validatable interface.
 * Demonstrates validation of constructor parameters.
 */
public class Student implements Validatable {
    private String name;
    private int age;
    private String studentId;
    
    /**
     * Constructor that validates data before creating the object.
     * @param name Student's name
     * @param age Student's age
     * @param studentId Student's ID number
     * @throws IllegalArgumentException if validation fails
     */
    public Student(String name, int age, String studentId) {
        // Temporarily assign values so validate() can check them
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        
        // Call validate() - required by Validatable interface
        // If validation fails, an exception is thrown before object is fully created
        validate();
    }
    
    /**
     * Validates the student data according to business rules.
     * @throws IllegalArgumentException if any validation rule fails
     */
    @Override
    public void validate() throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty");
        }
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", studentId='" + studentId + "'}";
    }
}
