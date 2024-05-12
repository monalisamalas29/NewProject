import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91959\\Downloads\\chromedriverdownload\\chromedriver.exe");
		
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\91959\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		 // Use WebDriverManager to setup ChromeDriver
        //WebDriverManager.chromedriver().setup();
        
        // Now ChromeDriver is ready to be used
        //ChromeDriver driver = new ChromeDriver();
        
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tagas Women Dress");
		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
		

		
		driver.close();


	}

}
