package me.skullkim.concurrent;

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
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException err) {
                throw new IllegalStateException(err);
            }
        });
        thread.start();

        System.out.println("Hello: " + Thread.currentThread().getName());
        //위에서 생성한 thread가 끝날때 까지 다른 thread는 동작을 멈춘다.
        thread.join();
        //thread가 끝나는 3초뒤 이 라인이 실행된다.
        System.out.println(thread + " is finished");
    }
}
