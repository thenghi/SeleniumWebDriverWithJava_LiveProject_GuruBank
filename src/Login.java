import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C:\\selenium-java-3.4.0\\geckodriver-v0.16.1-win64");
		String baseURL = "http://www.demo.guru99.com/V4/";

		WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);
		driver.findElement(By.name("uid")).sendKeys("mngr99325");
		driver.findElement(By.name("password")).sendKeys("hynUnuz");
		driver.findElement(By.name("btnLogin")).submit();

	}

}
