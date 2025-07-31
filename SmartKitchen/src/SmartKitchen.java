public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;


    // No Arguement Constructor:
    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();

    }

// Setting the Getters:
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }





    // Method to Set Kitchen State;
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }


    // Method that just does Kitchen Work:
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}




class CoffeeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean workToDo) {
        this.hasWorkToDo = workToDo;
    }



    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing Coffee...");
            hasWorkToDo = false;
        }
    }


}



class Refrigerator{
    private boolean hasWorkToDo;

    // Setter:
    public void setHasWorkToDo(boolean workToDo){
        this.hasWorkToDo = workToDo;
    }

    // Method to Order Food:
    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering Food...");
            hasWorkToDo = false;
        }
    }
}




class DishWasher{
    private boolean hasWorkToDo;

    // Setter:
    public void setHasWorkToDo(boolean workToDo){
        this.hasWorkToDo = workToDo;
    }

    // Method to Order Food:
    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Doing the dishes...");
            hasWorkToDo = false;
        }
    }
}