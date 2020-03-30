package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonproduct {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","A:\\Test-Auto\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement element =driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		element.clear();		
		element.sendKeys("Raspberry pi");
		element.sendKeys(Keys.ENTER);
		
		WebElement element2 =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
		element2.click();		
		
		
	
	}
	
}
