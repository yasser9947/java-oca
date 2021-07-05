package ch3;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayLest {

    public static void main(String ...arg){

        // ArrayList
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

       // add
        list1.add("YAsir");
        list1.add(1);
        list1.add(true);


        // remove
        list1.remove(1);


        // set => replace element from the array

        list1.set(1 , "Khalid");

        System.out.println(list1.isEmpty());
        System.out.println(list1.contains("YAsir"));

        // compare between arrays
        System.out.println(list2.equals(list3));



        System.out.println(list1);

        // if you want add specific Type

        ArrayList<String> list4 = new ArrayList<>();

        //    list4.add(4); => throw error
        list4.addAll(List.of("Yassir" , "Ali")); // if you want add more
        System.out.println(list4);



    }
}
