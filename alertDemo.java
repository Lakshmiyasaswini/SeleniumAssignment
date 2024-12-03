package SeleniumAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class alertDemo {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
	}
	@Test
	public void AlertButton() {
		//To click on the Alert Button
		driver.findElement(By.id("alertButton")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	@Test
	public void TimerAlertButton() throws InterruptedException{
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
	}
	@Test
	public void ConfirmBox() {
		driver.findElement(By.id("confirmButton")).click();
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		
	}
	@Test
	public void PromptBox() {
		driver.findElement(By.id("promtButton")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Masai");
	}

}
