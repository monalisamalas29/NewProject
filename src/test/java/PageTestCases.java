import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTestCases {
	
	private WebDriver driver;
	private PageObjectClass PageObjectClass;

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91959\\Downloads\\chromedriverdownload\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91959\\Downloads\\chromedriver-win64(1)\\chromedriver-win64\\cromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		PageObjectClass = new PageObjectClass(driver);

	}
	
	@Test
	public void testTextBox() {
		PageObjectClass.enterUsername("Monalisa");
		PageObjectClass.enterEmail("monalisamalas9@gmail.com");
		PageObjectClass.EnterCurrentAddress("Current Address");
		PageObjectClass.enterPermanentAddress("Permanent Address");
	}
	
	//@AfterMethod
	//public void teardown() {
		
	}

