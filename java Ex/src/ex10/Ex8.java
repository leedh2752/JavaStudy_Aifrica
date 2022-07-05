package ex10;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex8 {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        ZoneId seoulZone = ZoneId.of("Asia/Seoul");
        ZoneId newYorkZone = ZoneId.of("America/New_York");
//        ZonedDateTime seoul = date.atZone(seoulZone);
//        ZonedDateTime newYork = date.atZone(newYorkZone);
        ZonedDateTime seoul = ZonedDateTime.now().withZoneSameInstant(seoulZone);
        ZonedDateTime newYork = ZonedDateTime.now().withZoneSameInstant(newYorkZone);
        System.out.println(seoul);
        System.out.println(newYork);

        int sec1 = seoul.getOffset().getTotalSeconds();
        int sec2 = newYork.getOffset().getTotalSeconds();
        System.out.println(sec1 + " / " + sec2);
        System.out.println((sec1 - sec2) / 3600);
    }
}
