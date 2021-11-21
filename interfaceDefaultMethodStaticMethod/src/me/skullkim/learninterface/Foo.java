package me.skullkim.learninterface;

/**
 * interface name: Foo
 * 인터페이스의 default method와 static method 실습을 위한 인터페이스
 *
 * @author yunkiKim
 * @version 1.0
 * @since 2021-11-20
 */

public interface Foo {

    /**
     * 이름을 출력하는 추상 메서드
     */
    void printName();

    /**
     * @implSpec
     * 이름을 대문자로 출력하는 메서드
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    /**
     * 이름을 가져오는 메서드
     * @return String 이름을 반환
     */
    String getName();

    /**
     * Foo를 출력하는 static method
     */
    static void printAnyThing() {
        System.out.println("Foo");
    }
}
