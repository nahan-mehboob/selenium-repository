import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssgFive2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//implicit wait
		
		//getting the window handle of parent window
		String parentWindow = driver.getWindowHandle();	//assigning window handle of parent window in parentWindow
		
		//scrolling and clicking Open New Tab element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement openNewTabBtn = driver.findElement(By.id("newTabBtn"));	//assigned the location for open new tab
		js.executeScript("arguments[0].scrollIntoView();",openNewTabBtn);	//scrolled upto open new tab button
		Thread.sleep(2000);
		openNewTabBtn.click();	//clicked on open new tab button
						
		//getting the window handle of all child windows
		Set<String> allChildWindows = driver.getWindowHandles();	//assigning the window handle of child window in allChildWindows set
		
		//navigating to child window from parent window
		Iterator<String>iterator = allChildWindows.iterator();		
		while(iterator.hasNext()) {
			String childWindow = iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
								
				//performing actions on child window
				System.out.println("Title of the new tab is: "+driver.getTitle());	//printing the title of the child window
				WebElement clickMe = driver.findElement(By.id("alertBox")); 	//assigned the location of the first click me button to clickeMe
				Thread.sleep(2000);
				clickMe.click();	//clicked on click me button
				Thread.sleep(1000);
				System.out.println("The message inside alert box is: "+driver.switchTo().alert().getText());	//switching and getting the text inside the alert
				driver.switchTo().alert().accept();		//accepting the alert
				
				
			}
		}
		driver.switchTo().window(parentWindow);	//switched back to parent tab
		Thread.sleep(2000);
		driver.quit();

	}

}
