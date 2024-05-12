import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		//css selector tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Books");
		//css tag[attribute="value"]
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Books");

		
		driver.close();
		
		
		
		

	}

}
