package week2.week2_day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		// driver.get("https://www.google.com/");
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://www.google.com/"); 
		driver1.manage().window().maximize(); // to maximize the screen
		String title = driver1.getTitle();    // to get the title
		System.out.println(title);
		driver1.close();                       // to close the driver
 
	}

}
