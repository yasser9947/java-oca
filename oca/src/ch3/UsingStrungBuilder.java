package ch3;

public class UsingStrungBuilder {

    public static void main(String arg[]) {

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("ed");

        b = b.append("ked");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println(a.toString());



    }

}
