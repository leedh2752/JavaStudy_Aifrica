package ex10;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1994, 7, 27);
        LocalDate date2 = LocalDate.now();
        System.out.println(date + " / " + date2);
        Period pe = Period.between(date, date2);
        System.out.println("년 : " + pe.getYears());
        System.out.println("월 : " + pe.getMonths());
        System.out.println("일 : " + pe.getDays());
        System.out.println(date.until(date2, ChronoUnit.YEARS));
        System.out.println(date.until(date2, ChronoUnit.MONTHS));
        System.out.println(date.until(date2, ChronoUnit.DAYS));


    }
}
