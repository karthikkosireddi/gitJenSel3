package gitJenSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mySeleniumCode1 {

	public static void main(String[] args) {

		WebDriver myDriver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		myDriver = new ChromeDriver(); 
		myDriver.manage().window().maximize(); 
		
		myDriver.navigate().to("https://www.itelearn.com/");
		

	}

}
