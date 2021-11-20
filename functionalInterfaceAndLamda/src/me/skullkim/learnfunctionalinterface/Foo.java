package me.skullkim.learnfunctionalinterface;

import java.sql.SQLOutput;
import java.util.function.Function;

/**
 * Class Name: Foo
 * 함수형 인터페이스 실습을 위한 엔트리 포인트
 *
 * @author: yunki Kim
 * @version: 2.0
 * @since: 2021-11-20
 */

public class Foo {

    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (number) -> number + 10;
        Function<Integer, Integer> multiply2 = (number) -> number * 2;

        /*
         * compose는 입력 값을 사용해 인자로 받은 함수에 적용을 한다
         * 그 후 결과값을 리시버 객체의 입력값으로 사용한다.
         * 이 예제의 경우 *2를 수행하고 +10을 한다
         */
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);

        System.out.println(multiply2AndPlus10.apply(2));


        /*
        * andThen은 리시버 객체를 우선 수행한 후 인자로 받은 객체를 수행한다
        * 이 예제의 경우 + 10을 수행하고 *2를 한다
        */
        System.out.println(plus10.andThen(multiply2).apply(2));
    }
}
