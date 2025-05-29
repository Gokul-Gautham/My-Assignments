package week4.week4_day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LearnWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leafground.com/window.xhtml > handson
		
		EdgeOptions opt= new EdgeOptions();
		opt.addArguments("--disable-notifications");
		EdgeDriver driver=new EdgeDriver(opt);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		// converting set to list to use get method
		List<String> CW=new ArrayList <String>(windowHandles);
		
		for (int i = 0; i < CW.size(); i++) {
			if (i>0) {
				String string = CW.get(i);
				driver.switchTo().window(string);
				System.out.println(driver.getTitle());
				String string2 = CW.get(i-1);
				driver.switchTo().window(string2);
				driver.close();
			}
			
			
		}
	}

}
