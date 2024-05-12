import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {
	
	private WebDriver driver;
	
	@FindBy (id = "userName")
	private WebElement usernameField;
	
	@FindBy (id = "userEmail")
	private WebElement userEmailField;
	
	@FindBy (id = "currentAddress")
	private WebElement userCurrentAddress;
	
	@FindBy (id = "permanentAddress")
	private WebElement userpermanentAddress;
	
	@FindBy (id = "submit")
	private WebElement Clickbutton;

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	public PageObjectClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void enterUsername(String username) {
		usernameField.sendKeys(username);
		

	}
	public void enterEmail(String email) {
		userEmailField.sendKeys(email);
	}
	public void EnterCurrentAddress(String Address1) {
		userCurrentAddress.sendKeys(Address1);
	}
	public void enterPermanentAddress(String Address2) {
		userpermanentAddress.sendKeys(Address2);
	}
	public void button(String button) {
		Clickbutton.sendKeys(button);

}}
