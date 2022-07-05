package ex10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        weekDay(sc.nextLine());
    }

    public static void weekDay(String day) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("E요일");
        Date date = sdf.parse(day);
        System.out.println(sdf2.format(date));
    }
}
