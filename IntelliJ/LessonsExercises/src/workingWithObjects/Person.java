package workingWithObjects;

/**
 * Person class. Creates persons first and last name.
 * @author Tareq Judeh
 */
public class Person {

    // Class variables (instances)
    private String firstName;
    private String lastName;

    /**
     * class constructor Person.
     * @param firstName Provides person first name.
     * @param lastName  Provides person last name.
     */
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter(Access) methods
    public String getFirstName(String firstName) {
        return firstName;
    }
    public String getLastName(String lastName){
        return lastName;
    }

    // Setter (mutator) methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "\nFirst Name: " + firstName + "\nLast Name: " + lastName;
    }
}
