package week2.week2_assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class W2_assignment_FacebookHome {

	public static void main(String[] args) {
		//Initialize ChromeDriver
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Click on the Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("My First Name");
		
		//Enter the Surname.
		driver.findElement(By.xpath("//input [@name = 'lastname']")).sendKeys("My Last Name");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input [@aria-label = 'Mobile number or email address']")).sendKeys("myemailid@gmail.com");
		
		//Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("@12345Abcd");
		
		//Handle all three dropdowns in Date of birth
		Select bd = new Select (driver.findElement(By.xpath("//select [@name = 'birthday_day']")));
		bd.selectByIndex(6);
		
		Select bm = new Select (driver.findElement(By.xpath("//select [@name = 'birthday_month']")));
		bm.selectByValue("12");
		
		Select by = new Select (driver.findElement(By.xpath("//select [@name = 'birthday_year']")));
		by.selectByVisibleText("1997");
		
		//Select the radio button in Gender.
		driver.findElement(By.xpath("//input [@value = '2']")).click();
		
		
		

	}

}
