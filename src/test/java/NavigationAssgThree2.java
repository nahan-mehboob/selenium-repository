import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationAssgThree2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");	//launched the url
		driver.manage().window().maximize();	//maximized the window
		
		WebElement inputForm_Tab = driver.findElement(By.xpath("(//a[contains(text(),'Form')])[1]"));	//assigned the location of input form in inputForm_Tab
		inputForm_Tab.click();	//inorder to click and navigate to input form page
		
		WebElement checkboxDemo_Option = driver.findElement(By.xpath("(//a[contains(text(),'Demo')])[2]"));	//assigned the location of checkbox demo in checkboxDemo_Option
		checkboxDemo_Option.click();	//navigates to checkbox demo option
		
		WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='check-box-one']"));	//assigned the location of checkbox one to checkboxOne
		checkboxOne.click();	//clicked the checkbox of checkbox one
		
		WebElement checkboxThree = driver.findElement(By.xpath("//input[@id='check-box-three']"));	//asigned the location of chekcbox three to checkboxThree
		checkboxThree.click();	//clicked on checkbox of checkbox three
		
		System.out.println(checkboxOne.isSelected());	//checking whether the checkboxes are selected or not, returns yes or no
		System.out.println(checkboxThree.isSelected());
			
		
	}

}
