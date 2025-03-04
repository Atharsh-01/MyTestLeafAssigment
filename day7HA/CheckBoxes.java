package day7HA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		WebElement NotificationCB = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]"));
		
		System.out.println(NotificationCB.isSelected());
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		WebElement TriCB = driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]"));
		TriCB.click();
		System.out.println(TriCB.isSelected());
		
		WebElement TS = driver.findElement(By.className("ui-toggleswitch-slider"));
		TS.click();
		System.out.println(TS.isSelected());
		
		WebElement VerifyD = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]"));
		System.out.println(VerifyD.isDisplayed());
		
		driver.findElement(By.xpath("//div[@role='combobox']")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		
		driver.close();
		
		
		
		
		
	}

}
