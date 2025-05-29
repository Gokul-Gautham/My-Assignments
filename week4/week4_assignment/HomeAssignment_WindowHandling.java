package week4.week4_assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeAssignment_WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		// Login
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Go to Contacts > Merge Contacts
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();

		String parentWindow = driver.getWindowHandle();

		// Click first lookup icon
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Set<String> handles1 = driver.getWindowHandles();
		for (String handle : handles1) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
				driver.close();  // Close child window
				break;
			}
		}

		driver.switchTo().window(parentWindow);

		// Click second lookup icon
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> handles2 = driver.getWindowHandles();
		for (String handle : handles2) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.linkText("DemoCustomer")).click();
				driver.close();  
				break;
			}
		}

		driver.switchTo().window(parentWindow);
		//driver.quit();
	}
}
