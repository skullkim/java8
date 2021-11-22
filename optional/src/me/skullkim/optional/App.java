package me.skullkim.optional;

import javax.naming.OperationNotSupportedException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * <h1>optional 실습 결과를 보여주는 클래스</h1>
 *
 * @author yunki kim
 * @version 1.0
 * @since 2021-11-22
 */

public class App {

    /**
     * optional 실습이 진행되는 함수
     * @param args Unused
     */
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "onlineClass boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", true));

        Optional<OnlineClass> onlineClass = springClasses.stream()
                .filter((springClass) -> springClass.getTitle().startsWith("rest"))
                .findFirst();
        System.out.println(onlineClass.isPresent());
        System.out.println(onlineClass.isEmpty());

        //ifPresent,
        onlineClass.ifPresent((oClass) -> System.out.println(oClass.getTitle()));

        //orElse
        System.out.println(onlineClass.orElse(createNewClass()).getTitle());

        System.out.println("===========");
        //orElseGet
        System.out.println(onlineClass.orElseGet(App::createNewClass));

        //orElseThrow
        System.out.println(onlineClass.orElseThrow(IllegalAccessError::new).getTitle());

        //filter
        Optional<OnlineClass> oClass = onlineClass.filter(OnlineClass::isClosed);
        System.out.println(oClass);

        //map
        Optional<Integer> integer =  onlineClass.map(OnlineClass::getClassId);
        System.out.println(integer);

        //flatMap
        Optional<Progress> progress = onlineClass.flatMap(OnlineClass::getProgress);
        System.out.println(progress);
    }

    private static OnlineClass createNewClass() {
        System.out.println("Create New Class");
        return new OnlineClass(10, "new class", false);
    }
}
