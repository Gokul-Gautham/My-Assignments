package week4.week4_assignment;

import java.util.ArrayList;

public class HomeAssignment1_Intersection {

	public static void main(String[] args) {
		int[] array1 = {3, 2, 11, 4, 6, 7};
		int[] array2 = {1, 2, 8, 4, 9, 7};

		for (int i = 0; i < array1.length; i++) {
			int a = array1[i];
			for (int j = 0; j < array2.length; j++) {
				int b = array2[j];

				if (a==b){
					System.out.println(a);
				}

			}


		}

	}
}
