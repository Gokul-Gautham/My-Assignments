package week5.week5_assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1_WebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement market = driver.findElement(By.xpath("//*[@id='ybar-navigation']/div/ul/li[3]/a/span"));

		Actions mouseover=new Actions(driver);
		mouseover.moveToElement(market).perform();
		driver.findElement(By.xpath("(//div[text()='Crypto'])[2]")).click();
		List <WebElement> names = driver.findElements(By.xpath("//main[@id='nimbus-app']/section/section/section/article/section/div/div[2]/div/table/tbody/tr/td[2]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (WebElement iterate : names) {
			System.out.println(iterate.getText());

		}
	}

}
