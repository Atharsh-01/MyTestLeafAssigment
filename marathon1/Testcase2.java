package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("Bag for boys");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String result = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		System.out.println(result);
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("//li[@id='p_123/418063']/span[1]/a[1]/span[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		String name = driver.findElement(By.xpath("(//span[text()='Safari'])[1]")).getText();
		System.out.println(name);
		
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println(price);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}
	
	

}
