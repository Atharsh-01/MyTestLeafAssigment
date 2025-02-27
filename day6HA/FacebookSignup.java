package day6HA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Atharsh");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("SN");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("atharshsn003@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("abcd@1255");
		
		WebElement dayDropdowm = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select day=new Select(dayDropdowm);
		day.selectByValue("1");
		
		WebElement monthDropdowm = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		Select month=new Select(monthDropdowm);
		month.selectByValue("12");
		
		WebElement yearDropdowm = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select year=new Select(yearDropdowm);
		year.selectByValue("2000");
		
		driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).click();
		
		
		
		
	}

}
