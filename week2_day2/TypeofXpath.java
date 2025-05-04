package week2.week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TypeofXpath {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
/*
 * //usr name : demosalesmanager/pwd : crmsfa
 * 1) Absolute xpath
 * 2) Relative xpath
 */
		
		//Finding username using Absolute xpath
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/p[1]/input[1]")).sendKeys("demosalesmanager");
		
		//2) Relative xpath > 2 types ((i).Basic xpath (ii).Advanced xpath)
		//(i) Basic xpath has 5types 
		
		//(a) attribute xpath
		driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("crmsfa");
		
		//(b) partial atribute xpath
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		//(c) collection based xpath , Here index starts with "1" and not with "0".
		driver.findElement(By.xpath("//a[@style ='color: black;'][1]")).click();
		
		//(d) text based xpath
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		
		// (e) partial text based
		driver.findElement(By.xpath("//a[contains(text(),'Request')]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
