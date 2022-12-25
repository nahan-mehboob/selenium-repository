import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationAssgThree6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");	//lauched the url
		driver.manage().window().maximize();	//maximized the window
		
		WebElement home_Tab = driver.findElement(By.className("nav-link"));	//assigned the locator using class name for home tab
		System.out.println("The tag name is: "+home_Tab.getTagName());	//getting tag name of home tab
		System.out.println("The CSS value is: "+home_Tab.getCssValue("font-size"));	//getting the css value of home tab, used the font size
		System.out.println("The attribute value is: "+home_Tab.getAttribute("href"));	//getting attribute value of home tab, used href
		
		
	

	}

}
