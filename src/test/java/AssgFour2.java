import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssgFour2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php"); 	//launched the url
		driver.manage().window().maximize();	//maximized
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//implicit wait
		driver.navigate().refresh();	//refreshed the page
		
		WebElement datePickers = driver.findElement(By.xpath("(//a[@class='nav-link'])[3]"));	//assigned the location for date pickers element
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));	//WebDriverWait instantiated
		datePickers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='nav-link'])[3]")));	//condition applied
		
		
	}

}
