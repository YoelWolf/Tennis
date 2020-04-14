package searchTennis;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class BusquedaTennis {

	@Test
	public void Tennis () {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.navigate().to("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Tennis");
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span")).getText().contains("0 results have been found."));
		
		
		driver.close();
		driver.quit();
	}
}
