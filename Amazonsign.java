package testautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsign {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","A:\\Test-Auto\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement element= driver.findElement(By.id("nav-signin-tooltip"));
		element.click();
		
		
		WebElement element2=driver.findElement(By.id("ap_email"));
		element2.sendKeys("8630227235");
		
		WebElement element3=driver.findElement(By.id("continue"));
		element3.click();
		
		WebElement element4=driver.findElement(By.id("ap_password"));
		element4.sendKeys("aseem.goel");
		
		WebElement element5= driver.findElement(By.id("signInSubmit"));
		element5.click();
		
	}
}
