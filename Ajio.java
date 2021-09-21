package week3.day2.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(" https://www.ajio.com/");
		
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("        Total items: " + totalItems);
		
		
		List<WebElement> totalBrands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("LIST OF BRANDS: ");
		
		
		for (WebElement brand :totalBrands) {
			System.out.println(brand.getText());
		}
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='name']"));
		System.out.println("       BAG NAMES:");
		
		
		for (WebElement name1 :names) {
			System.out.println(name1.getText());
		}		
		
		driver.close();
		
		
	}

}

