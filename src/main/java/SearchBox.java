import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {

	By searchBox = By.className("search-box__input");
	By searchBoxLocator= By.id("search_input");
	
	public SearchBox(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void search(String text) {
		
		click(searchBox);
		type(searchBoxLocator, text);
		webDriver.findElement(By.className("sb-header__search-box")).findElement(By.cssSelector("button")).click();
		
	}
}
