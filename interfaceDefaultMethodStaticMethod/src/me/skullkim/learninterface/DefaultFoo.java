package me.skullkim.learninterface;

/**
 * <h1>interface의 default method, static method 실습</h1>
 * class name: DefaultFoo
 * interface의 default method와 static method실습을 위한 클래스
 *
 * @author yunki Kim
 * @version 1.0
 * @since 2021-11-20
 */

public class DefaultFoo implements Foo{

    /**이름을 저장*/
    String name;

    /**
     * DefaultFoo 생성자
     * @param name 이름을 받는 파라미터
     */
    public DefaultFoo(String name) {
        this.name = name;
    }

    /**
     * implements한 Foo 인터페이스의 getName 추상 메서드 구현체
     * @return String 멤버 변수 name을 반환
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * implements한 Foo 인터페이스의 printName 추상 메서드 구현체
     */
    @Override
    public void printName() {
        System.out.println(this.name);
    }
}
