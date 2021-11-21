package me.skullkim.learninterface;

/**
 * <h1>인터페이스의 default method, static method 실습 엔트리 포인트</h1>
 *
 * @author yunkiKim
 * @version 1.0
 * @since 2021-11-20
 */

public class App {

    /**
     * 실습에 필요한 DefaultFoo의 인스턴스를 만들고 결과를 출력한다
     * @param args Unused
     */
    public static void main(String[] args) {
       Foo foo = new DefaultFoo("yunki");
       foo.printName();
       foo.printNameUpperCase();
       Foo.printAnyThing();
    }
}
