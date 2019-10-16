package org.hcl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\karthiabi\\Sample\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
}}
