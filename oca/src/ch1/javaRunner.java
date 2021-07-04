package ch1;//Redundant Import
import java.lang.System; // u dont need to import it every time is imported by default
import java.lang.*; // that mean import all the Classes in the java.lang

import java.util.*;


//

public class javaRunner {

    public static void main(String arg[]){

        System.out.println("start");

        Random r = new Random(); // use from the java.util.Random
        System.out.println(r.nextInt(10)); // .nextInt(int n) it will be do from 0 to n
        //====
        java.util.Date date ; // its same name to solve that we do this way
        java.sql.Date sqlDate ;   // its same name to solve that we do this way

        // creating object
        ConstructorDetails object = new ConstructorDetails(); // object is an instance of class
        System.out.println("x is : " + object.x); // cuz the x is public in class


        if (true ){
            int x = 5; // x is local variable : if you want use local variable it should be initial it with value
            int y ; // it will be compile error u most do => y = something

            System.out.println(x);

        }else{

        }

    }
}
