package factoryMethod;

public class LazyInst {
	
	private static LazyInst sc;
	
	public static LazyInst create()
	{
	
		sc=new LazyInst();
	return sc;
		
	}
}
