public class OverloadedMethod {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(12));
        System.out.println(convertToCentimeters(10, 1));


    }

    public static double convertToCentimeters(int inches){
        double cntM = inches * 2.54d;
        return cntM;
    }


    public static double convertToCentimeters(int inches, int feet){
        int inch = (feet * 12) + inches;

        // Calling the first Method to convert the total Inches to Centimeters:
        double centM = convertToCentimeters(inch);
        return centM;
    }
}
