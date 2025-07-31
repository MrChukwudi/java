public class Excercise1 {
    public static void main(String[] args){
        double dValue1 = 20.00d;
        double dValue2 = 80.00d;

        double dValue3 = ((dValue1 + dValue2) * 100.00d) % 40.00d;
        System.out.println(dValue3);

        boolean isRemainderZero = (dValue3 == 0.00d) ? false : true;
        System.out.println(isRemainderZero);

        if(!isRemainderZero)
            System.out.println("Got Some Remainder");
    }
}
