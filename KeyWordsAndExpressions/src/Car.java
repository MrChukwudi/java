public class Car {
    //Fields
    private String make;
    private String model;
    private String color;
    private int door;
    private boolean isConvertible;


    //Getters:
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    //Setters:
    public void setMake(String make){

        //Adding validation to our field setter:
        if(make == null)  make = "Unknown";

        String lowercaseMake = make.toLowerCase();

        switch(lowercaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    //Method:
    public void describeCar(){
        System.out.println("Doors: => " + door +
                " Model: => " + model +
                " Color: => " + color +
                " Make: => " + make +
                (isConvertible ? " Convertible" : " Not Convertible"));
    }


}
