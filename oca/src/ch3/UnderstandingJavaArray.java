package ch3;

public class UnderstandingJavaArray {
    // Array is : an area of memory on the heap with space fo a designated number of element
    public static void main(String arg[]){

        //creating array of elements

        int[] numbers ;
        // or
        int numbers2[] ;

        // if you want add size

        int[] numberss = new int[3]; // it will take size of 3


        // most common
        int[] nums = {};
        // or
        int[] nums2 = {1 , 3 , 4};


        //assign
        System.out.println(nums2[0]);
        System.out.println(nums2[1]);
        //length
        System.out.println(nums2.length);

        String[] names = {"yasir" , "ali" , "khalid"};

        for (String name:names)
            System.out.println(name);

    }
}
