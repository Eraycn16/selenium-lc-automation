import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends BasePage{

	By controllerProductId = By.id("pd_add_to_cart");
	By productPriceId = By.id("price");
	By sizeController = By.className("button-link mobile-size-button");
	By typeSize = By.cssSelector("dix#option-size.option-size");
	By deneme = By.id("option-size");
	
	
	public int productPrice ;

	public ProductDetailPage(WebDriver driver) {
		super(driver);
	}

	public boolean isOnProductDetailPage() {
		return isDisplayed(controllerProductId);
	}

	public void selectSize() {
		getAllSize().get(1).click();
		System.out.println("Secildi");
		
	}
	
	public void addToCart() {
		
		click(controllerProductId);	
	}
	
	public int getPrice() {
		String price = find(productPriceId).getText();
		productPrice = Integer.parseInt(price);
		return productPrice;
	}
	
	
	private List<WebElement> getAllSize(){
		
		return findAll(typeSize);
	}

}
