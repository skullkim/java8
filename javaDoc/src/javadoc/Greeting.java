package javadoc;

/**
 * 람다 메소드 레퍼런스 예제용 클래스
 *
 * @author yunki Kim
 * @version 1.0
 * @since 2021-11-20
 */

public class Greeting {

	/** 이름을 저장 */
	private String name;

	/** 기본 생성자 */
	public Greeting() {
		super();
	}

	/**
	 * 생성자
	 * @param name 사람 이름
	 */
	public Greeting(String name) {
		this.name = name;
	}

	/**
	 * 이 메서드는 hello라는 문자열과 함께 인사말을 구하는데 사용된다
	 * @param name 사람 이름
	 * @return 인사말 문자열
	 */
	public String hello(String name) {
		return "hello" + name;
	}

	/**
	 * 이 메서드는 hi라는 문자열과 함께 인사말을 구하는데 사용된다
	 * @param name 사람 이름
	 * @return 인사말 문자열
	 */
	public static String hi (String name) {
		return "hi" + name;
	}

	/**
	 * name getter
	 * @return 이름 문자열
	 * */
	public String getName() {
		return name;
	}

}
