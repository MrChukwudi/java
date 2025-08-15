package dev.lpa;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[3];

        System.out.println(myArray[2]);


        int[] theArray = new int[6];

        for(int i = 0; i < theArray.length; i++){
            theArray[i] = theArray.length - i;
        }

        /*
        for(int i = 0; i < theArray.length; i++){
            System.out.println(theArray[theArray.length - (i + 1)]);
            System.out.println(theArray[i]);

        }
        */

        // The Enhanced For Loop ==> foreach loop:
        // for(declearation : theArray){}

        /*
        for(int num : theArray){
            //System.out.printf("This is the element ==> %d\n", num);
        }

         */


        //System.out.println(Arrays.toString(theArray));


        /*
        int[] thisArray = UsingArrays.getRandomArray(20);

        Arrays.sort(thisArray);
        System.out.println(Arrays.toString(thisArray));


         */


        /*
        String[] sArray = {"Abel", "Joyce", "Mark", "Emeka"};

        // binarySearch(array, key) => Binary Search:
        Arrays.sort(sArray);

        if(Arrays.binarySearch(sArray, "Joyce") > 0){
            System.out.printf("Found the %s in the Array", "Joyce");
        }

         */


        /*
        int[] toSort = {2, 3,6,4,1,8,47};

        System.out.println(Arrays.toString(toSort));

        Arrays.sort(toSort);

        System.out.println(Arrays.toString(toSort));

        int left = 0;
        int right = toSort.length - 1;

        while(left < right){
            int temp = toSort[left];
            toSort[left] = toSort[right];
            toSort[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(toSort));

        //Alternatively:
        Integer[] arraySort = {44, 5, 3, 6, 8, 99, 10, 11};
        System.out.println(Arrays.toString(arraySort));
        Arrays.sort(arraySort); // Sort Ascending
        System.out.println(Arrays.toString(arraySort));
        Arrays.sort(arraySort, Collections.reverseOrder());
        System.out.println(Arrays.toString(arraySort));



         */


        record GroceryItem(String name, double price, int count){
            public GroceryItem(String name){
                this(name,  0.00d, 100);
            };
        };


        GroceryItem mapple = new GroceryItem("Mapples");

        System.out.println(mapple.toString());

    }
}
