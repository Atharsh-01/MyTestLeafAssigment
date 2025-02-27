package day6HA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("TestLeaf01");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Atharsh");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("Atharsh01");
		driver.findElement(By.xpath("//input[@name=\"departmentName\"]")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Automation Test Engineer");
		driver.findElement(By.xpath("(//input[@name=\"primaryEmail\"])[4]")).sendKeys("atharshsn003@gmail.com");
		
		WebElement stateDropdowm = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state=new Select(stateDropdowm);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).clear();
		driver.findElement(By.xpath("//textarea[@name=\"importantNote\"]")).sendKeys("New Joinee");
		
		driver.findElement(By.xpath("(//input[@name=\"submitButton\"])[1]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
