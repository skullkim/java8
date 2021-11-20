package me.skullkim.learnfunctionalinterface;

import java.sql.SQLOutput;

/**
 * Class Name: Foo
 * 함수형 인터페이스 실습을 위한 엔트리 포인트
 *
 * @author: yunki Kim
 * @version: 1.0
 * @since: 2021-11-20
 */

public class Foo {

    public static void main(String[] args) {
        RunSomething runSomething = () -> {
            System.out.println("hello");
            System.out.println("lamda");
        };
        runSomething.doIt();
    }
}
