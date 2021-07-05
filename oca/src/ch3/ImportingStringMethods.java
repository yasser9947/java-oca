package ch3;

import java.util.Locale;

public class ImportingStringMethods {

    public static void main(String arg[]) {

        String name = "Yasir";

//      int length()
        System.out.println(name.length() ); // return number of characters

//     char charAt(int index )
        System.out.println(name.charAt(4)); // lets you query the string to find out what character is at specific index
        // System.out.println(name.charAt(8)); =>  threw error cuz String index out of range ;


//      int index(int ch) , int index(int ch , int fromIndex) , int index(String str) ,  int index(String str ,int fromIndex )
        System.out.println(name.indexOf("r")); // looks at the characters in the string and find the index that matches the desires value;
        System.out.println(name.indexOf("r" , 4));
        System.out.println(name.indexOf("si"));

//        String substring(int beginIndex ) or String substring(int beginIndex , int endIndex )

        String animal = "Animal";

        System.out.println(animal.substring(3)); //  looks at the characters in the string it return parts of the string
        System.out.println(animal.substring(2 , 4));

//        toLowerCase , toUpperCase
        System.out.println(animal.toLowerCase());
        System.out.println(animal.toUpperCase());


//        boolean equals()
        System.out.println("Animal".equals(animal)); // true
        System.out.println("animal".equals(animal));// false


//      boolean  startWith()  , boolean endsWith()

        System.out.println(animal.startsWith("A")); // true
        System.out.println(animal.startsWith("c")); // false
        System.out.println(animal.endsWith("l")); // true
        System.out.println(animal.endsWith("A")); // false



//      boolean  contains
        System.out.println(animal.contains("A")); // true
        System.out.println(animal.contains("c")); // false



//       String  replace (char oldChar , char newChar)
        System.out.println(animal.replace('A' , 'C')); // true

    }

}
