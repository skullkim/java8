package me.skullkim.concurrent;

import java.util.concurrent.*;

/**
 * <h1>concurrent programming 실습을 위한 클래스</h1>
 *
 * @author yunki kim
 * @version 1.0
 * @since 2021-11-22
 */

public class App {

    /**
     * concurrent programming을 실제 실습하는 함수
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        //처음에는 1초 delay를 하고 그 다음부터 2초 주기로 실행
        executorService.scheduleAtFixedRate(getRunnable("hello"), 1, 2,  TimeUnit.SECONDS);
    }

    private static Runnable getRunnable(String message) {
        return () -> System.out.println(message + Thread.currentThread().getName());
    }
}
