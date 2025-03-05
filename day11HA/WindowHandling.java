package day11HA;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']/following-sibling::a")).click();
		
		Set<String> allOpenedWindow = driver.getWindowHandles();
		List<String> focusWindow=new ArrayList<String>(allOpenedWindow);
		
		driver.switchTo().window(focusWindow.get(1));
		
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		
		driver.switchTo().window(focusWindow.get(0));
		
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdTo']/following-sibling::a")).click();
		
		Set<String> allOpenedWindow1 = driver.getWindowHandles();
		List<String> focusWindow1=new ArrayList<String>(allOpenedWindow1);
		
		driver.switchTo().window(focusWindow1.get(1));
		
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		
		driver.switchTo().window(focusWindow1.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		driver.switchTo().alert().accept();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
