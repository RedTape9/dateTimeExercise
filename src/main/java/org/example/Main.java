package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now().plusWeeks(2);
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2021, 1, 1);
        System.out.println(localDate1.isAfter(localDate2));
        System.out.println(localDate1.isBefore(localDate2));


        LocalDate localDate3 = LocalDate.of(2021, 1, 1);
        LocalDate localDate4 = LocalDate.of(2021, 1, 10);
        System.out.println(localDate3.until(localDate4).getDays());


    }
}