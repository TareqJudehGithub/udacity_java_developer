package defineClass;

/**
 * Define a dog class exercise
 * @author Tareq Judeh
 */
public class Dog {
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    // Class constructor

    /**
     * class constructor that initializes class new objects created.
     * @param dogType  Describes dog type.
     * @param dogName  Describes dog name.
     * @param dogColor Describes dog color.
     * @param dogAge   Describes dog age.
     */
    public Dog(String dogType, String dogName, String dogColor, int dogAge){
        //DogObject.classVariable = ObjectParameter
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }
    // Access methods
   public String getDogType(){
        return dogType;
   }
    public String getDogName(){
        return dogName;
    }
    public String getDogColor(){
        return dogColor;
    }
    public int getDogAge(){
        return dogAge;
    }

    // Mutator methods
    public void setDogType(String dogType){
        this.dogType = dogType;
    }
    public void setDogName(String dogName){
        this.dogName = dogName;
    }
    public void setDogColor(String dogColor){
        this.dogColor = dogColor;
    }
    public void setDogAge(int dogAge){
        this.dogAge = dogAge;
    }

    @Override
    public String toString(){
        return "Dog Type: " + dogType + "\nDog Name: " + dogName + "\nDog Color: " + dogColor
                + "\nDog Age: " + dogAge;
    }
}
