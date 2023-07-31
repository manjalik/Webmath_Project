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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trig_Calculus_3 {

	public static void main(String[] args) {
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
		  // System.out.println("Browser is:" +prop.getProperty("browser"));
		   
		   //save
		   prop.setProperty("browser", "chrome");
		  // System.out.println("Browser is:" +prop.getProperty("browser"));
		   
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
			
			//TS_09
			driver.findElement(By.linkText(prop.getProperty("trigandcalculsoption"))).click();
			driver.findElement(By.linkText(prop.getProperty("integration_opt"))).click();
			driver.findElement(By.xpath(prop.getProperty("integration_exp"))).sendKeys(prop.getProperty("integration_exp_value"));
			driver.findElement(By.xpath(prop.getProperty("integration_button"))).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//TS_010
			driver.findElement(By.linkText(prop.getProperty("trigandcalculsoption"))).click();
			driver.findElement(By.linkText(prop.getProperty("num_integral_opt"))).click();
			WebElement cldi = driver.findElement(By.xpath(prop.getProperty("num_integral_exp")));
			String s1 = Keys.chord(Keys.CONTROL, "a");
			cldi.sendKeys(s1);
			cldi.sendKeys(Keys.DELETE);
			cldi.sendKeys(prop.getProperty("num_integral_exp_value"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(prop.getProperty("num_integral_button"))).click();
			
			
			//TS_011
			driver.findElement(By.linkText(prop.getProperty("trigandcalculsoption"))).click();
			driver.findElement(By.linkText(prop.getProperty("help_math_prob"))).click();

	}

}
