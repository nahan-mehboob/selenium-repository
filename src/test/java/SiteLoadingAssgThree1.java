import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiteLoadingAssgThree1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");	//launching the url
		driver.manage().window().maximize();	//maximizing the browser window
		System.out.println(driver.getCurrentUrl());	//printing the current url name
		System.out.println(driver.getTitle());	//printing the current url title
			
		
	}

}
