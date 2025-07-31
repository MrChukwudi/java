public class WhileAndDoWhile {
    public static void main(String[] args){
        /*

        //While Loop Signature:
        int j = 0;
        while(j <= 5 ){
            System.out.println(j);
            j++;
            if(j == 3){
                break;
            }
        }



        int n = 0;
        do{
            System.out.println("Doing While... " + n);
            n++;
        }while(n <= 10);

         */

        int startN = 5;
        int endN = 20;
        int numEven = 0;
        int numOdd = 0;

        while(startN <= endN){
          if(isEvenNumber(startN) == true){
              System.out.println(startN + " is an even number");
              numEven++;
          } else if (!isEvenNumber(startN)) {
              numOdd++;

          }
            if(numEven == 5){
                System.out.println(numEven + " is the total number of even numbers before we got " + startN);
                System.out.println(numOdd + " is the total number of even numbers before we got " + startN);

              break;
          }

            startN++;


        }



    }

    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }

    }
}

