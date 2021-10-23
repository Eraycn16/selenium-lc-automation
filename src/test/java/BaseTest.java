
//import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)


public class BaseTest {

	protected WebDriver driver;
	
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseProject\\02-com.maven.proje\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
		System.out.println("111");
	}

	 public static void main(String[] args) {
		 
		 BaseTest myObj = new BaseTest();
		 myObj.setUp();

	}
	
		 

}
