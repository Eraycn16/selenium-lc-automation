import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	
	By mailRef =By.id("LoginEmail");
	By passwordRef = By.id("Password");
	By btnLogin = By.id("loginLink");

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	

	public boolean isSuccess() {
		
		return isDisplayed(mailRef);
	}
	
	public void login(String mail, String password) {
		
		//System.out.println(btnLogin);
		type(mailRef, mail);
		type(passwordRef, password);
		click(btnLogin);
	
	}
}
