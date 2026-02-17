package week3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		// Initialize the WebDriver and maximize page
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// enter user-name, password and click login
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// lick on the "CRM/SFA" link
		driver.findElement(By.id("label")).click();

		// click the "Leads" link.
		driver.findElement(By.linkText("Leads")).click();

		// click "Find leads."
		driver.findElement(By.linkText("Find Leads")).click();

		// click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		// Enter the phone number.
		String phoneNumber = "98546231";
		driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys(phoneNumber);

		// Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Capture the lead ID of the first resulting lead.
		wait.until(ExpectedConditions.textToBePresentInElementLocated(
				By.xpath("(//table[@class=\"x-grid3-row-table\"])[1]//tr[1]/td[15]/div"), phoneNumber));

		WebElement leadID = driver.findElement(By.xpath("(//table[@class=\"x-grid3-row-table\"])[1]//tr[1]/td[1]//a"));
		String leadNo = leadID.getText();
		System.out.println(leadNo);
		leadID.click();
		
		// Click the "Delete" button.
		driver.findElement(By.className("subMenuButtonDangerous")).click();

		// Click "Find leads" again.
		driver.findElement(By.linkText("Find Leads")).click();
		
		// Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys(leadNo);

		// Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		// Verify the presence of the message "No records to display" in the Lead List. 
		String expectedErrorMsg = "No records to display";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("x-paging-info"), expectedErrorMsg));
		String errorMsg = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(errorMsg);
		
		//confirms the successful deletion
		if(errorMsg.equalsIgnoreCase("No records to display"))
		{
			System.out.println("LeadID is Successfully deleted");
		}
			
		else
			System.out.println("LeadID is not deleted");
		
		// Close the browser.
		driver.quit();

	}

}
