import java.util.Scanner;

class JoinExampleWithoutJoin implements Runnable{
	
	int count=0;
	void show()
	{
		count++;
	}
	@Override
	synchronized public void run() {
		 
		for(int i=0;i<500000000;i++)
		{ try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}show();}
		
	}
	
}

public class JoinExample  {
	
	public static void main(String[] args) throws InterruptedException  {
		
		JoinExampleWithoutJoin O1 = new JoinExampleWithoutJoin();
		Thread t1 = new Thread(O1);
		
		t1.start();
		
		
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(O1.count);
		
//		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(O1.count);
	}

}

