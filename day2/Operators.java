package week1.day2;

public class Operators {

	public static void main(String[] args) {
		// 1. Arithmatic operators
		
		System.out.println(2+3);
		System.out.println(1-1);
		System.out.println(2*3);
		System.out.println(4/2);
		System.out.println(11%2);
		
		//Assignmet Operators
		
		int a=4, b=4;
		a+=2;
		b-=2;
		b*=2;
		
				
// Comparision operators
		System.out.println(5<=2); //false
		
		//Logical operatoe
		
		System.out.println((5==5)&&(7==7)); // true 1+1 = 1
		System.out.println((5==2)||(3<2)); //false 0*0 = 0
		
		//Unary Operators
		int x=1;
		//System.out.println(x++); //value has been incremented but not assigned => x=1
		//System.out.println(x); //x value has been assigned due to post increment here => x=2
	System.out.println(++x); //value has been incremented & assigned => x=2
	}

}
