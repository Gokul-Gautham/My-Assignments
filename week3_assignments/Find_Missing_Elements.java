package week3.week3_assignments;

import java.util.Arrays;

public class Find_Missing_Elements {

	public static void main(String[] args) {
		int a[] =  {1,4,3,2,8,6,7};
		
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (i+1 != a[i]) {
			System.out.println("Missing element in the sequence is : " + (i+1));
			break;
			}
			
		}
	}

}
