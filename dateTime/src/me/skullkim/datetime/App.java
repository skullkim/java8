package me.skullkim.datetime;

import java.time.*;

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
        //zone id를 사용해 특정 time zone의 현재 시간을 알아낸다.
        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        //다음과 같은 방식을 사용하면 위와 같은 값을 구할 수 있다.
        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime = nowInstant.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);

    }
}
