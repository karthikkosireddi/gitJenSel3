import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swd1 {
	public static void main(String[] args) throws Exception {
		System.out.println("      >>>>>>>>> Started Execution");
		WebDriver myDriver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		myDriver = new ChromeDriver(); 
		
		myDriver.manage().window().maximize(); 
		
		myDriver.navigate().to("https://www.itelearn.com/");
		System.out.println("Navigated. Now will wait for 4 seconds.");
		Thread.sleep(4000);
		myDriver.quit();
		
		System.out.println("      >>>>>>>>> Ended Execution");
	}
}
