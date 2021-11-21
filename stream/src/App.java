
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class name: App
 * 스트림 실습을 위한 클래스
 *
 * @author yunki kim
 * @version 1.0
 * @since 2021-11-21
 */

public class App {

    /**
     * <h1>스트림 실습을 위한 메인함수</h1>
     * @param args unused
     */
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        System.out.println("spring으로 시작하는 수업");
        springClasses.stream()
                .filter((springClass) -> springClass.getTitle().startsWith("spring"))
                .forEach((springClass) -> System.out.println(springClass.getClassId()));

        System.out.println("close 되지 않은 수업");
        springClasses.stream()
                .filter(Predicate.not(OnlineClass::isClosed))
                .forEach((springClass) -> System.out.println(springClass.getClassId()));

        System.out.println("수업 이름만 모아서 스티림 만들기");
        springClasses.stream()
                .map(OnlineClass::getTitle)
                .forEach(System.out::println);


        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The Java, Test", true));
        javaClasses.add(new OnlineClass(7, "The Java Code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The Java 8 to 11", false));

        List<List<OnlineClass>> keesunEvents = new ArrayList<>();
        keesunEvents.add(springClasses);
        keesunEvents.add(javaClasses);

        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        keesunEvents.stream()
               .flatMap(Collection::stream) // 리스트안에 리스트가 있는 keesunEvents의 형태를 OnelineClass 타입을 가지는 stream으로 바꾼다
               .forEach((onlineClass) -> System.out.println(onlineClass.getClassId()));

        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
        Stream.iterate(10, (number) -> number + 1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확이");
        boolean hasClassContainTest = javaClasses.stream()
                .anyMatch((javaClass) -> javaClass.getTitle().contains("Test"));
        System.out.println(hasClassContainTest);

        System.out.println("스프링 수정 중에 제목에 spring이 들어간 제목만 모아서 List로 만들기");
        springClasses.stream()
                .filter((springClass) -> springClass.getTitle().contains("spring"))
                .map(OnlineClass::getTitle)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
