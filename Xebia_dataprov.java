package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.*;

public class Xebia_dataprov {

		public WebDriver driver;
		public WebDriverWait wait;
		
		@BeforeTest
		public void launchBrowser() {
			
			System.setProperty("webdriver.chrome.driver", "A:\\Test-Auto\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, 10);
		}
		
		@AfterTest
		public void exitsuite() {
			driver.quit();
		}
		@BeforeMethod
		  public void xebia_home() {
			  //launches the chromedriver
			driver.manage().window().maximize();
			driver.get("https://www.xebia.com");
			String title=driver.getTitle();
			Assert.assertTrue(title.contains("Xebia"));
		}
	
	@DataProvider(name = "Search_Data")
    public Object[] dataProviderMethod1() {
        Object[] data = new Object[3];

        data[0] = "Team";
        data[1] = "Agile";
        data[2] = "Developer";
        return data;
       
    }
	
	@Test(dataProvider="Search_Data",enabled=true,priority=2)
	public void digi_tes(String name) throws InterruptedException {
		driver.get("https://pages.xebia.com/digital-transformation");
		try {
			WebElement header_element1 =driver.findElement(By.xpath("//*[@id=\"hs-eu-decline-button\"]"));
			header_element1.click();
			}
			catch (org.openqa.selenium.NoSuchElementException e)
			{
				System.out.println("Skip");
			}
		WebElement test1= driver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_module_1551270340919565\"]/form/div[1]/input"));
		test1.sendKeys(name);
		test1.sendKeys(Keys.ENTER);
		System.out.println("Search Bar Working");
	}


}
