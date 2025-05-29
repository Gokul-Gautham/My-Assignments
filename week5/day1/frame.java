package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		String mainWindow = driver.getWindowHandle();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
	Alert alert = driver.switchTo().alert();
	alert.accept();
	driver.switchTo().window(mainWindow);
	driver.switchTo().frame(1);
	System.out.println(driver.findElement(By.id("demo")).getText());
		
	}

	}


