public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

}





class Monitor extends Product{
    private int size;
    private String resolution;


    // Constructor 2:
    public Monitor(String model, String manufacturer, int size, String resolution ){
        this(model,manufacturer);
        this.size = size;
        this.resolution = resolution;
    }


    // Constructor 1:
    public Monitor(String model, String manufacturer){
        super(model, manufacturer);
    }


    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format("Drawing Pixel at %d, %d in Color %s", x, y, color));
    }
}






class Motherboard extends Product{
    private int ramSlot;
    private int cardSlot;
    private String bios;


    // Second Constructor:
    public Motherboard(String model, String manufacturer, int ramSlot, int cardSlot, String bios){
        this(model, manufacturer);
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    // First Constructor:
    public Motherboard(String model, String manufacturer){
        super(model, manufacturer);
    }


    // Method to Load Program:
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is Loading...");
    }
}






class ComputerCase extends Product{
    private String powerSupply;

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public ComputerCase(String model, String manufacturer){
        super(model, manufacturer);
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed!");
    }
}