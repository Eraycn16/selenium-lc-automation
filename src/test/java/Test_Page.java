import java.util.Random;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Page extends BaseTest{
	
	HomePage homePage;
	ProductDetailPage productDetailPage;
	ProductsPage productsPage;
	LoginPage loginPage;
	CartPage cartPage;
	Random r =new Random();


	@Test
	public void search() {
		setUp();
		
		homePage = new HomePage(driver);
		productsPage = new ProductsPage(driver);
		
		
		homePage.login(0);
		loginPage = new LoginPage(driver);
		Assertions.assertTrue(loginPage.isSuccess(),"Giris sayfasi yuklenemedi!");
		loginPage.login("", ""); // Birinci alana email adresiniz, ikinci alana sifre bilgilerinizi giriniz..
		Assertions.assertTrue(homePage.controlHome(),"Giris islemi basarisiz!");
				
		homePage.searchBox().search("Pantolan");
		Assertions.assertTrue(productsPage.isOnProductPage(), "Urun bulunamadi!");
		
		productDetailPage = new ProductDetailPage(driver);
		int i = r.nextInt(20);
		//productsPage.moreProduct();
		productsPage.selectProduct(i);		
		Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Urun bilgileri goruntulenemedi!");

		productDetailPage.selectSize();
		productDetailPage.addToCart();
		
		cartPage = new CartPage(driver);
		homePage.goCart(2);
		Assertions.assertTrue(cartPage.check(), "Sepette urun bulunmamaktadir ");
		
		cartPage.addingProduct();
		Assertions.assertTrue(cartPage.equalNumber(), "Eklenen sayi dogru degil");
		
		cartPage.deleteCart();
		Assertions.assertTrue(cartPage.isEmpty(),"Sepet bos");
		
	}

}
