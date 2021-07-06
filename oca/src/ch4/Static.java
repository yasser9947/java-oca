package ch4;

public class Static {

    static String   a = "5";

    Static(){
        this.a = a+1;
    }

    public static void main(String ...arg){

        System.out.println(a);

        Static test = new Static();

        System.out.println(test.a);
        System.out.println(Static.a);
        System.out.println(a);

    }

}
