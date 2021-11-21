package me.skullkim.learnfunctionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * 람다 메소드 레퍼런스 예제를 구동하는 클래스
 *
 * @author yunki Kim
 * @version 1.0
 * @since 2021-11-20
 */

public class App {

    public static void main(String[] args) {
        // static method를 람다 메서드 레퍼런스로 사용할 경우
        UnaryOperator<String> hi = Greeting::hi;

        // 일반 method를 람다 메서드 레퍼런스로 사용할 경우
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;

        // 생성자를 람다 메서드 레퍼런스로 사용할 경우
        // 인자로 String name을 받는 생성자 사용
        Function<String, Greeting> yunkiGreeting = Greeting::new;
        Greeting yunki = yunkiGreeting.apply("yunki");
        System.out.println(yunki.getName());

        //기본 생성자 사용
        Supplier<Greeting> newGreeting = Greeting::new;

        // 특정 타입의 불특정다수 인스턴스의 메서드 참조
        String[] names = {"yunki", "toby", "js"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
