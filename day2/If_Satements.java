package week1.day2;

public class If_Satements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =18;
if (age==18 ) {
	System.out.println("Allowed");
	
}
int marks =50;

if (marks >=50) {
	System.out.println("Pass");
	
} else {
System.out.println("Fail");

}

int marks1=65;
if (marks1 >=95) {
	System.out.println("Distinction");
	
} else if (marks1 >=70 && marks1 <=94){
System.out.println("Firstclass");

}else if (marks1 >50 && marks1 <=69){
	System.out.println("Pass");
	}
else{
System.out.println("Fail");

}
	}
}
