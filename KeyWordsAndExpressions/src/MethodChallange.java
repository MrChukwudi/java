public class MethodChallange {
    public static void main(String[] args) {

        // Calling the methods on the Following Scores: 1500, 1000, 500, 100, 25
        int highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Desmond", highScorePosition);

    }

    public static void displayHighScorePosition(String pName, int pHighScore) {
        System.out.println(pName + " managed to get into position " + pHighScore + " on the High score list");
    }

    public static int calculateHighScorePosition(int pScores) {
        int position = 0;
        if (pScores >= 1000) {
            position = 1;
        } else if ((pScores >= 500) && (pScores < 1000)) {
            position = 2;
        } else if ((pScores >= 100) && (pScores < 500)) {
            position = 3;
        }

        return position;
    }


    /*

    Accurate MegaBytes Converter For Mastering Integer Math In Java
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByt = (kiloBytes / 1024);
            int theKiloPart = (kiloBytes % 1024);

            System.out.println(kiloBytes + " KB = " + megaByt + " MB and " + theKiloPart + " KB");
        }

    }

    /*

    Implementing A Speed Converter To Practice Basic Java Arithmetic And Output

    */

    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = -1;

        if (kilometersPerHour >= 0) {
            milesPerHour = (long) (Math.round(kilometersPerHour * (1 / 1.609)));
        }

        return milesPerHour;

    }


    public static void printConversion(double kilometersPerHours) {

        if (kilometersPerHours < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHours);

            System.out.println(kilometersPerHours + " km/h = " + milesPerHour + " mi/h");
        }

    }


    /*

    Comprehensive 'Positive, Negative, Or Zero' Assessment In Java
     */
    public static void checkNumber(int myParam) {
        if (myParam > 0) {
            System.out.println("positive");
        } else if (myParam < 0) {
            System.out.println("negative");

        } else {
            System.out.println("zero");
        }
    }
}
