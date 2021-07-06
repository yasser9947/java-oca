package ch4;

public class OverloadingMethods {

    // Method overloading occurs when there are different method signature with the same name but different type parameters


    //page 195 oca book
    public static void fly(){

        System.out.println("you call the void ");
    }
    public static String fly(String s ){
        System.out.println( "you call the String " + s);

        return "you call the String" + s ;
    }

    public static Boolean fly(Boolean s ){
            System.out.println( "you call the Boolean " + s);
        return  s ;
    }


        public static void main(String ...arg) {


        fly();
        fly("hi");
        fly(true);


    }

}
