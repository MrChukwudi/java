//Making Dog class to Inherit the Animal Class:
public class Dog extends Animal{
    private String earShape;
    private String tailShape;



    //Constructor 2 that calls the Constructor 1:
    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }


    //Constructor 2 that calls the Super:
    public Dog(String type, double weight, String earshape, String tailshape){
        super(type, weight); //In all child class, you must call the constructor of the Parent class as thus:
        earShape = earshape;
        tailShape = tailshape;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString(); // This is how we will call a method in the Super/Parent class:
    }
}