package ch4;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.List;

public class LamdaAndForEachFilter {
    private String firstName ;
    private String lastName ;

    LamdaAndForEachFilter(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;


    }
    public  String getFullName (){

        return firstName + " " + lastName;
    }

    public static void main(String ...arg){

        List<String> names = new ArrayList<>(List.of("Yasir" , "Ali" , "Mohammed" , "Khalid"));

        names.add("Omar");
        System.out.println(names);

        names.stream().forEach(ele -> System.out.println(ele));

        List<LamdaAndForEachFilter> fullNames = names.stream().map(ele ->new LamdaAndForEachFilter(ele , "Almuhtrish")).toList();

        fullNames.stream().forEach(ele -> System.out.println(ele.getFullName()));

    }
}
