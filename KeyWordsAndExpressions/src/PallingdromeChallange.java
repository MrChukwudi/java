public class PallingdromeChallange {
    public static void main(String[] args) {

        /*
        int numero = 2332;
        String oremun = String.valueOf(numero);

        StringBuilder stringbuild = new StringBuilder(oremun).reverse();

        String revOremun = stringbuild.toString();

        int revNumero = Integer.parseInt(revOremun);

        if (revNumero == numero){
            System.out.println(true);

        }
        */


        boolean give = palindrome(11212);
        System.out.println(give);

    }

    public static boolean palindrome(int numero) {
        if (numero < 0) { //Every -ve integer is indeed never a pallindrome ==> Edge case 1.
            System.out.println(numero + " is not a palindrome...");
            return false;
        }

        if ((numero > 0) && (numero < 10)) { // Every single digit integer is a palindrome ==> Edge case 2.
            System.out.println(numero + " is indeed a palindrome...");
            return true;
        }
        String oremu = String.valueOf(numero); //Converts the integer to a String value:
        StringBuilder builtOremu = new StringBuilder(oremu); //Turns our String into a StringBuilder object to allow us the ability to reverse it with .reverse()
        StringBuilder reversedBuilt = builtOremu.reverse();
        String umeru = reversedBuilt.toString(); //Turns our StringBuilder Object back to a String:


        if (umeru.equals(oremu)) {
            System.out.println(numero + " is indeed a palindrome...");
            return true;
        } else {
            System.out.println(numero + " is not a palindrome...");
            return false;
        }


    }
}
