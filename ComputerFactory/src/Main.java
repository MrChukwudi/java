public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240v");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 X 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");


        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theMonitor, theCase, theMotherboard);



        thePC.getMonitor().drawPixelAt(10, 20, "Red");
        thePC.getMotherboard().loadProgram("Intelli-J");
        thePC.getComputerCase().pressPowerButton();
    }
}