import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationAssgThree7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");	//lauched the url
		driver.manage().window().maximize();	//maximized the window
	
		WebElement logo = driver.findElement(By.cssSelector("img[alt='logo']"));	//assigned the location of logo using css selector
		System.out.println(logo.getSize());	//getting the size of the logo

	}

}
