import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssgFour1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");	//launching the url
		driver.manage().window().maximize();	//maximized the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Url at the start: "+driver.getCurrentUrl());
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/"); 	//navigated to the second url
		System.out.println("After first navigation: "+driver.getCurrentUrl());
		driver.navigate().back();	//navigates back to 1st url
		System.out.println("After second navigation: "+driver.getCurrentUrl());
		driver.navigate().forward();	//navigates to the second url again
		System.out.println("After third navigation: "+driver.getCurrentUrl());
		driver.navigate().refresh();	//refreshes the whole browser
		driver.close(); 	//closes the browser tab
		
		

	}

}
