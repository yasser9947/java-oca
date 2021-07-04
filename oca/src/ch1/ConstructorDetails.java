package ch1;


//java class have tow primary elements : 1- methods 2-fields
public class ConstructorDetails {
    // access modifiers
    public int x ; // u can use anywhere
    private  int y ; // u can use it only in this class
    protected int z ; // u can use it in this class and in same package an subclasses
   //  default  // u can use it in this class and same package

    //# note
    // all of x ,y,z is called fields of the class


    // constructor most be the same name of class .
    // and the are no return value .
    // the purpose of constructor is initial the fields .
    ConstructorDetails(){
        this.x = 5;


        // from note 2
        System.out.println("I am the last ");
    }


    // ## note 2
    //  order of of Initialization:
    // every thing in class , then the Constructor

    {System.out.println(" I am the first");}

}
