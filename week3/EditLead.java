package week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		
		// Initialize the WebDriver and maximize page
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter the Username ,password and login
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		
		//Click on the Leads Button
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead. 
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the CompanyName Field Using Xpath
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("testleaf");
		
		//Enter the FirstName Field Using Xpath. 
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("swadha");
		
		//Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("srini");
		
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("swadha");
		
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_departmentName\"]")).sendKeys("IT");
		
		//Enter the Description Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("EditLead description");
		
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("swadhasrini@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text.
		WebElement stateDD = driver.findElement(By.xpath("//select[@name=\"generalStateProvinceGeoId\"]"));
		Select stateDrp = new Select(stateDD);
		stateDrp.selectByVisibleText("New York");
		
		//Click on the Create Button.
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		
		//Click on the edit button. 
		driver.findElement(By.xpath("//a[text()=\"Edit\"]")).click();
		
		//Clear the Description Field. 
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).clear();
		
		//Fill the Important Note Field with Any text.
		driver.findElement(By.xpath("//textarea[@name=\"importantNote\"]")).sendKeys("EditLead description-imp note");
		
		//Click on the update button. 
		driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
		
		//Get the Title of the Resulting Page.
		String title =driver.getTitle();
		System.out.println(title);
		
		//Close the browser window.
		driver.quit();
		
		
		
		
		
		

	}

}
