package week3.week3_day1;

public class Intersection {

	public static void main(String[] args) {
		// TO print common values btw 2 arrays

		int array1[] = {1,4,3,8,9};
		int[] array2 ={7,2,4,9,0};

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
