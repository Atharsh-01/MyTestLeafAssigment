package day7HA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//label[text()='Safari'])[1]")).click();
		
		WebElement favBrowser = driver.findElement(By.xpath("(//label[text()='Safari'])[1]"));
		favBrowser.click();
		System.out.println(favBrowser.isSelected());
		
		if(favBrowser.isSelected()==true)	{
			System.out.println("Selected");
		}
		else {
			System.out.println("Unselected");
		}
		
		String text = driver.findElement(By.xpath("ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active")).getText();
		System.out.println(text);
		
		
		
		WebElement age = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		if(age.isSelected()==false) {
			age.click();
		}
		
	}

}
