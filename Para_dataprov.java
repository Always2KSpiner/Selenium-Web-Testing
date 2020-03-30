package testautomation;



class data_prov{
	@DataProvider(name = "Feedback_form")
    public static Object[][] dataProviderMethod1() {
        Object[][] data = new Object[3][3];

        data[0][0] = "Anirudh";
        data[0][1] = "abc@gmail.com";
        data[0][2] = "22248101";
        
        data[1][0] = "Darsh";
        data[1][1] = "xyz@gmail.com";
        data[1][2] = "22298564";
        
        data[2][0] = "Saurabh";
        data[2][1] = "efg@gmail.com";
        data[2][2] = "22247639";
        return data;
       
    }
}
public class Para_dataprov {

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
			driver.get("http://thedemosite.co.uk/");
			String title=driver.getTitle();
			
			//Assert.assertTrue(title.contains("Xebia"));
		}

	@Test(dataProvider="Feedback_form",dataProviderClass=data_prov.class,enabled=true,priority=2)
	public void digi_tes(String name,String mail,String tele) throws InterruptedException {
		//driver.get("https://pages.xebia.com/digital-transformation");
		WebElement header_element1 =driver.findElement(By.xpath("/html/body/div/center/a[4]"));
		header_element1.click();
		WebElement test1= driver.findElement(By.xpath("/html/body/div[2]/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/input"));
		test1.sendKeys(name);
		WebElement test2= driver.findElement(By.xpath("/html/body/div[2]/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/input"));
		test2.sendKeys(mail);
		WebElement test3= driver.findElement(By.xpath("/html/body/div[2]/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/input"));
		test3.sendKeys(tele);
		String submit= driver.findElement(By.xpath("/html/body/div[2]/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[5]/td/p/input")).getText();
		System.out.println(submit);
		Assert.assertEquals(false, submit.contains("Submit"));
		System.out.println("Feedback");
	}


}
