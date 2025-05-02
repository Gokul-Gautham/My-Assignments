package week1.week1_assignment;

public class IsPrime {
	public static void main(String[] args) {
		int totalcount =0;
		int numbertobechecked = 13;

		for (int i=1; i<=numbertobechecked; i++) {
			if (numbertobechecked>0 && numbertobechecked%i==0) {
				totalcount++;
			}
		}
		if (totalcount == 2) {
			System.out.println("Number [" + numbertobechecked +"] is a prime");
		}

		else {
			System.out.println("Number [" + numbertobechecked +"] is not a prime");
		}
	}

}





