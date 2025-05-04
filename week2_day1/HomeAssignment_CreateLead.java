package week2.week2_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeAssignment_CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokulraj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Tester");
		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);

		driver.close();
	}

}
