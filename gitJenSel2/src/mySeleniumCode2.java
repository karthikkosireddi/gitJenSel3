import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class mySeleniumCode2 {

	public static void main(String[] args) throws Exception {
		System.out.println("      >>>>>>>>> Started Execution");
		
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		//ChromeOptions capability = new ChromeOptions();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver myDriver;
		myDriver = new RemoteWebDriver(new URL("http://localhost:1234/wd/hub"), capability); 

		
		myDriver.manage().window().maximize(); 
		
		myDriver.navigate().to("https://www.itelearn.com/");
		

		Thread.sleep(4000);
		myDriver.quit();
		System.out.println("      >>>>>>>>> Ended Execution");
	}

}