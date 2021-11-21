package me.skullkim.learninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

/**
 * <h1>인터페이스의 default method, static method 실습 엔트리 포인트</h1>
 *
 * @author yunkiKim
 * @version 3.0
 * @since 2021-11-20
 */

public class App {

    /**
     * java8 공식 API에서 추가된 default method 실습
     * @param args Unused
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("yunki");
        names.add("skull");
        names.add("keesun");
        names.add("toby");

        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        //tryAdvance역시 Consumer를 인자로 받는다.
        while(spliterator.tryAdvance(System.out::println)); //keesun, toby
        System.out.println("=======");
        while(spliterator1.tryAdvance(System.out::println)); //yunki, skull
    }
}
