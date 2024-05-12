import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ecommerce.tealiumdemo.com/");
		
		//getCurrentUrl
		
		//System.out.println(driver.getCurrentUrl());
		
		//getPageSource
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle
		
		//System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[3]/a")).click();
		Set<String> windowids= driver.getWindowHandles();
		Thread.sleep(5000);

		System.out.println(windowids);
		driver.close();
		


		

	}

}
