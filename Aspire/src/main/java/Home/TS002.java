package Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
public class TS002 extends TS001 {
	@Test
	public void Inven() throws InterruptedException {
		 WebDriver driver=Commons.getChromeDriver();

System.out.println("Welcome to Product :" );

WebElement n=driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/button[1]/span[1]"));
// object of Actions with method moveToElement
Actions a = new Actions(driver);
a.moveToElement(n).perform();
//identify sub-menu element
WebElement m=driver.
findElement(By.xpath("//a[@class='dropdown-item focus']"));
//move to element and click
a.moveToElement(m).click().perform();
System.out.println("Page navigated to: " +driver.getTitle());
driver.findElement(By.xpath("//button[@title='Create record']")).click();
driver.findElement(By.xpath("//input[@id='o_field_input_12']")).click();
driver.findElements(By.xpath("//select[@id='o_field_input_16']"));
driver.findElement(By.xpath("//select[@id='o_field_input_16']")).click();
driver.findElement(By.xpath("//input[@id='o_field_input_18']")).click();
driver.findElement(By.xpath("//input[@id='o_field_input_22']")).click();
driver.findElement(By.xpath("//input[@id='o_field_input_23']")).click();
driver.findElement(By.xpath("//input[@id='o_field_input_24']")).click();
driver.findElement(By.xpath("//button[@title='Save record']")).click();
System.out.println("Save Product Details Successfully");

driver.findElement(By.xpath("//span[normalize-space()='Print Labels']")).click();
System.out.println("Print the label of Product");

//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/button[1]/span[1]]")).click();

//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/div[1]/a[1]")).click();


}
}
