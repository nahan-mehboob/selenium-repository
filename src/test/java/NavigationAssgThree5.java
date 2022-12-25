import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationAssgThree5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");	//lauched the url
		driver.manage().window().maximize();	//maximized the window
		
		WebElement table_Tab= driver.findElement(By.xpath("(//a[@class='nav-link'])[4]"));	//assigned the location for table tab
		table_Tab.click();	//clicked on table tab
		
		WebElement tableSortAndSearch = driver.findElement(By.xpath("//a[contains(text(),'Sort And')]"));	//assigned the location for table sort and search
		tableSortAndSearch.click();	//clicked on table sort and search
		
		WebElement searchBox = driver.findElement(By.tagName("input"));	//assigned the location using tagname of search bar
		searchBox.sendKeys("Dai Rios");	//entered the required text on search bar
		
		WebElement table = driver.findElement(By.xpath("//td[contains(text(),'Dai Ri')]"));	//assigning location of the row and column of the table
		System.out.println("If the text is displayed: "+table.isDisplayed());	//checking whether text is displayed or not
		System.out.println("If the text displayed is same: "+table.getText().contentEquals("Dai Rios"));	//verifying the specified text is equal to the displayed text
		System.out.println("The text is: "+table.getText());
	

	}

}
