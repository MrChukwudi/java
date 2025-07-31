import java.util.Scanner;

public class UserInputChallange {
    public static void main(String[] args) {

        /*
        * 1. Initialize a SumNum and a Counter
        * 2. Initialize the scanner object
        * // Inside first do-while loop
        * // Inside a d0-while loop ==>
        * // inside a try-catch block:
        * 3. Ask the User to enter a valid integer
        * 4. if input is invalid ==> throw error
        * 5. Re-loop for the invalid input
        * 6. Add valid input to sumAdd
        * 7. Increase counter
        * 8. loop till counter <= 5
        *
        *
        *
        *
        *
        *
        * */


        getNumber();

    }


    public static void getNumber(){
        int sumNum = 0;
        int counter = 0;

        Scanner sc = new Scanner(System.in);
        while(counter < 5){

                try{
                    System.out.println("Enter a valid integer number:... #" + (counter + 1));
                    int number = Integer.parseInt(sc.nextLine()); // If it fails here, the whole code skips to catch section:
                    System.out.println("You entered " + number);
                    sumNum  += number;
                    System.out.println("Sum is " + sumNum);
                    counter++;
                    System.out.println("Counter is " + counter);

                }catch(Exception badUserInput) {
                    System.out.println("Invalid numbers are not allowed, Enter a valid integer!!!");
                }

        };
    }
}
