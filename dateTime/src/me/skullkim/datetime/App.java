package me.skullkim.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

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
        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthDay = LocalDate.of(2021, Month.MARCH, 28);

        //human time을 비교
        Period period = Period.between(today, thisYearBirthDay);
        System.out.println(period.getDays());

        Period util = today.until(thisYearBirthDay);
        System.out.println(util.get(ChronoUnit.DAYS));

        //machine time을 비교
        Instant now = Instant.now();
        Instant plus = now.plus(10, ChronoUnit.SECONDS);
        Duration between = Duration.between(now, plus);
        System.out.println(between.getSeconds());
    }
}
