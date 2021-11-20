package me.skullkim.learnfunctionalinterface;

import java.util.function.Function;

/**
 * Class name: Plus 10
 * 자바에서 기본제공하는 함수형 인터페이스 중 Funtion 예제
 *
 * @author: yunki Kim
 * @version: 1.0
 * @since: 2021-11-20
 */

public class Plus10 implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}
