package me.skullkim.learnfunctionalinterface;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.UnaryOperator;

/**
 * Class Name: Foo
 * 함수형 인터페이스 실습을 위한 엔트리 포인트
 *
 * @author: yunki Kim
 * @version: 4.0
 * @since: 2021-11-20
 */

public class Foo {

    private void run() {
        int baseNumber = 10;

        // local class
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11
            }
        }

        // anonymous class
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber); // 인자로 전달한 baseNumber
            }
        };

        // Variable 'baseNumber' is already defined in the scope
        IntConsumer printInt = (number) -> System.out.println(number);

        printInt.accept(10);
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();
    }
}
