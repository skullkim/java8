package me.skullkim.learnfunctionalinterface;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Class Name: Foo
 * 함수형 인터페이스 실습을 위한 엔트리 포인트
 *
 * @author: yunki Kim
 * @version: 3.0
 * @since: 2021-11-20
 */

public class Foo {

    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());
    }
}
