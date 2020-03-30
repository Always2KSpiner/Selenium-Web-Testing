package testautomation;

import java.util.Scanner;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.BeforeMethod;

public class Product_Tab {

public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "A:\\Test-Auto\\chromedriver\\chromedriver.exe");       //sets the address of the chrome driver exe path
//WebDriver is an interface
//Scanner myObj = new Scanner(System.in);
//System.out.print("1.Expected Out 2.Different Output ");
   //int number = myObj.nextInt();

WebDriver  driver = new ChromeDriver(); //launches the chromedriver
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
        //WebElement element5 = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        //element5.click();
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
/* try {
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}*/
//driver.quit();
WebElement element12 = driver.findElement(By.xpath("//*[@id=\"priceblock_dealprice\"]"));
Assert.assertEquals(true, element10.isEnabled());
Assert.assertEquals(true, element11.isEnabled());
Assert.assertEquals(element12.getText(), "₹ 34,999.00");
System.out.print("done");
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
//driver.quit();
}

}