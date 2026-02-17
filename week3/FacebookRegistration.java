package week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {

		// Initialize the WebDriver and maximize page
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on the Create new account button
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();

		// Enter the First name
		driver.findElement(By.name("firstname")).sendKeys("abcde");
		
		// Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("fghij");
		
		// Enter the Mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		
		// Enter the New password
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		
		// Handle all three dropdowns in Date of birth
		WebElement dateDd = driver.findElement(By.id("day"));
		Select dateDrp = new Select(dateDd);
		dateDrp.selectByValue("16");
		
		WebElement monthDd = driver.findElement(By.id("month"));
		Select monthDrp = new Select(monthDd);
		monthDrp.selectByValue("1");
		
		WebElement yearDd = driver.findElement(By.id("year"));
		Select yearDrp = new Select(yearDd);
		yearDrp.selectByValue("2026");
		
		// Select the radio button in Gender.
		driver.findElement(By.id("sex")).click();

	}

}
