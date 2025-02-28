package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX The Marina')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Today')]")).click();
		driver.findElement(By.xpath("(//span[text()='DRAGON'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='03:35 PM']")).click();
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//span[contains(@id,'G:5')]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		String text1 = driver.findElement(By.xpath("//div[@class='ticket-value']")).getText();
		System.out.println(text1);
		String text2= driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println(text2);
		String text3 = driver.findElement(By.xpath("//h6[contains(text(),'Grand Total')]//following::span")).getText();
		System.out.println(text3);
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.close();
	}

}
