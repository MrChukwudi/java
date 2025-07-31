import java.util.ArrayList;
import java.util.List;

public class Sum3And5 {
    public static void main(String[] args) {
        int sumNum = 0;
        List<Integer> myList = new ArrayList<>();

        for(int num = 1; num <= 1000; num++){
            if((num % 3 == 0) && (num % 5 == 0)){
                sumNum += num;
                myList.add(num);
            }
            if(myList.size() == 5){
                break;
            }
        }
        System.out.println("The Sum of the numbers that are divisible by 3 or 5 are:.. " + sumNum );
        System.out.println("The Numbers that are divisible by 3 or 5 are:... " + myList);
    }
}
