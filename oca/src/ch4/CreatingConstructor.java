package ch4;

public class CreatingConstructor {

//    page 196
    public int x ;
    public int y;

    CreatingConstructor(){
        this(1); // most be the first one in the constructor

    }
    CreatingConstructor(int x ){
        this(x , 1);
    }

    CreatingConstructor(int x , int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String ...arg){

        CreatingConstructor c1 = new CreatingConstructor();
        CreatingConstructor c2 = new CreatingConstructor(80);
        CreatingConstructor c3 = new CreatingConstructor(94 , 60);
        System.out.println("X = " + c1.x + " Y = "  + c1.y  );
        System.out.println("X = " + c2.x + " Y = "  + c2.y  );
        System.out.println("X = " + c3.x + " Y = "  + c3.y  );

    }


}
