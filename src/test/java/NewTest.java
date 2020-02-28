import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/Users/k/Documents/DevOps/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  Thread.sleep(3000);
	  driver.quit();
  }
  @Test()
  public void test1() {
	  System.out.println("test1");
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 1" + id);
  }
	}