import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationAssgThree4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");	//lauched the url
		driver.manage().window().maximize();	//maximized the window
		
		WebElement table_Tab= driver.findElement(By.xpath("(//a[@class='nav-link'])[4]"));	//assigned the location for table tab
		table_Tab.click();	//clicked on table tab
		
		WebElement tigerNixon = driver.findElement(By.xpath("//tr[@class='odd']"));	//assigned the location of the first whole row
		System.out.println(tigerNixon.getText());	//displayed the text inside the first row

	}

}
