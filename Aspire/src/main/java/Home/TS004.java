package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TS004 extends TS003{
	public void Check() {
		WebDriver driver=Commons.getChromeDriver();
driver.findElement(By.xpath("//button[@title='Products']")).click();
driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Roll");
driver.findElement(By.xpath("//i[@title='Search...']")).click();
 System.out.println("Logout User");
 driver.findElement(By.xpath("//img[@alt='User']")).click();
 driver.findElement(By.xpath("//a[@class='dropdown-item focus']")).click();
 System.out.println("User Successfully Logout");

	}
	
}
