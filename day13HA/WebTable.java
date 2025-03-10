package day13HA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://finance.yahoo.com/?guccounter=1");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='More']")))
		.moveToElement(driver.findElement(By.xpath("(//a[text()='Crypto '])[3]"))).click().perform();
		
		List<WebElement> cryptoNameList = driver.findElements(By.xpath("//table[@data-testid='table-container']/tbody/tr/td[2]"));
		int sizeOfList = cryptoNameList.size();
		
		for (int i = 1; i <= sizeOfList; i++) {
			
			WebElement crypto = driver.findElement(By.xpath("//table[@data-testid='table-container']/tbody/tr["+i+"]/td[2]"));
			System.out.println(crypto.getText());
		}
	}

}
