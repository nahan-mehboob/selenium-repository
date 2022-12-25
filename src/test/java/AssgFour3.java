import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssgFour3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement customerId = driver.findElement(By.name("cusid"));	//assigning the location of customer id search bar
		customerId.sendKeys("1111");	//inserting the value in the search bar
		
		WebElement submitButton = driver.findElement(By.name("submit"));	//assigning the value of submit button
		submitButton.click();	//clicking the submit button
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	//instantiating the WebDriverWait
		wait.until(ExpectedConditions.alertIsPresent());	//alert is present condition given
		driver.switchTo().alert().dismiss();	//dismissed the alert
		
		

	}

}
