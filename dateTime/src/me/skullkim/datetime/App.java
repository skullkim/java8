package me.skullkim.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

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
        //machine time사용
        Instant machineTime = Instant.now();
        System.out.println(machineTime); // 기준시 UTC, GMT를 기준으로 시간이 나온다.
        System.out.println(machineTime.atZone(ZoneId.of("UTC")));

        //자신이 속한 시간대를 가져와서
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        //GMT 기준 시간이 아닌 자신이 속한 시간대의 시간으로 구한다.
        ZonedDateTime zonedDateTime = machineTime.atZone(zone);
        System.out.println(zonedDateTime);

    }
}
