package day6HA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Atharsh01");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		Select industry=new Select(industryDropdown);
		industry.selectByVisibleText("Computer Software");
		
		WebElement ownerDropdowm = driver.findElement(By.name("ownershipEnumId"));
		Select owner=new Select(ownerDropdowm);
		owner.selectByVisibleText("S-Corporation");
		
		WebElement sourceDropdowm = driver.findElement(By.name("dataSourceId"));
		Select source=new Select(sourceDropdowm);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketDropdown = driver.findElement(By.id("marketingCampaignId"));
		Select market=new Select(marketDropdown);
		market.selectByIndex(6);
		
		WebElement stateDropdowm = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state=new Select(stateDropdowm);
		state.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(10000);
		driver.close();
	
		
		
		
	}

}
