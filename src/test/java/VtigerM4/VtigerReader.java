package VtigerM4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.VtigerM4BaseClass.VtigerLogin;

public class VtigerReader {
	@Test
public void loginVtiger() {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("http://localhost:8888/");
	VtigerLogin ref = new VtigerLogin(driver);
	
	WebElement user_name = ref.user_name;
	WebElement user_password = ref.user_password;
	WebElement submitButton = ref.submitButton;
	user_name.sendKeys("admin");
	user_password.sendKeys("root");
	submitButton.click(); 
}
}
