package week5.week5_assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2_Amazon {

	public static void main(String[] args) throws IOException {

		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of the first product is : " + price);
		String ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("No Of Ratings in the first product is : " + ratings);
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/a)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> CW=new ArrayList <String>(windowHandles);
		for (int i = 0; i < CW.size(); i++) {
			if (i>0) {
				String string = CW.get(i);
				driver.switchTo().window(string);
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot,new File("C:\\\\Users\\\\ggovindh\\\\eclipse-workspace1\\\\LearnSelenium\\\\screenshots" + "screenshot.jpeg"));
				System.out.println("Screenshot is taken Successfully!!!");
				
				driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				String priceincart = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
				System.out.println("Price in cart is : " +priceincart);
				if (price.equals(priceincart)) {
					System.out.println("Price of the Product in homepage & Price of the product in cart is SAME!");
					driver.close();
				}
				else {
					System.out.println("Price of the Product in homepage & Price of the product in cart is DIFFERENT!");
				}
				break;
			}

		}
	}
}
