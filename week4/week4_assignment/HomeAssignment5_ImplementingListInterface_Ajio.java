package week4.week4_assignment;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeAssignment5_ImplementingListInterface_Ajio {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("closeBtn")).click();
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.className("rilrtl-button")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
		/* List<WebElement> brand =driver.findElements(By.xpath("//div[@class='brand']"));
		int size = brand.size();
		System.out.println("Total brand count with duplicates : " + size);
		// Convert List to Set
		Set<WebElement> set = new HashSet<>(brand);
		int size2 = set.size();
		System.out.println("Total brand count without duplicates : " + size2);

		System.out.println("List of brand of the products displayed in the page are : " + set);*/
		
		List<WebElement> brandElements = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Total brand count : " + brandElements.size());
		System.out.println("----------------- List of Brands are : -----------------");

		//Set<String> uniqueBrands = new HashSet<>();
		for (WebElement each : brandElements) {
		   // uniqueBrands.add(each.getText().trim());- // get text and remove any leading/trailing spaces
			System.out.println(each.getText());
		}

		//System.out.println("Total brand count without duplicates : " + uniqueBrands.size());-
		//System.out.println("List of unique brand names: " + uniqueBrands);-

		System.out.println("----------------- List of Bag Names are : -----------------");
		List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='nameCls']"));

		//List<String> list=new ArrayList<String>();
		for (WebElement each : bagname) {
			//String text = each.getText();-
			//System.out.println(text2);
			//list.add(text);-
			System.out.println(each.getText());
		}

		//System.out.println("List of Bag Name : "+ list);

	}

}
