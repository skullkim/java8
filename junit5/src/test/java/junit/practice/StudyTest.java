package junit.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {
	@Test
	@DisplayName("새로운 스터디 만들기")
	public void createNewStudy() {
		assertTimeout(Duration.ofMillis(100), () -> {
			new Study(10);
		});
		assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
			new Study(10);
		});
		Study study = new Study(1);
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Study(-10));
		assertEquals("limit은 0보다 커야한다", exception.getMessage());
		assertAll(
			() -> assertNotNull(study),
			() -> assertEquals(StudyStatus.DRAFT, study.getStatus(),
				() -> "스터디를 만들면" + StudyStatus.DRAFT + "상태다."),
			() -> assertTrue(study.getLimit() > 0, "스터디 최대 참석가능 인원은 0보다 커야한다")
		);
	}

	@Test
	void create1() {
		System.out.println("create1");
	}

	@BeforeAll
	static void beforeAll() {
		System.out.println("before all");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("after all");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("before each");
	}

	@AfterEach
	void afterEach() {
		System.out.println("after Each");
	}

}