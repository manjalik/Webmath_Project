package com.WebmathProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trig_Calculus {
	
   public static void main(String[] args)  {
	   
	   Properties prop = new Properties();
	   FileInputStream fis = null;
	try {
		fis = new FileInputStream(Trig_Calculus.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"locators.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   try {
		   prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   //read file
	   //System.out.println("Browser is:" +prop.getProperty("browser"));
	   
	   //save
	   prop.setProperty("browser", "chrome");
	   //System.out.println("Browser is:" +prop.getProperty("browser"));
	   
	   //write
	   FileOutputStream fos = null;
	try {
		fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\com.WebmathProject\\src\\test\\resources\\locators.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   try {
		prop.store(fos, null);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   //System.out.println("Browser is:" +prop.getProperty("browser"));
	   
	    WebDriver driver;
		driver = WebDriverManager.chromedriver().create(); 
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		//TS01,TS_02,TS_03
		driver.findElement(By.linkText(prop.getProperty("trigandcalculsoption"))).click();
		WebElement drpoption = driver.findElement(By.id(prop.getProperty("dropdownmenu")));
		Select drpopt = new Select(drpoption);
		drpopt.selectByVisibleText("Calculus, Derivatives");
		//entering the expression
		WebElement cl = driver.findElement(By.xpath(prop.getProperty("cal_expression")));
		String s = Keys.chord(Keys.CONTROL, "a");
		cl.sendKeys(s);
		cl.sendKeys(Keys.DELETE);
		cl.sendKeys(prop.getProperty("cal_expression_value"));
		driver.findElement(By.xpath(prop.getProperty("cal_button"))).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   
	    //TS_04
		driver.findElement(By.linkText(prop.getProperty("trigandcalculsoption"))).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(prop.getProperty("go_button"))).click();
	   
	   
		
		
	   

}
}
