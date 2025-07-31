import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        int thisYear = 2025;

        // consoleInput(thisYear);
        scannerInput(thisYear);





    }

    public static String consoleInput(int currentYear){
       String  name = System.console().readLine("Hi, what's your name? ");
        System.out.println(name + " Thank you for taking the course ");

        int yearOfBirth = Integer.parseInt(System.console().readLine("What year were you born? "));
        int age = currentYear - yearOfBirth;
        System.out.println("I can see that you are " + age + " years old");


        return " ";
    }


    public static int scannerInput(int currentYear){

        int age = 0;

        //Initialize our scanner object:
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi, what is your name? ");

        String name = sc.nextLine();
        System.out.println("Hi " + name + " it's soo good to have you here! ");


       do{
           try{
               System.out.println("Hi, what year were you born? should be between " + (currentYear - 125) + " and " + currentYear);
               String recievedInput = sc.nextLine();
               age = (currentYear - Integer.parseInt(recievedInput));
           }catch(NumberFormatException badUserData){
               System.out.println("Characters  not allowed!!... Try again:");
           }


       }while ((age <= 0) || (age >= 125));

        System.out.println("I can see that you are " + age + " years old");

        return age;
    }



}
