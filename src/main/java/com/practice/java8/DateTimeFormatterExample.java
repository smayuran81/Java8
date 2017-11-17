package com.practice.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;



/**
 * Created by msivasub on 13/11/2017.
 * example: 16/11/2020 00:00:00
 */
public class DateTimeFormatterExample {

    private static final DateTimeFormatter ddMMMyyyy2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    private static final DateTimeFormatter ddMMyyyyhhmmss = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


    /**
     * DateTime Formatter for java 8
     * @param d
     * @param df
     * @return
     */
    public String formateDate(Date d, DateTimeFormatter df) {

        LocalDate ld = null;
        ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(ld);
       return  df.format(ld);

    }

    /**
     * This converts a string to java8 LocalDate Time
     * @param date
     */
    public void convertToLocalDateFromString(String date){
        LocalDateTime localDateTime= LocalDateTime.parse(date,ddMMyyyyhhmmss);
        System.out.print(localDateTime.toLocalDate());
    }

    public static void main(String[] args){
        DateTimeFormatterExample  df = new DateTimeFormatterExample();
        LocalDateTime localDateTime= LocalDateTime.parse("16/11/2020 00:00:00",ddMMyyyyhhmmss);
        System.out.println(localDateTime);
        Date toDate = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        //System.out.println(toDate);
        System.out.println(df.formateDate(toDate,ddMMMyyyy2).toString());
       // df.formateDate(localDateTime.toLocalDate().to)

    }
}
