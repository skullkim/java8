package me.skullkim.learninterface;

/**
 * <h1>Foo에서 제공하는 default method를 상쇠시키는 실습을 위한 인터페이스</h1>
 *
 * @author yunki Kim
 * @version 1.0
 * @since 2021-11-20
 */

public interface Bar extends Foo{

    /**
     * 이름을 대문자로 출력하는 추상 메서드
     */
    void printNameUpperCase();
}
