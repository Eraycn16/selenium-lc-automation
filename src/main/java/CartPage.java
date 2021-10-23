import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{


	By productPrice = By.className("rd-cart-item-price mb-15");
	By addedProduct = By.className("oq-up");
	By cartRef = By.className("rd-cart-item shoppingcart-item");
	By deleteRef = By.className("cart-square-link");
	By deletePop = By.className("inverted-modal-button");
	By emptyRef = By.className("row");
	By number = By.cssSelector("input.item-quantity-input.ignored");
 
	
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	public void deleteCart() {
		
		click(deleteRef);
		System.out.println("30");
		click(deletePop);
		
	}
	public boolean equalNumber() {
		
		String num = find(number).getText();
		System.out.println(num);
		return Integer.parseInt(num) == 2;
	}
	
    public boolean isEmpty() {
	
    	return isDisplayed(emptyRef);
     }
     
	public void addingProduct() {
		

		click(addedProduct);  
		System.out.println("Artýrýldý.");
		
	}
	public boolean check() {
		return isDisplayed(addedProduct);
	}



	
	public int getProductPrice() {
		
		String pPrice = find(productPrice).getText();
		return Integer.parseInt(pPrice);
	}

}
