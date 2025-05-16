package week3.week3_day1;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//types of array declare
		 // (i) Literal
		int[] array1 = {1,5,3,6,9}; //index starts from 0
		int array2[] = {9,3,5,9};
		// (ii) Array Instantiation
		int array3[] = new int[2];

		//Length of array
		int length = array1.length; //length starts from 1
		System.out.println(length);
		
		//iterate values
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		//Sorting
		Arrays.sort(array1); //1,3,5,6,9
		//System.out.println(array1);
		System.out.println(array1[3]); //6
		
		//instantiation
		array3[0]=4;
		array3[1]=6;
		System.out.println(array3[0]);
		
		int array4[]=new int[3];
		array4[0]=1;
		array4[1]=2;
		System.out.println(array4[2]); //default value is 0
		String array5[]=new String[3];
		array5[0]="hi";
		array5[1]="where";
		System.out.println(array5[2]); //default value is null
	}

}
