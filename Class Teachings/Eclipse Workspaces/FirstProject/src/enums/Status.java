package enums;

public enum Status {
	PLACED(1), IN_TRANSIT(2), DELIVERED(3);

	private int code;

	Status(int i) {
		this.code = i;

	}

	public int getCode() {
		return code;
	}
}
