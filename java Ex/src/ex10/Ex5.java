package ex10;

import java.time.LocalDate;
import java.time.Period;

public class Ex5 {

    public static void main(String[] args) {
        System.out.println(getDayDiff("20010103","20010101"));
        System.out.println(getDayDiff("20010103","20010103"));
        System.out.println(getDayDiff("20010103","200103"));
    }

    public static int getDayDiff(String yyyymmdd1, String yyyymmdd2){
        try {
            LocalDate date1 = LocalDate.of(Integer.parseInt(yyyymmdd1.substring(0,4)), Integer.parseInt(yyyymmdd1.substring(4,6)), Integer.parseInt(yyyymmdd1.substring(6)));
            LocalDate date2 = LocalDate.of(Integer.parseInt(yyyymmdd2.substring(0,4)), Integer.parseInt(yyyymmdd2.substring(4,6)), Integer.parseInt(yyyymmdd2.substring(6)));
            System.out.println(date1 + " / " + date2);
            Period period = Period.between(date2, date1); // 앞에가 앞선 날짜, 뒤에가 나중 날짜
            return period.getDays();
        } catch (Exception e) {
            return 0;
        }
    }
}
