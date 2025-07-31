public class SwitchStatement {
    public static void main(String[] args) {

        int day = 5;

        switch (day){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4: case 5: case 6:
                System.out.println("It's either a 4, 5, or 6");
                System.out.println("Actually, it was a " + day);
                break;
            default:
                System.out.println(1000);
                break;
        }




        //Using Modified Switch Statement:
        switch (day){
            case 1 ->  System.out.println(11);
            case 2 ->  System.out.println(22);
            case 3 ->  System.out.println(33);
            case 4, 5, 6 -> {
                System.out.println("It's either a 4, 5, or 6");
                System.out.println("Actually, it was a " + day + "" + day);
            }
            default -> System.out.println(1000);
        }


        System.out.println(getQuarters("June"));

        System.out.println(getQuarter("May"));

        printDayOfWeek(5);

    }

    // Switch Statement with Return instead of Break:
    public static String getQuarters(String month){
        switch(month){
            case "January": case "February": case "March":
                return "1st";
            case "April": case "May": case "June":
                return "2nd";
            case "July": case "August": case "September":
                return "3rd";
            case "October": case "November": case "December":
                return "4th";
            default:
                String badResponse = (month + " is a bad Month name.");
                return badResponse;
        }
    }

    // Rebuilding the above Switch to use the Advanced Switch Approach:
    public static String getQuarter(String month){
        return switch (month){
            case  "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is a bad Month request.";
                yield badResponse;
            }

        };
    }


    // Building a day of the Week without using the return:
    public static void printDayOfWeek(int day){
        String dayOfWeek = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> { yield "Wednesday";}
            case 4 -> { yield "Thursday"; }
            case 5 -> { yield "Friday";}
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " Stands for " + dayOfWeek);
    }
}

