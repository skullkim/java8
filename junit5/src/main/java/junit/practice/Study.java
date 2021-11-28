package junit.practice;

public class Study {
	private StudyStatus status;

	private int limit;

	private String name;

	@Override
	public String toString() {
		return "Study{" +
			"status=" + status +
			", limit=" + limit +
			", name='" + name + '\'' +
			'}';
	}

	public String getName() {
		return name;
	}

	public Study(int limit, String name) {
		this.limit = limit;
		this.name = name;
	}

	public int getLimit() {
		return limit;
	}

	public Study(int limit) {
		if(limit < 0) {
			throw new IllegalArgumentException("limit은 0보다 커야한다");
		}
		this.status = StudyStatus.DRAFT;
		this.limit = limit;
	}

	public StudyStatus getStatus() {
		return this.status;
	}
}
