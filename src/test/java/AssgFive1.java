import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssgFive1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//implicit wait
		
		//getting the window handle of parent window
		String parentWindow = driver.getWindowHandle();	//assigning window handle of parent window in parentWindow
		
		//scrolling and clicking Open New Window element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement openNewWindowBtn = driver.findElement(By.id("newWindowBtn"));	//assigned the location for open new window
		js.executeScript("arguments[0].scrollIntoView();",openNewWindowBtn);	//scrolling upto open new window
		openNewWindowBtn.click();	//clicked on open new window
		
		//getting the window handle of all child windows
		Set<String> allChildWindows = driver.getWindowHandles();	//assigning the window handle of child window in allChildWindows set
		
		//navigating to child window from parent window
		Iterator<String>iterator = allChildWindows.iterator();	//setting iterator to iterate through the set of window handles
		while(iterator.hasNext()) {
			String childWindow= iterator.next();	//if there are two window handles present and when the 2nd window handle is found, it is assigned to childWindow
			if(!parentWindow.equalsIgnoreCase(childWindow)) {	//if handle of parent window not equal to child window
				driver.switchTo().window(childWindow);	//switching to child window
				
				//performing actions on child window
				driver.manage().window().maximize();	//maximized child window
				WebElement enterFirstName = driver.findElement(By.xpath("//input[@name='fName']"));	//assigned the location for enter first name input box
				js.executeScript("arguments[0].scrollIntoView();",enterFirstName);	//scrolled upto enter first name input box
				enterFirstName.sendKeys("Rahul");	//inserted the value in enter first name
				WebElement enterLastName = driver.findElement(By.name("lName"));	//assigned the location for enter last name input box
				enterLastName.sendKeys("Sinha"); 	//inserted value in enter last name
				WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@id='malerb']"));	//assigned the location for male radio button
				maleRadioBtn.click();	//clicked on the radio button
				WebElement englishCheckBox = driver.findElement(By.xpath("//input[@id='englishchbx']"));	//assigned the location for english checkbox
				englishCheckBox.click();	//clicked on english checkbox
				WebElement hindiCheckBox = driver.findElement(By.xpath("//input[@id='hindichbx']"));	//assigned the location for hindi checkbox
				hindiCheckBox.click();	//clicked on hindi checkbox
				WebElement enterEmail = driver.findElement(By.xpath("//input[@id='email']"));	//assigned the location for enter email
				enterEmail.sendKeys("rahul.sinha@gmail.com");	//entered value in enter email
				WebElement enterPassword = driver.findElement(By.xpath("//input[@id='password']"));	//assigned the location for enter password
				enterPassword.sendKeys("jjhhggff");	//entered value in enter password
				WebElement registerBtn = driver.findElement(By.id("registerbtn")); //assigned the location for register button
				registerBtn.click();	//clicked on register button
				WebElement msgDisplayed = driver.findElement(By.xpath("//label[@id='msg']"));	//assigned the location for message displayed
				System.out.println("Whether registration success: "+msgDisplayed.isDisplayed());	//checking whether msg is displayed
				System.out.println("The message displayed is: "+msgDisplayed.getText());
						
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
