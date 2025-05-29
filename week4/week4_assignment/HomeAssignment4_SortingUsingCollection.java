package week4.week4_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeAssignment4_SortingUsingCollection {

	public static void main(String[] args) {
		String[] array = {"HCL","Wipro", "Aspire Systems","CTS"};
		Arrays.sort(array);

		List<String> List1 = new ArrayList<String>(Arrays.asList(array));
		
		for (int i = List1.size()-1; i >= 0; i--) {
			if (i==0) {
				System.out.print(List1.get(i));
			}else {
				System.out.print(List1.get(i) + ",");
			}
			

		}

	}
}
