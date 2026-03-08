package advancedJava;

import java.util.Scanner;

class D1 extends Thread {
	@Override
	public void run() {
		System.out.println("program Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num 1");
		int n1 = sc.nextInt();
		System.out.println("Enter Num 2");
		int n2 = sc.nextInt();
		System.out.println(n1 + n2);
		System.out.println("Program ends");
		super.run();
	}
}
class D4 implements Runnable{

	
	@Override
	public void run() {
		System.out.println("Printing Chars");
		for (int i = 65; i <= 75; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//class D2 extends Thread {
//	@Override
//	public void run() {
//		System.out.println("Printing Chars");
//		for (int i = 65; i <= 75; i++) {
//			System.out.println((char) i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		super.run();
//		
//	}
//}

class D3 extends Thread {
	@Override
	public void run() {
		System.out.println("Printing Nums");
		for (int i = 65; i <= 75; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		super.run();
	}

}

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println("program Started");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Num 1");
//		int n1=sc.nextInt();
//		System.out.println("Enter Num 2");
//		int n2=sc.nextInt();
//		System.out.println(n1+n2);
//		System.out.println("Program ends");
//		
//		System.out.println("Printing Chars");
//		for(int i=65;i<=75;i++)
//			{System.out.println((char)i);Thread.sleep(1000);}
//		
//		
//		System.out.println("Printing Nums");
//		for(int i=65;i<=75;i++)
//			{System.out.println((char)i);Thread.sleep(1000);}
//		D1 d1 = new D1();
//
////		D2 d2 = new D2();
//		D3 d3 = new D3();
//		D4 d4 = new D4();
		Thread t1 = new Thread(new D3());
		Thread t2 = new Thread(new D4());
		t1.start();
		t2.start();
		
	}

}
