package enums;

enum Day {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5);

	private int code;

	Day(int i) {
		this.code = i;

	}

	public int getCode() {
		return code;
	}
	public Day fromCode(int code) {
        for (Day d : Day.values()) {
            if (d.code == code) 
                return d;
            }
        throw new IllegalArgumentException("Invalid code: " + code);
        }
	public static void main(String args[])
	{
		Day day = Day.TUESDAY;
		Status status = Status.PLACED;
		switch(status)
		{
		case PLACED:
			System.out.println("Order placed and will be delivered by "+ day.fromCode(day.getCode()+2));
		case DELIVERED:
			break;
		case IN_TRANSIT:
			break;
		default:
			break;
		}
	}

}
