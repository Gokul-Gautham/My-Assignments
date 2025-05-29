package week4.Week4_day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonphoneprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Mobile phones");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		
		List<WebElement> allprice =driver.findElements(By.xpath("//*[@class='a-price-whole']"));
		
		int size = allprice.size();
		System.out.println(size);
		
		List<String> list=new ArrayList<String>();
		for (WebElement each : allprice) {
			String text2 = each.getText();
			//System.out.println(text2);
			
			list.add(text2);
		}
		
    System.out.println(list);
		
	}

}
