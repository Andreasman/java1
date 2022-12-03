package net.staecker.javalernen;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Hensi", "Peter", "Oli", "Hans-Juergen", "Jenny", "Elli");
		myList.stream().map(String::toLowerCase).filter(a -> a.indexOf("e") > -1).sorted().forEach(System.out::println);
		
	}
}
