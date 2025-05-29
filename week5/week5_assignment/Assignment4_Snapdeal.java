package week5.week5_assignment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

public class Assignment4_Snapdeal {
    WebDriver driver;
    static WebDriverWait wait;
    static Actions actions;
	public static void main(String[] args) throws IOException {
		EdgeDriver driver=new EdgeDriver();
		
		//WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // ✅ Fix: Properly initialize wait

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.snapdeal.com/");

        // Now use wait:
        WebElement mensFashion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Men's Fashion\"]")));
        mensFashion.click();

        // 3. Go to "Sports Shoes"
        WebElement sportsShoes = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Sports Shoes']")));
        actions.moveToElement(sportsShoes).click().perform();

        // 4. Get the count of sports shoes
        List<WebElement> shoesList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='product-tuple-image ']")));
        System.out.println("Number of sports shoes: " + shoesList.size());

        // 5. Click on "Training Shoes"
        WebElement trainingShoes = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Training Shoes']")));
        actions.moveToElement(trainingShoes).click().perform();

        // 6. Sort the products by "Low to High"
        WebElement sortByDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Sort by:']")));
        actions.moveToElement(sortByDropdown).click().perform();
        WebElement lowToHigh = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Price Low to High']")));
        actions.moveToElement(lowToHigh).click().perform();

        // 7. Check if the displayed items are sorted correctly
        // (This step requires manual verification or additional logic to compare prices)

        // 8. Select a price range (e.g., 500-700)
        WebElement priceFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Min']")));
        priceFilter.clear();
        priceFilter.sendKeys("500");
        WebElement maxPriceFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Max']")));
        maxPriceFilter.clear();
        maxPriceFilter.sendKeys("700");
        WebElement applyPriceFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Apply']")));
        applyPriceFilter.click();

        // 9. Filter by color (e.g., Black)
        WebElement colorFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Black']")));
        colorFilter.click();

        // 10. Verify all the applied filters
        // (This step requires manual verification or additional logic to confirm applied filters)

        // 11. Mouse hover on the first resulting "Training Shoes"
        WebElement firstShoe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product-tuple-image ']")));
        actions.moveToElement(firstShoe).perform();

        // 12. Click the "Quick View" button
        WebElement quickView = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product-tuple-image ']//span[text()='Quick View']")));
        quickView.click();

        // 13. Print the cost and discount percentage
        WebElement cost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='pdpPrice']")));
        WebElement discount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='discount']")));
        System.out.println("Cost: " + cost.getText());
        System.out.println("Discount: " + discount.getText());

        // 14. Take a snapshot of the shoes
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(screenshot.toPath(), Paths.get("screenshot.png"));

        // 15. Close the current window
       // driver.close();

        // 16. Close the main window
        //driver.quit();


	}

}
