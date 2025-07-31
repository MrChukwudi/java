public class Animal{
    private String type;
    private String size;
    private double weight;

    public Animal(String type, double weight) {
        this.type = type;
        this.size = weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large");
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Animal{" + "Type = " + this.type + "; Size = " + this.size + "; Weight = " + this.weight + "; }";
    }


    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }


    public void noise(){
        System.out.println("This " + type + " makes some noise");
    }
}
