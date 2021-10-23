import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	By loginRef = By.className("dropdown-toggle");
	By controlRef = By.id("header__container");

	SearchBox searchBox;

	public HomePage(WebDriver driver) {
		super(driver);
		searchBox = new SearchBox(driver);
		
	}
	
	public boolean controlHome() {
		
		return isDisplayed(controlRef);
	}
	
	public SearchBox searchBox() {
		return this.searchBox;
	}
	
	public void login(int i) {
		
		getAllOptions().get(i).click();
	}
	
	public void goCart(int i) {
		getAllOptions().get(i).click();
	}
	
	private List<WebElement> getAllOptions(){
			
		return findAll(loginRef);
	}
}
