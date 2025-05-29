package week4.week4_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeAssignment3_FindMissingElement {

	public static void main(String[] args) {
		 // Step 1: Declaring the array
        Integer[] array = {1, 2, 3, 4, 10, 6, 8};

        // Step 2: Converting array to list
        List<Integer> List = new ArrayList<Integer>(Arrays.asList(array));

        // Step 3: Sorting the list
        Collections.sort(List);

        // Step 4: Checking for gaps and print missing numbers
        System.out.println("Missing numbers:");
        for (int i = 0; i < List.size() - 1; i++) {
            int current = List.get(i);
            int next = List.get(i + 1);

            //  Print the number if a gap is detected.
            if (next != current + 1) {
                for (int missing = current + 1; missing < next; missing++) {
                    System.out.println(missing);
                }
            }
        }
    }
}
