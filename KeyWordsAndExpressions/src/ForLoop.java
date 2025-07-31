public class ForLoop {
    public static void main(String[] args){

        /*
        //For Loop Signature:
        for(int i = 1; i < 5; i++){
            System.out.println(i);
        }

        // Calculate the interest to be earned from a given amount at different interest rates ranging from 2%, 3%, 4%, and 5%:
        for(double rate = 2; rate <= 5; rate++){
           double interestIs =  calculateInterest(10000, rate);
            System.out.println(interestIs + " is the interest on 10,000 at interest rate of " + rate);
        }

        */

        //my Task:
        int primeCounter = 0;
        System.out.println("Started");
        for(int i = 0; i <= 100; i++){
            if(isPrime(i)){
                System.out.println(i);
                primeCounter += 1;

            }
            if(primeCounter == 3){
                break;
            }
        }
    }

    // Method to Calculate Interest:
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }


    //Method to check if a number is Prime:
    public static boolean isPrime(int n) {
        if (n <= 1) { // Numbers less than or equal to 1 are not prime
            return false;
        }
        if (n == 2 || n == 3) { // 2 and 3 are prime
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) { // Multiples of 2 or 3 (except 2 and 3 themselves) are not prime
            return false;
        }
        // Check for factors from 5 onwards
        // We only need to check up to the square root of n
        // Loop increments by 6 (i, i+2) because all primes greater than 3 can be expressed in the form 6k ± 1
        for (long i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true; // If no divisors found, it's prime
    }
}
