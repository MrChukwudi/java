public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        /*
        //Accessing our different composition classes to set the hasWorkToDo field:
        kitchen.getBrewMaster().setHasWorkToDo(true);
        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);


        kitchen.getIceBox().orderFood();
        kitchen.getDishWasher().doDishes();
        kitchen.getBrewMaster().brewCoffee();
        */

        /*
        kitchen.setKitchenState(true, true, false);
        kitchen.doKitchenWork();
        */



        EnhancedPlayer tim = new EnhancedPlayer(289, "Tim", "Desert Eagle");
        System.out.println(tim.healthRemaining());
    }

}