package me.skullkim.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * <h1>java8에서 추가된 date, time관련 기능 실습</h1>
 *
 * @author yunki kim
 * @version 1.0
 * @since 2021-11-22
 */

public class App {

    /**
     * java8에서 추가된 date, time 관련 기능을 실습하는 메인 함수
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        // Date -> Instant
        Date date = new Date();
        Instant instant = date.toInstant();
        // Instant -> Date
        Date newDate = Date.from(instant);
        System.out.println(newDate);

        //GregorianCalendar -> ZonedDateTime
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ZonedDateTime dateTime = gregorianCalendar.toInstant()
                .atZone(ZoneId.systemDefault());
        System.out.println(dateTime);

        //GregorianCalendar -> LocalDateTime
        LocalDateTime localDateTime = gregorianCalendar.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        System.out.println(localDateTime);

        // ZonedDateTime -> GregorianCalendar
        ZonedDateTime zonedDateTime = gregorianCalendar.toInstant()
                .atZone(ZoneId.systemDefault());
        GregorianCalendar from = GregorianCalendar.from(zonedDateTime);
        System.out.println(from);

        // ZoneId -> TimeZone
        ZoneId zoneId = TimeZone.getTimeZone("PST")
                .toZoneId();
        System.out.println(zoneId);

        // TimeZone -> ZoneId
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
        System.out.println(timeZone);

    }
}
