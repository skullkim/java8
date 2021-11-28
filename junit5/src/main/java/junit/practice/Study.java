package junit.practice;

public class Study {
	private StudyStatus status;

	private int limit;

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
