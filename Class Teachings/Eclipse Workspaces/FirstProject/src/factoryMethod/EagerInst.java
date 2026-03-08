package factoryMethod;

public class EagerInst {
	
	private static EagerInst sc = new EagerInst();
	
	public static EagerInst create()
	{	
		return sc;	
	}
}
