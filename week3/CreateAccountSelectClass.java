package week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {

	public static void main(String[] args) {

		// Initialize the WebDriver and maximize page
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// enter user-name, password and click login
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// lick on the "CRM/SFA" link
		driver.findElement(By.id("label")).click();

		// lick on the "Accounts" tab
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();

		// Click on the "Create Account" button
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

		// Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("MytestAccount");

		// Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");

		// Select "ComputerSoftware" as the industry
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select industryDrp = new Select(industryDD);
		industryDrp.selectByVisibleText("Computer Software");

		// Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement sourceOwnerDD = driver.findElement(By.name("ownershipEnumId"));
		Select ownerDrp = new Select(sourceOwnerDD);
		ownerDrp.selectByVisibleText("S-Corporation");

		// Select "Employee" as the source using SelectByValue.
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select sourceDrp = new Select(sourceDD);
		sourceDrp.selectByValue("LEAD_EMPLOYEE");

		// Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement marketingDD = driver.findElement(By.id("marketingCampaignId"));
		Select marketingDrp = new Select(marketingDD);
		marketingDrp.selectByIndex(6);

		// Select "Texas" as the state/province using SelectByValue.
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateDrp = new Select(stateDD);
		stateDrp.selectByValue("TX");

		// Click the "Create Account" button.
		driver.findElement((By.className("smallSubmit"))).click();
		
		

		// Print account name
		String accountName = driver.findElement(By.xpath("//table[@class='fourColumnForm']//tr[1]//span[@class=\"tabletext\"]")).getText();
		System.out.println("The Account name is: " + accountName);
		
		driver.quit();

	}

}
