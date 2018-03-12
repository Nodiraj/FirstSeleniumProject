package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/nodirajumaniyazova/Documents/selenium dependencies/drivers/chromedriver");

	WebDriver driver = new ChromeDriver();
	
	//test case 1:
	
//	driver.get("http://google.com");
//	
//	String expected="Google";
//	String actual = driver.getTitle();
//	System.out.println(actual);
//	if(expected.equals(actual)) {
//		System.out.println("Pass");
//	}else {
//		System.out.println("Fail");
//		System.out.println("Expected: "+ expected);
//		System.out.println("Actual: "+ actual);
//	}
//	//closes driver
//	driver.close();
	
	
//	//test case 2: Cybertek url Verification
//	driver.navigate().to("http:cybertekschool.com");
//	String expected = "cybertekschool";
//	//getCurrentUrl = get the url of the currently open page
//	String actual = driver.getCurrentUrl();
//     if (actual.contains(expected)) {
//    	 System.out.println("Pass");
//     }else {
//    	 System.out.println("Fail");
//     }
//	
//	driver.get("http://google.com");
//	driver.findElement(By.linkText("Gmail")).click();
//	String expected="Gmail";
//	String actual = driver.getTitle();
//	System.out.println(actual);
//	if(actual.contains(expected)) {
//		System.out.println("Pass");
//	}else {
//		System.out.println("Fail");
//		System.out.println("Expected: "+ expected);
//		System.out.println("Actual: "+ actual);
//}
	
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();

	String expected="Find a Flight";
	String actual = driver.getTitle();
	System.out.println(actual);
	if(actual.contains(expected)) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
		System.out.println("Expected title: "+ expected);
		System.out.println("Actual: "+ actual);
}
	driver.close();
}
}
