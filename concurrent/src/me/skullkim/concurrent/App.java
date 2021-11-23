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
       boolean throwError = false;

       CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
           if(throwError) {
               throw new IllegalArgumentException();
           }

           System.out.println("Hello " + Thread.currentThread().getName());
           return "hello";
       }).handle((result, ex) -> {
           if(ex != null) {
               System.out.println(ex);
               return "Error";
           }
           return result;
       });

        System.out.println(hello.get());
    }

}
