package ch4;

public class EncapsulatingData {

    private String name ;
    private int age ;
    private boolean canDrive;


    public String getName(){

        return  this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanDrive() {
        canDrive = age > 18 ? true : false;
        return canDrive ;
    }


    public static void main(String ...arg){

        EncapsulatingData person1 = new EncapsulatingData();
        person1.setName("Ali");
        person1.setAge(19);
        System.out.println("name :" + person1.getName()+  "\n" +
                "age :" + person1.getAge()+  "\n" +
                "can drive  :" + person1.isCanDrive()+  "\n"
        );
        EncapsulatingData person2 = new EncapsulatingData();
        person2.setName("Khalid");
        person2.setAge(15);
        System.out.println("name :" + person2.getName()+  "\n" +
                "age :" + person2.getAge()+  "\n" +
                "can drive  :" + person2.isCanDrive()+  "\n"
        );


    }
}
