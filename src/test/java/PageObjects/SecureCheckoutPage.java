package PageObjects;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SecureCheckoutPage extends BasePage{

	public SecureCheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	By ClickLogin= By.xpath("//div[text()='LOG IN']");
	
	By phoneNumber= By.xpath("//input[@id='mobile']");
	
	By otp= By.id("otp");
	
	By verifyOTPBtn= By.xpath("//a[text()='VERIFY OTP']");
	
	By proceedToPay= By.xpath("//button[text()='Proceed to Pay']");
	
	
	public void fillCheckoutInfo() throws InterruptedException
	{
		driver.findElement(ClickLogin).click();
		driver.findElement(phoneNumber).sendKeys("9075664699"+Keys.ENTER);
		Thread.sleep(40000);
		driver.findElement(verifyOTPBtn).click();
		
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(40000);
		driver.findElement(By.id("building")).sendKeys("shamBuilding");
		driver.findElement(By.id("landmark")).sendKeys("sh101");
		driver.findElement(By.xpath("//a[text()='SAVE ADDRESS & PROCEED']")).click();
		Thread.sleep(40000);
		driver.findElement(proceedToPay).click();
	}

}
