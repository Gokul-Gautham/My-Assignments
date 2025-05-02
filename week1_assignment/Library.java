package week1.week1_assignment;

public class Library {
	
	String addbook (String bookTitle){
		System.out.println(bookTitle + " Book added successfully");
		return bookTitle ;
	}
	
	void issueBook(){
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library lb=new Library();
		lb.addbook("HarryPotter");
		lb.issueBook();
		

	}

}
