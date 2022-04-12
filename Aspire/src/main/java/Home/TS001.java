package Home;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS001{
	 @Test
	public void Loginpage() throws InterruptedException {
		 WebDriver driver=Commons.getChromeDriver();
	driver.get("https://aspireapp.odoo.com/web/login");
	String title=driver.getTitle();
	System.out.println("Name Of Website : " + title);
	Thread.sleep(1000);
	driver.findElement(By.name("login")).sendKeys("user@aspireapp.com");
	System.out.println("Entered User Name" +driver);
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("@sp1r3app");	
	System.out.println("Entered User Name" +driver);
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/form/div[3]/button")).click();
	System.out.println("Successfully Login!!!!!" +driver);
	Thread.sleep(1000);
	   
String title_inventory =driver.getTitle();
System.out.println("Open Inventory Tab : " +title_inventory);
driver.findElement(By.xpath("//a[@id='result_app_1']")).click();


}



		
	}
