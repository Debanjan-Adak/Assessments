package advancedJava;

import java.util.ArrayList;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

import java.util.*;

@FunctionalInterface
interface add1 {
	int addAnd1(int a, int b);
}

@FunctionalInterface
interface Draw {
	void circle();
}

//class c1 implements Draw{
//	
//	public void circle() {
//		System.out.println("C1 draw");
//	}
//	
//}
//class c2 implements Draw{
//	public void circle() {
//		System.out.println("C2 draw");
//	}
//	
//}

class Demo implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {

		return t.length();
	}

	public static int add11(int a, int b) {
		return a + b + 1;
	}

}

public class LambdaExp {

	public static void main(String[] args) {

//		Draw d1 = () -> {System.out.println("C1 draw");};
//		Draw d2 = () -> {System.out.println("C2 draw");};
//		d1.circle();
//		d2.circle();
//		LinkedList<Integer> l1 = new LinkedList<>();
//		l1.add(5);
//		l1.add(1);
//		l1.add(8);
//		l1.add(7);
//		l1.add(21);
//		l1.add(18);
//		Collections.sort(l1,(a,b)->{
//			return b-a;
//		});
//		for(int i: l1)
//			System.out.println(i);

//		Demo d = new Demo();
//		System.out.println(d.apply("hello"));
//		Function<String, Integer> f = (s1) -> s1.length();
//		System.out.println(f.apply("Hello"));
//		example();
		forEachExample();

	}

	static void example() {
		Function<Integer, Double> f = (n) -> Math.sqrt(n);
		System.out.println(f.apply(4));
		Function<Integer, Double> f2 = Math::sqrt;
		System.out.println(f2.apply(16));
		BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
		System.out.println(add.apply(5, 8));

		add1 a = Demo::add11;
		System.out.println(a.addAnd1(5, 19));

	}

	static void example2() {
		List<String> employees = new ArrayList<>();
		employees.add("emp1");
		employees.add("emp2");
		employees.add("emp3");
		employees.add("emp4");
		
		Function<List<String>,Set<String>> f = (employeesList) -> new HashSet<>(employeesList);
		Function<List<String>,Set<String>> f2 = HashSet::new;
			

	}
	
	
	static void forEachExample()
	{
		List<String> names = List.of("Debu","Nendu","Swappy");
		Stream<String> s = names.stream();
//		names.forEach(System.out::println);
		s.forEach(System.out::println);
		
		System.out.println(names.stream().count());
		
		List<String> list = Arrays.asList("apple", "banana", "orange");
		List<String> answer = list.stream()
		                         .map(String::toUpperCase) // Applies the toUpperCase function to each element
		                         .collect(Collectors.toList()); // Gathers the results into a new List

		System.out.println(answer); 
		List<Integer> numbers = List.of(1,2,3,4,5,6,6,7,8);
		int[] arr= numbers.stream().mapToInt(Integer::intValue).toArray();
	}

}
