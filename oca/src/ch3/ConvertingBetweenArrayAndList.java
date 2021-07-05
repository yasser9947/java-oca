package ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingBetweenArrayAndList {

    public static void main(String arg[]) {

        // covert list to array
        List<String> list = List.of("Ali" , "Yasir");
        Object[] objectArray = list.toArray();

        System.out.println(objectArray.length);
        System.out.println(objectArray[0]);



        // convert array to list

        String[] names = {"mohammed" , "Areen"};

        List list2 = Arrays.asList(names);

        System.out.println(list2);

        list2.set(0 , "sadon"); // will update all of list and the array cuz the point same data

        for (String name:names) System.out.println(name);

    }


}
