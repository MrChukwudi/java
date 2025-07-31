public class DigitSumChallange {
    public static void main(String[] args) {

        sumDigit(-9);
        sumingDigit(11);

    }

    public static int sumDigit(int container){
        //Convert the integer container into a string:
        String stringCont = String.valueOf(container);
        int sumAdd = 0;
        int lent = 0;

        if(stringCont.charAt(0) == '-'){
            System.out.println("This is a -ve number, hence it'll return: -1");
            return -1;
        }
        while(lent < stringCont.length()){
            sumAdd += Character.getNumericValue(stringCont.charAt(lent));
            lent++;
        }
        System.out.println(sumAdd + " is the Sum of all digits");
        return sumAdd;
    }


    public static int sumingDigit(int numero){
        if(numero < 0){
            System.out.println("This is a -ve number, hence it'll return: -1");
            return -1;
        }

        int sumAdd = 0;
        int numiron = numero;
        while(numiron > 0){
            sumAdd += numiron % 10;
            numiron = numiron / 10;
        }
        System.out.print(sumAdd + " is the sum of all digits");
        return sumAdd;
    }


}
