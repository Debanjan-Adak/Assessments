package factoryMethod;


public class SingeltonClass {
	private static SingeltonClass sc;
	private SingeltonClass(){} //this is must, for singelton class
	
	public static SingeltonClass create()
	{
		if(sc==null)
			sc=new SingeltonClass();
		
		return sc;
		
	}
}
