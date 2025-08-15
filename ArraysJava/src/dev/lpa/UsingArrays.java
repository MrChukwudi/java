package dev.lpa;

import java.util.Random;

public class UsingArrays {

    /*
    * Arrays themselves do not have their own instance methods like other objects do
    * Arrays class acts as a utility, providing static methods that operate on arrays you pass to them ==> java.util.Array
    *
    * Arrays.sort(array): Sorts the elements of an array.

     ****   Arrays.copyOf(original, newLength): Creates a new array by copying elements from an existing one.

        Arrays.equals(array1, array2): Compares two arrays for deep equality.

        Arrays.toString(array): Returns a string representation of the array's contents
        *
        *
     **** It's also worth noting that all arrays, as objects, do inherit methods from the java.lang.Object class, such as equals() and hashCode()
      */





    public static int[] getRandomArray(int len){
        Random random = new Random(); // Random is a special class in jav.util for creating randing numbers:

        int[] myArr = new int[len];

        for(int i = 0; i < len; i++){
            myArr[i] = random.nextInt(101);
        }
        return myArr;
    }
}
