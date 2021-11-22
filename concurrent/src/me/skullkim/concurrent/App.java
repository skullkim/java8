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
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "hello";
        };

        //Callable의 반환값은 Future를 사용해 가져온다
        Future<String> submit = executorService.submit(hello);
        //isDone()은 현재 thread의 작업이 끝났으면 true, 아니면 false
        System.out.println(submit.isDone());
        System.out.println("Thread");

        //cancel()을 통해 현재 thread를 interrupt하고 종료한다
        //인자로 true를 주면 곧바로 종료시키고
        //인자로 false를 주면 하던 작업을 마무리 하고 종료한다.
        //하지만 어떤식으로 종료를 하던 강제로 종료한 것이기 때문에 반환값을 가져올 수 없다.
        //cancel을 하면 isDone()은 true가 된다.
        System.out.println(submit.cancel(true));

        //get()이전까지는 그냥 실행되고
        //get() 부터는 thread가 작업을 끝나기를 기다린다
        submit.get();

        System.out.println(submit.isDone());

        executorService.shutdown();
    }

}
