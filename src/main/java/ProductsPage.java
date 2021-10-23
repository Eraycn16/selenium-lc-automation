
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage{

	
	By controllerId = By.id("category-breadcrumb");
	By buttonMoreProducts = By.className("lazy-load-button");
	By productNameLocater = By.className("col-xs-6");
		
	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	public boolean isOnProductPage() {
		return isDisplayed(controllerId);
	}
	
	
	public void moreProduct() {
		webDriver.findElement(By.className("lazy-load-button")).findElement(By.className("lazy-load-text")).click();
		getAllProduct();
	}

	public void selectProduct(int i)  {
		
		getAllProduct().get(i).click();
	}
	
	private List<WebElement> getAllProduct(){
		
		return findAll(productNameLocater);
	}
}
