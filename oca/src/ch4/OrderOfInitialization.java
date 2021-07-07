package ch4;

public class OrderOfInitialization {

    // 1 - if the have super class initialize it first .
    // 2 - Static variable declarations and static initializes in order the appear first .
    // 3 - Instance variable declarations and instance declarations order they appear first .
    // 4 - the Constructor


    private String name = "Yasir";

    {System.out.println(name);}
    private static  int COUNT = 0;
    static { COUNT += 1 ;}

    static {System.out.println(COUNT);}

    OrderOfInitialization(){
        System.out.println("the constructor");
    }

    static {COUNT += 10 ; System.out.println("Static " + COUNT);}

    public static void main(String ...arg){

        OrderOfInitialization order = new OrderOfInitialization();
    }

}
