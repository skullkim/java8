import java.util.ArrayList;
import java.util.List;
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
        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("toby");
        names.add("yunki");

        Stream<String> stringStream = names.stream()
                .map(String::toUpperCase);
        stringStream.forEach(System.out::println);
    }
}
