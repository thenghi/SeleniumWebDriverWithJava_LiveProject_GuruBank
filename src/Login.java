import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette", Utility.Geckopath);
		WebDriver driver = new FirefoxDriver();
		
		driver.get(Utility.baseURL);
		driver.findElement(By.name("uid")).sendKeys(Utility.username);
		driver.findElement(By.name("password")).sendKeys(Utility.password);
		driver.findElement(By.name("btnLogin")).submit();

	}

}
