package me.skullkim.concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * <h1>concurrent programming 실습을 위한 클래스</h1>
 *
 * @author yunki kim
 * @version 1.0
 * @since 2021-11-22
 */

public class App {

    /**
     * Completable Future 을 실제 실습하는 함수
     *
     * @param args Unused
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        });

        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
            System.out.println("World " + Thread.currentThread().getName());
            return "World";
        });

        List<CompletableFuture> futures = Arrays.asList(hello, world);
        CompletableFuture[] futuresArray = futures.toArray(new CompletableFuture[futures.size()]);

        CompletableFuture<List<Object>> future = CompletableFuture.allOf(futuresArray)
                .thenApply(result -> futures.stream()
                        .map(CompletableFuture::join) // Future에서 반환하는 최종 결과값이 나온다.
                        .collect(Collectors.toList())); // 결과값을 리스트로 만든다

        future.get()
                .forEach(System.out::println);
    }

}
