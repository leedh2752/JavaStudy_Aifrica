package ex10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex3 {
    public static void main(String[] args) throws ParseException {
        String date = "123,456,789.5";
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#,####");

        Number num = df.parse(date);
        double d = num.doubleValue();
        long up = Math.round(num.doubleValue());
        String mil = df2.format(d);
        System.out.println(num.doubleValue());
        System.out.println(up);
        System.out.println(mil);

//        System.out.println(df2.format("123456789.5"));

    }
}
