package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Catch {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\karthiabi\\Sample\\driver\\chromedriver.exe");
	ChromeOptions c=new ChromeOptions();
	ChromeOptions cbh = c.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(cbh);
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	WebElement ret = driver.findElement(By.xpath("//frame[@src='RSLogin.html?v=12']"));
	driver.switchTo().frame(ret);
	driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("54164142");
	}
}
