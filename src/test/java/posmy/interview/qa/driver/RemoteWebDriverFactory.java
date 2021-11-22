package posmy.interview.qa.driver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;


public class RemoteWebDriverFactory {

	private RemoteWebDriverFactory() {
	}

	public static RemoteWebDriver chrome() {
		chromedriver().useLocalVersionsPropertiesFirst().setup();
		return new ChromeDriver();
	}
	
	

}
