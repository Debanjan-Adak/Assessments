package confusion;

public class VariableShadowing {
	int x=10;
	static int y=30;
	void show()
	{
		int x=20; // Shadow instance variable
		int y=40;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(VariableShadowing.y);
		
	}
	public static void main(String[] args) {
		VariableShadowing c = new VariableShadowing();
		c.show();
	}

}
