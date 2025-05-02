package week1.week1_assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int storeNo1 = 0; //1,1
		int storeNo2 = 1; //1,2
		int range = 8;
		System.out.print(storeNo1 +"," + storeNo2+",");
		for (int i=0; i<=range; i++) {
			int storeNo3 = storeNo1 + storeNo2 ;
				System.out.print(storeNo3 +",");
				storeNo1 = storeNo2;
				storeNo2 = storeNo3;
			}
			
			
		}
	}






