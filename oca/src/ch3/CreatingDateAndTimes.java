package ch3;

import java.time.*;

public class CreatingDateAndTimes {

    public static void main(String ...arg){
        // page 139
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());


        LocalDate date1 = LocalDate.of(2021 , 8 , 27); // my birth day ^^
        // add days
        date1 = date1.plusDays(2);
        date1 = date1.plusWeeks(3);
        date1 = date1.plusMonths(2);
        date1 = date1.plusYears(3);


        LocalTime time1 = LocalTime.of(12 , 10 , 25);
        System.out.println(date1);
        System.out.println(time1);

        LocalDateTime datetime = LocalDateTime.of(date1 , time1);

        // add day
        datetime = datetime.minusDays(1);
        datetime = datetime.minusHours(3);

        //table 3.4 page 144




    }
}
