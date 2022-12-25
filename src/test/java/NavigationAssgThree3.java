import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationAssgThree3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");	//launched the url
		driver.manage().window().maximize();	//maximized the window
		
		WebElement inputForm_Tab = driver.findElement(By.xpath("(//a[contains(text(),'Form')])[1]"));	//assigned the location of input form in inputForm_Tab
		inputForm_Tab.click();	//inorder to click and navigate to input form page
		
		WebElement radioButtonsDemo = driver.findElement(By.xpath("//a[contains(text(),'Buttons')]"));	//assigned the location of radio buttons demo
		radioButtonsDemo.click();	//clicked on radio buttons demo
		
		WebElement female_RadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));	//assigned the location of radio button for female
		female_RadioButton.click();	//clicked on the radio button
		
		WebElement showSelectedValue = driver.findElement(By.xpath("//button[contains(text(),'Selected')]"));	//assigned the location of Show Selected Value button
		showSelectedValue.click();	//the button is clicked
		System.out.println("Whether female redio button is clicked: "+female_RadioButton.isEnabled());	//checking whether female itself is selected or not
		
		WebElement messageDisplay = driver.findElement(By.xpath("//div[@id='message-one']"));	//assigned the location for the displayed message
		System.out.println("The text is: "+messageDisplay.getText());	//returns the text displayed after having clicked on the button
			
	}

}
