package ch3;

import java.util.Arrays;

public class UsingArray {
    public static void main(String arg[]) {

        //Sorting

        int[] numbers = {4 , 6, 7, 99, 5, 996, 22, 3, 1, 0, -9};

        Arrays.sort(numbers);

        for (int num:numbers)
            System.out.println(num);

        //Searching

        System.out.println(Arrays.binarySearch(numbers , 2));

        // using multi Arrays

        int [][] multiArray = {{1 ,3} , {4,6} };

        System.out.println(multiArray[0][1]);

    }

}
