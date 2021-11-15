package posmy.interview.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import posmy.interview.qa.driver.RemoteWebDriverFactory;
import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest {

	/**
	 * Rigorous Test :-)
	 */

	static RemoteWebDriver driver = RemoteWebDriverFactory.chrome();
	static Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		/*
		 * Ensure Chrome Driver version is compatible with the current Selenium version
		 */
		/*
		 * Mine was
		 * https://chromedriver.storage.googleapis.com/index.html?path=91.0.4472.101/
		 */
		driver = RemoteWebDriverFactory.chrome();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void searchSite() {
		driver.get("http://www.google.com/");
		driver.manage().window().setSize(new Dimension(1382, 754));
		

		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("covid 19 in Malaysia");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector(".UDZeY div:nth-child(1) > .g .LC20lb")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".tm-item:nth-child(5) .tm-image"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}

	}

}
