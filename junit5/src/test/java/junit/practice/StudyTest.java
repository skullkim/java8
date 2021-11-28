package junit.practice;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class StudyTest extends TestCase {
	@Test
	public void create() {
		Study study = new Study();
		assertNotNull(study);
		System.out.println("create");
	}

	@Test
	void create1() {
		System.out.println("create1");
	}

	@Test
	@Disabled
	void disabled() {
		System.out.println("disable");
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