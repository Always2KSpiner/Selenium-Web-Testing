
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


public class launcher {
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
	 /* @AfterMethod
	  public void xebia_exit() {
		  driver.close();
	  }*/

	@Test(enabled=true,priority=3)
	public void footerTester() {

		// Footer LinkText are check if they are enabled or not
		try {
		WebElement header_element1 =driver.findElement(By.xpath("//*[@id=\"hs-eu-decline-button\"]"));
		header_element1.click();
		}
		catch (org.openqa.selenium.NoSuchElementException e)
		{
			System.out.println("Skip");
		}
		WebElement mailer = driver.findElement(By.linkText("info@xebia.com"));
		Assert.assertTrue(mailer.isEnabled());
		WebElement tel = driver.findElement(By.linkText("+31 (0)35 538 1921"));
		Assert.assertTrue(tel.isEnabled());
		
		//Footer Buttons to Social Media 
		WebElement linkedin = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/ul/li[1]"));
		Assert.assertTrue(linkedin.isEnabled());
		WebElement twitter = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/ul/li[2]"));
		Assert.assertTrue(twitter.isEnabled());
		WebElement facebook = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/ul/li[3]"));
		Assert.assertTrue(facebook.isEnabled());
		WebElement instagram = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/ul/li[4]"));
		Assert.assertTrue(instagram.isEnabled());
		WebElement youtube = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/ul/li[5]"));
		Assert.assertTrue(youtube.isEnabled());
		
		//Footer Button Xebia
		WebElement footer_xebia = driver.findElement(By.id("Laag_1"));
			//Checking weather the button is not crashing the response
		Assert.assertTrue(footer_xebia.isEnabled());
		footer_xebia.click();
	}
	
	@Test(enabled=true,priority=1)
	public void main_header()
	{
		try {
			WebElement header_element1 =driver.findElement(By.xpath("//*[@id=\"hs-eu-decline-button\"]"));
			header_element1.click();
			}
			catch (org.openqa.selenium.NoSuchElementException e)
			{
				System.out.println("Skip");
			}
		WebElement header_element3 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[1]/a"));
		Assert.assertEquals(true, header_element3.isEnabled());
		WebElement header_element4 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/a"));
		Assert.assertEquals(true, header_element4.isEnabled());
		WebElement header_element5 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[3]/a"));
		Assert.assertEquals(true, header_element5.isEnabled());
		WebElement header_element6 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[4]/a"));
		Assert.assertEquals(true, header_element6.isEnabled());
		WebElement header_element7 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/a"));
		Assert.assertEquals(true, header_element7.isEnabled());
		WebElement header_element8 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[6]/a"));
		Assert.assertEquals(true, header_element8.isEnabled());
		WebElement header_element9 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[7]/a"));
		Assert.assertEquals(true, header_element9.isEnabled());
		WebElement header_element10 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[8]/a"));
		Assert.assertEquals(true, header_element10.isEnabled());
		WebElement header_element11 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[9]/a"));
		Assert.assertEquals(true, header_element11.isEnabled());
		System.out.println("Header Buttons Enabled");
	}
	
	@Test(enabled=true,priority=2)
	public void service_subheader() {
		try {
			WebElement header_element1 =driver.findElement(By.xpath("//*[@id=\"hs-eu-decline-button\"]"));
			header_element1.click();
			}
			catch (org.openqa.selenium.NoSuchElementException e)
			{
				System.out.println("Skip");
			}
		WebElement service_sub_head1 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[1]/a"));
		Assert.assertEquals(true, service_sub_head1.isEnabled());
		WebElement service_sub_head2 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[2]/a"));
		Assert.assertEquals(true, service_sub_head2.isEnabled());
		WebElement service_sub_head3 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[3]/a"));
		Assert.assertEquals(true, service_sub_head3.isEnabled());
		WebElement service_sub_head4 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[4]/a"));
		Assert.assertEquals(true, service_sub_head4.isEnabled());
		WebElement service_sub_head5 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[5]/a"));
		Assert.assertEquals(true, service_sub_head5.isEnabled());
		WebElement service_sub_head6 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[6]/a"));
		Assert.assertEquals(true, service_sub_head6.isEnabled());
		WebElement service_sub_head7 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[7]/a"));
		Assert.assertEquals(true, service_sub_head7.isEnabled());
		WebElement service_sub_head8 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[8]/a"));
		Assert.assertEquals(true, service_sub_head8.isEnabled());
		WebElement service_sub_head9 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[9]/a"));
		Assert.assertEquals(true, service_sub_head9.isEnabled());
		WebElement service_sub_head10 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[10]/a"));
		Assert.assertEquals(true, service_sub_head10.isEnabled());
		WebElement service_sub_head11 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/div/nav/li[11]/a"));
		Assert.assertEquals(true, service_sub_head11.isEnabled());
		System.out.println("Service Sub Buttons Enabled");
	}
	
	@Test(enabled=true,priority=2)
	public void train_subheader() {
		try {
			WebElement header_element1 =driver.findElement(By.xpath("//*[@id=\"hs-eu-decline-button\"]"));
			header_element1.click();
			}
			catch (org.openqa.selenium.NoSuchElementException e)
			{
				System.out.println("Skip");
			}
		WebElement event_sub_head1 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[1]/a"));
		Assert.assertEquals(true, event_sub_head1.isEnabled());
		WebElement event_sub_head2 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[2]/a"));
		Assert.assertEquals(true, event_sub_head2.isEnabled());
		WebElement event_sub_head3 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[3]/a"));
		Assert.assertEquals(true, event_sub_head3.isEnabled());
		WebElement event_sub_head4 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[4]/a"));
		Assert.assertEquals(true, event_sub_head4.isEnabled());
		WebElement event_sub_head5 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[5]/a"));
		Assert.assertEquals(true, event_sub_head5.isEnabled());
		WebElement event_sub_head6 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[6]/a"));
		Assert.assertEquals(true, event_sub_head6.isEnabled());
		WebElement event_sub_head7 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[7]/a"));
		Assert.assertEquals(true, event_sub_head7.isEnabled());
		WebElement event_sub_head8 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[8]/a"));
		Assert.assertEquals(true, event_sub_head8.isEnabled());
		WebElement event_sub_head9 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[9]/a"));
		Assert.assertEquals(true, event_sub_head9.isEnabled());
		WebElement event_sub_head10 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[10]/a"));
		Assert.assertEquals(true, event_sub_head10.isEnabled());
		WebElement event_sub_head11 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[11]/a"));
		Assert.assertEquals(true, event_sub_head11.isEnabled());
		WebElement event_sub_head12 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[12]/a"));
		Assert.assertEquals(true, event_sub_head12.isEnabled());
		WebElement event_sub_head13 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[13]/a"));
		Assert.assertEquals(true, event_sub_head13.isEnabled());
		WebElement event_sub_head14 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[5]/div/nav/li[14]/a"));
		Assert.assertEquals(true, event_sub_head14.isEnabled());
		System.out.println("Training Sub Buttons Enabled");
	}
	
	@Test(enabled=true,priority=2)
	public void etc_header() {
		try {
			WebElement header_element1 =driver.findElement(By.xpath("//*[@id=\"hs-eu-decline-button\"]"));
			header_element1.click();
			}
			catch (org.openqa.selenium.NoSuchElementException e)
			{
				System.out.println("Skip");
			}
		WebElement car_sub_head1 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[6]/div/nav/li[1]/a"));
		Assert.assertEquals(true, car_sub_head1.isEnabled());
		WebElement car_sub_head2 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[6]/div/nav/li[2]/a"));
		Assert.assertEquals(true, car_sub_head2.isEnabled());
		System.out.println("Career Sub Buttons Enabled");
		WebElement art_sub_head1 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[7]/div/nav/li[1]/a"));
		Assert.assertEquals(true, art_sub_head1.isEnabled());
		System.out.println("Articles Sub Buttons Enabled");
		WebElement abt_sub_head1 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[8]/div/nav/li[1]/a"));
		Assert.assertEquals(true, abt_sub_head1.isEnabled());
		WebElement abt_sub_head2 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[8]/div/nav/li[2]/a"));
		Assert.assertEquals(true, abt_sub_head2.isEnabled());
		WebElement abt_sub_head3 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[8]/div/nav/li[3]/a"));
		Assert.assertEquals(true, abt_sub_head3.isEnabled());
		WebElement abt_sub_head4 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[8]/div/nav/li[4]/a"));
		Assert.assertEquals(true, abt_sub_head4.isEnabled());
		System.out.println("AboutUs Sub Buttons Enabled");
		WebElement search_element =driver.findElement(By.xpath("//*[@id=\"nav-search-home\"]/form/input"));
		search_element.clear();		
		search_element.sendKeys("TestText");
		search_element.sendKeys(Keys.ENTER);
		System.out.println("Search Bar Working");
	}
	
	@Test(enabled=true,priority=4)
	public void Client_test()
	{
		try {
			WebElement header_element1 =driver.findElement(By.xpath("//*[@id=\"hs-eu-decline-button\"]"));
			header_element1.click();
			}
			catch (org.openqa.selenium.NoSuchElementException e)
			{
				System.out.println("Skip");
			}
		WebElement header_element3 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[1]/a"));
		header_element3.click();
		String main= driver.getWindowHandle();
		WebElement test1= driver.findElement(By.xpath("//*[@id=\"Chrome-80\"]/section/div[1]/div/div[1]/div[1]/a"));
		test1.click();
		for(String winHandle : driver.getWindowHandles())
			 driver.switchTo().window(winHandle);
	    String title=driver.getTitle();
	    Assert.assertTrue(title.contains("Faster Customer Applications at ING - Client Case"));
	    driver.close();
	    driver.switchTo().window(main);
	    try {
	    	WebElement test2= driver.findElement(By.xpath("//*[@id=\"Chrome-80\"]/section/div[1]/div/div[2]/div[1]/a"));
			test2.click();
	    }
	    catch(org.openqa.selenium.StaleElementReferenceException ex)
	    {
	    	 WebElement test2= driver.findElement(By.xpath("//*[@id=\"Chrome-80\"]/section/div[1]/div/div[2]/div[1]/a"));
	 		test2.click();
	    }
	    title=driver.getTitle();
	    Assert.assertTrue(title.contains("Xebia"));
	    driver.navigate().back();
	    try {
	    	WebElement test3= driver.findElement(By.xpath("//*[@id=\"Chrome-80\"]/section/div[1]/div/div[1]/div[2]/a"));
			test3.click();
	    }
	    catch(org.openqa.selenium.StaleElementReferenceException ex)
	    {
	    	WebElement test3= driver.findElement(By.xpath("//*[@id=\"Chrome-80\"]/section/div[1]/div/div[1]/div[2]/a"));
			test3.click();
	    }
	    title=driver.getTitle();
	    Assert.assertTrue(title.contains("Xebia"));
		driver.navigate().back();
	    try {
	    	WebElement test4= driver.findElement(By.xpath("//*[@id=\"Chrome-80\"]/section/div[1]/div/div[2]/div[2]/a"));
			test4.click();
	    }
	    catch(org.openqa.selenium.StaleElementReferenceException ex)
	    {
	    	WebElement test4= driver.findElement(By.xpath("//*[@id=\"Chrome-80\"]/section/div[1]/div/div[2]/div[2]/a"));
			test4.click();
	    }
	    title=driver.getTitle();
	    Assert.assertTrue(title.contains("Xebia"));
		driver.navigate().back();
	}
	

	@DataProvider(name = "feedbackForm")
    public Object[][] dataProviderMethod() {
        Object[] [] data = new Object[3][4];

        data[0][0] = "Saurabh";
        data[0][1] = "Kumar";
        data[0][2] = "saurabhkumar1@gmail.com";
        data[0][3] = "98854212641";
       
        data[1][0] = "Amit";
        data[1][1] = "Kumar";
        data[1][2] = "amitkumar1@gmail.com";
        data[1][3] = "9885455426";
       
        data[2][0] = "Rohan";
        data[2][1] = "Singh";
        data[2][2] = "singhrohan123@gmail.com";
        data[2][3] = "9877451368";
       
        return data;
       
    }

		@Test(dataProvider="feedbackForm",enabled=true,priority=5)
		public void forms(String fn, String ln,String email,String no) throws InterruptedException {
		
		WebElement carrers = driver.findElement(By.linkText("Careers"));
		carrers.click();
		carrers.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("Contact"))));
		
		WebElement contact = driver.findElement(By.linkText("Contact"));
		contact.click();
		contact.click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("Contact"))));
		
		WebElement firstNameField = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div"));
		WebElement lastNameField = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div"));
		WebElement mail = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div"));
		WebElement phone = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div"));
		WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[5]/input"));
		
		firstNameField.sendKeys(fn);
		lastNameField.sendKeys(ln);
		mail.sendKeys(email);
		phone.sendKeys(no);
		
		submit.click();
		}
	
		@DataProvider(name = "downloadForm")
	    public Object[][] dataProviderMethod2() {
	        Object[][] data = new Object[3][3];

	        data[0][0] = "Saurabh";
	        data[0][1] = "500061583@stu.upes.ac.in";
	        data[0][2] = "IT/DevOps";
	       
	        data[1][0] = "Anirudh";
	        data[1][1] = "500011473@stu.upes.ac.in";
	        data[1][2] = "IT/DevOps";
	       
	        data[2][0] = "Shivam";
	        data[2][1] = "500061432@stu.upes.ac.in";
	        data[2][2] = "IT /DevOps";

	       
	        return data;
	       
	    }

	@Test(dataProvider="downloadForm",enabled=true,priority=6)
	public void blogChecker(String name, String id, String field) throws InterruptedException {
	WebElement link1 = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div[1]/a/div"));
	link1.click();
	link1.click();
	try {
	WebElement firstname = driver.findElement(By.cssSelector("#firstname-978afb37-817b-46e6-ac47-a0974e54fd21_6979"));
	WebElement email = driver.findElement(By.cssSelector("#email-978afb37-817b-46e6-ac47-a0974e54fd21_6979"));
	WebElement dropdown = driver.findElement(By.cssSelector("#hs_persona-978afb37-817b-46e6-ac47-a0974e54fd21_6979"));
	WebElement submit = driver.findElement(By.cssSelector("/form[@id='hsForm_978afb37-817b-46e6-ac47-a0974e54fd21_4036']/div[5]/div[2]/input[1]"));
	firstname.sendKeys(name);
	email.sendKeys(id);
	dropdown.sendKeys(field);
	submit.click();
	}
	catch(org.openqa.selenium.StaleElementReferenceException ex) {
		WebElement firstname = driver.findElement(By.cssSelector("#firstname-978afb37-817b-46e6-ac47-a0974e54fd21_6979"));
		WebElement email = driver.findElement(By.cssSelector("#email-978afb37-817b-46e6-ac47-a0974e54fd21_6979"));
		WebElement dropdown = driver.findElement(By.cssSelector("#hs_persona-978afb37-817b-46e6-ac47-a0974e54fd21_6979"));
		WebElement submit = driver.findElement(By.cssSelector("/form[@id='hsForm_978afb37-817b-46e6-ac47-a0974e54fd21_4036']/div[5]/div[2]/input[1]"));
		firstname.sendKeys(name);
		email.sendKeys(id);
		dropdown.sendKeys(field);
		submit.click();
	}
	}
	
	@Test(enabled=true,priority=4)
	public void product_extlink() {
		WebElement header_element3 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[3]/a"));
		header_element3.click();
		String main= driver.getWindowHandle();
		WebElement test10= driver.findElement(By.xpath("//*[@id=\"productsoverview\"]/section/div[1]/div[1]/div/a/img"));
		test10.click();
		for(String winHandle : driver.getWindowHandles())
			 driver.switchTo().window(winHandle);
		String url = driver.getCurrentUrl();
	    Assert.assertTrue(url.startsWith("https://www.stackstate.com/"));
	    driver.close();
	    driver.switchTo().window(main);
		WebElement test11= driver.findElement(By.xpath("//*[@id=\"productsoverview\"]/section/div[2]/div[1]/div/a/img"));
		test11.click();
		for(String winHandle : driver.getWindowHandles())
			 driver.switchTo().window(winHandle);
		url = driver.getCurrentUrl();
	    Assert.assertTrue(url.startsWith("https://instruqt.com/"));
	    driver.close();
	    driver.switchTo().window(main);
	    System.out.println("External Links Valid");
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
