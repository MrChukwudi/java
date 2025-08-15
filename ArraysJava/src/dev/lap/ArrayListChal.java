package dev.lap;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "";

        ArrayList<String> sInput = new ArrayList<>();

        do{
            System.out.println("Enter a number for which action you want to perform...");
            input = sc.nextLine();
            if(input.equals("0")){
                input = "0";
                break;
            }else if(input.equals("1")){
                System.out.println("Enter a Comma delimitted list of the Grocery items you want in your List:...");
                String recieved = sc.nextLine();
                String[] parts = recieved.split(", ");

                for(var element : parts){
                    sInput.add(element); // I want this as a resizable ArrayList
                }
            }else if(input.equals("2")){
                if(sInput.size() < 1){
                    System.out.println("Your List is Empty; Enter 1 to add to List, or enter 0 to exit...");
                }else if(sInput.size() >= 1){
                    System.out.println("Your List is " + sInput);
                    System.out.println("Provide the items that you want to remove...");

                    String remove = sc.nextLine();
                    String[] toRemove = remove.split(", ");
                    for(String elem : toRemove){
                        sInput.remove(elem);
                    }
                }
            }else{
                System.out.println("Enter a number for which action you want to perform...");
            }
        }while(!input.equals("0"));

    }
}
