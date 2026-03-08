package confusion;

// Variable HIDING
//class Parent {
//     static void show() {//if static
//        System.out.println("Parent static method");
//    }
//	int x = 10;
//}
//
//class Child extends Parent {
//     static void show() {//if static
//        System.out.println("Child static method");
//    }
//	int x = 20;
//}
void show() throws Exception {}

public class Confusion {
	public static void main(String[] args) {
		try {
		    System.out.println("Try");
		}
		catch{
			
		}
		
	}
}
