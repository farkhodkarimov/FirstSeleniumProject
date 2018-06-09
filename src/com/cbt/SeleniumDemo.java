package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"../../Documents/selenium dependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cybertekschool.com");
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://farkhodkarimov.github.io/project/");
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("http://fkarimov.com/htmlproject/");
		
	}

}
