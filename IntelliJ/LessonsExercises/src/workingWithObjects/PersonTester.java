package workingWithObjects;

public class PersonTester {
    public static void main(String[] args){

        // Instantiate new objects from class Person
        Person john = new Person("John", "Smith");
        Person sarah = new Person("Sarah", "Jones");

        // Print out instantiated objects:
        System.out.println(john);
        System.out.println(sarah);
    }

}
