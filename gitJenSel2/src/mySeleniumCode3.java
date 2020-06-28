import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class mySeleniumCode3 {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		System.out.println("      >>>>>>>>> Started Execution");
		
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		//ChromeOptions capability = new ChromeOptions();
		capability.setBrowserName("chrome");
		//capability.setPlatform(Platform.WIN10);
		capability.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//options.addArguments("--headless");
		options.merge(capability);
		
		//WebDriver myDriver;
		//myDriver = new RemoteWebDriver(new URL("http://localhost:1234/wd/hub"), capability); 

		ChromeDriver myDriver = new ChromeDriver(options);
		
		myDriver.manage().window().maximize(); 
		
		myDriver.navigate().to("https://www.itelearn.com/");
		System.out.println("Title : " + myDriver.getTitle());

		Thread.sleep(4000);
		myDriver.quit();
		System.out.println("      >>>>>>>>> Ended Execution");
	}

}