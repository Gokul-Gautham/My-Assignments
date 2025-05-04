package week2.week2_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeAssignment_CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//usr name : demosalesmanager/pwd : crmsfa
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Gokulraj");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("07");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("Title is :" + title);
		driver.close();
		
		
	
	}

}
