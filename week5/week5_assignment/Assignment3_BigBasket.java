package week5.week5_assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3_BigBasket {

	public static void main(String[] args) throws IOException {

		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='relative h-full'])[4]/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mouse hover on "Foodgrains, Oil & Masala"
		WebElement mousehover1 = driver.findElement(By.xpath("//a[text()='Foodgrains, Oil & Masala']"));
		Actions clicking =new Actions(driver);
		//wait.until(ExpectedConditions.visibilityOf(mousehover1));
		clicking.moveToElement(mousehover1).perform();

		//mousehover on "Rice & Rice Products".
		WebElement mousehover2 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		//wait.until(ExpectedConditions.visibilityOf(mousehover2));
		clicking.moveToElement(mousehover2).perform();

		//mousehover on "Boiled & Steam Rice"
		
		WebElement mousehover3 = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		//clicking.moveToElement(mousehover1).moveToElement(mousehover2).perform();
		wait.until(ExpectedConditions.visibilityOf(mousehover3));
		clicking.moveToElement(mousehover3).click().perform();
		
		//bbroyal
		driver.findElement(By.xpath("//input[@id='i-bbRoyal']")).click();

		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> CW=new ArrayList <String>(windowHandles);
		for (int i = 0; i < CW.size(); i++) {
			if (i>0) {
				String string = CW.get(i);
				driver.switchTo().window(string);
				driver.findElement(By.xpath("//span[text()='5 kg']")).click();
				String price = driver.findElement(By.xpath("(//div[@class='flex flex-row items-start'])[6]/div/span/span")).getText();
				System.out.println("Price of the 5kg is : "+price);
				driver.findElement(By.xpath("//div[@class='flex justify-start']/div/div/button")).click();
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				driver.switchTo().window(string);
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot,new File("C:\\\\Users\\\\ggovindh\\\\eclipse-workspace1\\\\LearnSelenium\\\\screenshots" + "rice.jpeg"));
				System.out.println("Screenshot is taken Successfully!!!");
				driver.close();

			}

		}
		driver.switchTo().window(CW.get(0));
		//driver.close();
	}
}
