package week4.Week4_day1;

public class LearnMethodoverloading {
	/*
	 * Method overloading:
	 * 
	 */
	
	public void add(){
		int a =1;
		int b=2;
		System.out.println(a+b);
	}
	public void add(int a, int b){
		System.out.println(a+b);
		
	}
	public void add(int a, int b, float c){
		System.out.println(a+b+c);
	}
	public void add(int a, float b, int c){
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		LearnMethodoverloading OL = new LearnMethodoverloading();
		OL.add();
		OL.add(1,3);

	}

}
