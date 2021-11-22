package me.skullkim.concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "hello";
        };

       Callable<String> java = () -> {
           Thread.sleep(3000L);
           return "Java";
       };

       Callable<String> keesun = () -> {
           Thread.sleep(1000L);
           return "keesun";
       };

       //incokeAll을 사용해 Future의 리스트를 만든다.
       //invokeAll은 입력한 Callable이 모두 종료될때 까지 기다린다.
       //따라서 결과값이 한번에 나온다.
       List<Future<String>> futures =  executorService.invokeAll(
               Arrays.asList(hello, java, keesun)
       );
       futures.forEach((future) -> {
           try {
               System.out.println(future.get());
           } catch (InterruptedException | ExecutionException e) {
               e.printStackTrace();
           }
       });

       //invokeAny는 입력한 Callable를 수행하되 하나만 완료되면 해당 값만 반환하고 종료한다.
       String s = executorService.invokeAny(Arrays.asList(hello, java, keesun));
       System.out.println(s);
       executorService.shutdown();
    }

}
