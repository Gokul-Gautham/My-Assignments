package week4.Week4_day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings= new ArrayList <String> ();
		List<Integer> numbers = new ArrayList <Integer> ();
		List<Character> characters = new ArrayList <Character> ();
		
		//to add
		strings.add("Gokul Raj");
		numbers.add(27);
		characters.add('G');
		
		strings.add("Gok");
		numbers.add(2);
		characters.add('a');
		//to get based on index
		System.out.println(strings.get(1));
		

	}

}
