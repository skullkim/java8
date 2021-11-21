package me.skullkim.learninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;

/**
 * <h1>인터페이스의 default method, static method 실습 엔트리 포인트</h1>
 *
 * @author yunkiKim
 * @version 4.0
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

       names.removeIf(name -> name.startsWith("k"));
       names.forEach(System.out::println);

    }
}
