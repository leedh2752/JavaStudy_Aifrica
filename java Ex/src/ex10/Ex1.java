package ex10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex1 {

        public static void main(String[] args) {
            Calendar cal = Calendar.getInstance();
            cal.set(2010, 0, 1);
            for (int i = 0; i < 12; i++) {
                int weekday = cal.get(Calendar.DAY_OF_WEEK);
                if(weekday == 1) {
                    weekday += 7;
                } else {
                    weekday = 16 - weekday;
                }

                cal.set(Calendar.DAY_OF_MONTH, weekday);
                Date date = cal.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일 입니다.");
                System.out.println(sdf.format(date));

                cal.add(Calendar.MONTH, 1);
                cal.set(Calendar.DAY_OF_MONTH, 1);
            }
        }
}
