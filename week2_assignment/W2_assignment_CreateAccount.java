package week2.week2_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class W2_assignment_CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main"); //Load URL
		driver.manage().window().maximize(); //Maximize window

		//Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click the "Login" button.
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		//Click on the "CRM/SFA" link.
		driver.findElement(By.xpath("//a [contains (text(),'SFA')]")).click();

		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();

		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();

		//Enter an account name.
		String acname = "My First Account1";
		driver.findElement(By.id("accountName")).sendKeys(acname);

		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea [@name = 'description']")).sendKeys("Selenium Automation Tester.");

		//Select "ComputerSoftware" as the industry.
		driver.findElement(By.xpath("//option[text()= 'Computer Software']")).click();

		//Select "S-Corporation" as ownership using SelectByVisibleText.
		//driver.findElement(By.xpath("//option[text()= 'S-Corporation']")).click();
		Select Os=new Select (driver.findElement(By.xpath("//select[@name='ownershipEnumId']")));
		Os.selectByVisibleText("S-Corporation");

		//Select "Employee" as the source using SelectByValue.
		Select Source=new Select (driver.findElement(By.xpath("//select[@id='dataSourceId']")));
		Source.selectByValue("LEAD_EMPLOYEE");

		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		Select mc=new Select (driver.findElement(By.xpath("//select[@id='marketingCampaignId']")));
		mc.selectByIndex(7);

		//Select "Texas" as the state/province using SelectByValue.
		Select sp=new Select (driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")));
		sp.selectByValue("TX");

		//Click the "Create Account" button.
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		//Verify that the account name is displayed correctly.
		//Reference= "https://stackoverflow.com/questions/71888780/selenium-how-to-get-td-objects-within-tr-objects"

		String acname1 = driver.findElement(By.xpath("(//span[@class='tabletext']) [3]")).getText();
		System.out.println(acname1);

		//Close the browser window.

		if (acname1.contains(acname)) {
			System.out.println("Account name is displayed correctly and driver is closed");
			driver.close();

		}
		else {
			System.out.println("Acount name is mismatch and driver is not closed");
		}

	}

}
