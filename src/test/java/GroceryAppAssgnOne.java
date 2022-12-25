import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroceryAppAssgnOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\SeleniumAssignments\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();	//browser launch success
		driver.get("https://groceryapp.uniqassosiates.com/home");	//launching the url
		driver.manage().window().maximize();	//opening the browser window in maximize
		driver.navigate().to("http://groceryapp.uniqassosiates.com/admin/login");	//navigating to the next url
		driver.manage().window().maximize(); //opening in maximize
		driver.navigate().refresh();	//refreshed the browser tabs
		driver.quit();	//browser tabs closed
		
		
	}

}
