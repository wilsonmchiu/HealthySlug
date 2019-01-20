import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Calendar;
import java.util.Date;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Pizza_Time {

	public static void WaitMilliSeconds(int milli) {
		try        
		{
		    Thread.sleep(milli);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}
	
	public static void type_food(WebDriver driver, String food) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement food_name = driver.findElement(By.xpath("//*[@id=\"searchbox\"]"));
		js.executeScript("arguments[0].setAttribute('value','" + food + "')", food_name);
		food_name.sendKeys(Keys.ENTER);
	}
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\josep\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		        
        driver.get("http://www.image-net.org/");
        
        type_food(driver, "bell pepper");
        
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/a/span")).click();
        WaitMilliSeconds(5000);
        driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"downloadstab\"]/a[1]/img")).click();
        //driver.close();
	}
}
