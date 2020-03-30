package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonsignup {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","A:\\Test-Auto\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement element= driver.findElement(By.id("nav-signin-tooltip"));
		element.click();
		
		WebElement element2=driver.findElement(By.id("createAccountSubmit"));
		element2.click();
		
		WebElement element3=driver.findElement(By.id("ap_customer_name"));
		element3.clear();
		element3.sendKeys("Aseem Goel");
		
		WebElement element4=driver.findElement(By.id("ap_phone_number"));
		element4.clear();
		element4.sendKeys("8630227235");
		
		WebElement element5=driver.findElement(By.id("ap_email"));
		element5.clear();
		element5.sendKeys("500062226@stu.upes.ac.in");
		
		
		WebElement element6=driver.findElement(By.id("ap_password"));
		element6.clear();
		element6.sendKeys("Aseem");
		
		WebElement element7=driver.findElement(By.id("continue"));
		element7.click();
		
		
		
		

		
	}
}
