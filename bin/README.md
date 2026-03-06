# Validatable Interface Demo

A simple Java project demonstrating how to use an interface to enforce validation in constructors.

## Project Structure

- **Validatable.java** - Interface that defines the validation contract
- **Student.java** - Concrete class implementing the interface
- **Main.java** - Demo program showing validation in action

## Key Concepts

### The Validatable Interface
- Declares a `validate()` method that all implementing classes must provide
- Enforces a consistent validation pattern across different classes

### Implementation Pattern
1. The `Student` class implements `Validatable`
2. In the constructor, data is assigned to fields
3. The `validate()` method is called immediately
4. If validation fails, an exception is thrown before the object is fully created
5. This ensures no invalid objects can exist in the system

### Validation Rules (Student Example)
- Name cannot be empty
- Age must be between 0 and 120
- Student ID cannot be empty

## How to Run

Compile all files:
```bash
javac Validatable.java Student.java Main.java
```

Run the demo:
```bash
java Main
```

## Expected Output

The demo shows:
- ✓ Successful creation of valid students
- ✗ Failed attempts to create students with invalid data
- Each failure shows the specific validation error message

## Learning Points

1. **Interface as a Contract**: The interface forces implementing classes to provide validation
2. **Constructor Validation**: Validation happens immediately, preventing invalid objects
3. **Fail-Fast Principle**: Bad data is caught early, not later in the program
4. **Reusability**: The Validatable pattern can be applied to any class that needs validation

## Extending This Example

You could add more classes that implement Validatable:
- `Course` (validate course code, credits, capacity)
- `Employee` (validate employee ID, salary, department)
- `Product` (validate price, stock quantity, SKU)

Each would follow the same pattern: implement the interface and validate in the constructor.
