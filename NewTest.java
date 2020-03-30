import org.testng.annotations.Test;

import testautomation.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class NewTest {
	public static WebDriver driver;
  @Test(priority=2)
  public void f() {
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
  
  @Test(priority=1)
  public void f1() {
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
  
  @Test(priority=4)
  public void f2() {
	  WebElement element =driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		element.clear();		
		element.sendKeys("Raspberry pi");
		element.sendKeys(Keys.ENTER);
		
		WebElement element2 =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
		element2.click();	
  }
  
  @Test(priority=3)
  public void f3() {
	  WebElement element6 = driver.findElement(By.id("twotabsearchtextbox"));
      element6.sendKeys("one plus 7t");
      WebElement element7 = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
      element7.click();
      WebElement element4 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
      element4.click();
for(String winHandle : driver.getWindowHandles())
 driver.switchTo().window(winHandle);

WebElement element10 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
WebElement element11 = driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"));
WebElement element12 = driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-submit\"]"));
String element13= driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText();
Assert.assertEquals(true, element10.isEnabled());
Assert.assertEquals(true, element11.isEnabled());
Assert.assertEquals(true, element12.isEnabled());
Assert.assertEquals(true, element13.contains("OnePlus 7T (Glacier Blue, 8GB RAM, Fluid AMOLED Display, 128GB Storage, 3800mAH Battery)"));
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  //launches the chromedriver
		driver.manage().window();
		driver.navigate().to("http://www.google.com/");
		driver.manage().window();
		driver.navigate().to("https://www.amazon.in/");
		        try {
		Thread.sleep(4000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	  }	
  
  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "A:\\Test-Auto\\chromedriver\\chromedriver.exe"); 
	  driver = new ChromeDriver();//sets the address of the chrome driver exe path
	//WebDriver is an interface
	//Scanner myObj = new Scanner(System.in);
	//System.out.print("1.Expected Out 2.Different Output ");
	   //int number = myObj.nextInt();
  }
	

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
