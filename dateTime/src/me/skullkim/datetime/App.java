package me.skullkim.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
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
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyy");
        System.out.println(now.format(MMddyyyy));

        LocalDate parse = LocalDate.parse("07/15/1982", MMddyyyy);
        System.out.println(parse);

    }
}
