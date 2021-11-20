package me.skullkim.learnfunctionalinterface;

/*
* Interface Name: RunSomething
* 함수형 인터페이스를 공부하기 위한 인터페이스
*
* @author: yunki Kim
* @version: 1.0
* @since: 2021-11-20
*/

@FunctionalInterface
public interface RunSomething {

    /**
     * 이름을 출력하는 static method*/
    static void printName() {
        System.out.println("YunkiKim");
    }

    /**나이를 출력한다*/
    default void printAge() {
        System.out.println("23");
    }

    void doIt();
}
