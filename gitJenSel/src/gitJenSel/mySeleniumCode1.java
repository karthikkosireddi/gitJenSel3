package gitJenSel;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class mySeleniumCode1 {

	public static void main(String[] args) throws Exception {
		System.out.println("      >>>>>>>>> Started Execution");
		WebDriver myDriver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		myDriver = new ChromeDriver(); 
		
		//DesiredCapabilities capability = DesiredCapabilities.chrome();
		// capability.setCapability("jenkins.label","redhat5 && amd64");
		// capability.setCapability("jenkins.nodeName","(master)");
		//WebDriver myDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		
		
		myDriver.manage().window().maximize(); 
		
		myDriver.navigate().to("https://www.itelearn.com/");
		

		Thread.sleep(4000);
		myDriver.quit();
		System.out.println("      >>>>>>>>> Ended Execution");
	}

}