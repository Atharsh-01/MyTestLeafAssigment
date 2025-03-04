package day10HA;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesandAlerts {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Atharsh");
		alert.accept();
		
		String resulttext = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(resulttext);
		
		if(resulttext.contains("Atharsh")) {
			System.out.println("Action performed");
			
		}else
		{
			System.out.println("Action not performed");
		}
		
		
	
	}

}
