/**
 * Interface that enforces validation capability on implementing classes.
 * Any class implementing this interface must provide a validate() method.
 */
public interface Validatable {
    /**
     * Validates the object's data.
     * @throws IllegalArgumentException if validation fails
     */
    void validate() throws IllegalArgumentException;
}
