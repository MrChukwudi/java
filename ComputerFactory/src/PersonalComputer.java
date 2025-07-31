public class PersonalComputer extends Product{
    // A class containing members that are Classes is what we know as Composition:
    private Monitor monitor;
    private ComputerCase computerCase;
    private Motherboard motherboard;


    public PersonalComputer(String model, String manufacturer, Monitor monitor, ComputerCase computerCase, Motherboard motherboard){
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;

    }

    public Monitor getMonitor() {
        return monitor;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
