import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
public class xebia_header {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","A:\\Test-Auto\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://xebia.com/");
		driver.manage().window().maximize();
		WebElement header_element1 =driver.findElement(By.xpath("//*[@id=\"hs-eu-decline-button\"]"));
		header_element1.click();
		//WebElement header_element3 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[1]/a"));
		//Assert.assertEquals(true, header_element3.isEnabled());
		//WebElement header_element4 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[2]/a"));
		//Assert.assertEquals(true, header_element4.isEnabled());
		//WebElement header_element5 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[3]/a"));
		//Assert.assertEquals(true, header_element5.isEnabled());
		/*WebElement header_element6 =driver.findElement(By.xpath("//*[@id=\"navul\"]/li[4]/a"));
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
		//String title=driver.getTitle();
		//System.out.println(title);
		//driver.close();
		//driver.close();
		System.out.println("Test Complete");
		header_element5.click();
		String main= driver.getWindowHandle();
		WebElement test10= driver.findElement(By.xpath("//*[@id=\"productsoverview\"]/section/div[1]/div[1]/div/a/img"));
		test10.click();
		for(String winHandle : driver.getWindowHandles())
			 driver.switchTo().window(winHandle);
		String url = driver.getCurrentUrl();
	    Assert.assertTrue(url.startsWith("https://www.stackstate.com/"));
	    driver.close();
	    driver.switchTo().window(main);
	    System.out.println("Test Complete");
	    //main= driver.getWindowHandle();
		WebElement test11= driver.findElement(By.xpath("//*[@id=\"productsoverview\"]/section/div[2]/div[1]/div/a/img"));
		test11.click();
		for(String winHandle : driver.getWindowHandles())
			 driver.switchTo().window(winHandle);
		url = driver.getCurrentUrl();
	    Assert.assertTrue(url.startsWith("https://instruqt.com/"));
	    driver.close();
	    driver.switchTo().window(main);
	    System.out.println("Test Complete");*/
		
	}
}
