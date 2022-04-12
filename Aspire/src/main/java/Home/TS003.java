package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TS003 extends TS002 {
	
	public void Mainmenu() {
		WebDriver driver=Commons.getChromeDriver();
System.out.println("Click on Left Cornor of Application button");
driver.findElement(By.xpath("//a[@class='dropdown-item o_menu_brand']")).click();
System.out.println("Back to Home Page");
driver.findElement(By.xpath("//a[@id='result_app_2']//div[@class='o_app_icon']")).click();

System.out.println("Manufacturing");
driver.findElement(By.xpath("//a[@id='result_app_2']//div[@class='o_app_icon']")).click();
driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
System.out.println("Create Manufacuring tab");
driver.findElement(By.xpath("//input[@id='o_field_input_588']")).click();
driver.findElement(By.xpath("//input[@id='o_field_input_588']")).click();
driver.findElement( By.xpath("//input[@id='o_field_input_590']")).click();
System.out.println("Click on Manufacturing tab to save");
driver.findElement(By.xpath("//button[@title='Save record']")).click();
System.out.println("Prodcut Conform then click on CONFORM button");
driver.findElement(By.xpath("//span[normalize-space()='Confirm']")).click();


//Mark AS DONE 
driver.findElement(By.xpath("//button[@class='btn btn-primary']//span[contains(text(),'Mark as Done')]")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']//span[contains(text(),'Mark as Done')]")).click();
driver.findElement(By.xpath("//span[normalize-space()='Apply']")).click();


	}

}
