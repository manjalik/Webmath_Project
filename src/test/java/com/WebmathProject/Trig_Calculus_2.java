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

public class Trig_Calculus_2 {

	public static void main(String[] args){
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
			
			//TS_05
			driver.findElement(By.linkText(prop.getProperty("trigandcalculsoption"))).click();
			driver.findElement(By.xpath(prop.getProperty("trig_expression_opt"))).click();
			driver.findElement(By.xpath(prop.getProperty("trig_exp"))).sendKeys(prop.getProperty("trig_exp_value"));
			driver.findElement(By.xpath(prop.getProperty("trig_button"))).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//TS_06
			driver.findElement(By.linkText(prop.getProperty("trigandcalculsoption"))).click();
			driver.findElement(By.xpath(prop.getProperty("rtriangle_opt"))).click();
			driver.findElement(By.xpath(prop.getProperty("rtriangle_a"))).sendKeys(prop.getProperty("rtriangle_a_value"));
			driver.findElement(By.xpath(prop.getProperty("rtriangle_b"))).sendKeys(prop.getProperty("rtriangle_b_value"));
			driver.findElement(By.xpath(prop.getProperty("rtriangle_c"))).sendKeys(prop.getProperty("rtriangle_c_value"));
			driver.findElement(By.xpath(prop.getProperty("rtriangle_e"))).sendKeys(prop.getProperty("rtriangle_e_value"));
			driver.findElement(By.xpath(prop.getProperty("rtriangle_d"))).sendKeys(prop.getProperty("rtriangle_d_value"));
			driver.findElement(By.xpath(prop.getProperty("rtriangle_button"))).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.linkText(prop.getProperty("trigandcalculsoption"))).click();
			driver.findElement(By.xpath(prop.getProperty("rtriangle_opt"))).click();
			driver.findElement(By.xpath(prop.getProperty("rtriangle_a"))).sendKeys(prop.getProperty("rtriangle_a_value"));
			driver.findElement(By.xpath(prop.getProperty("rtriangle_b"))).sendKeys(prop.getProperty("rtriangle_b_value"));
			driver.findElement(By.xpath(prop.getProperty("rtriangle_c"))).sendKeys(prop.getProperty("rtriangle_c_value"));
			driver.findElement(By.xpath(prop.getProperty("rtriangle_e"))).sendKeys(prop.getProperty("rtriangle_e_value"));
			driver.findElement(By.xpath(prop.getProperty("rtriangle_d"))).sendKeys(prop.getProperty("rtriangle_d_value"));
			driver.findElement(By.xpath(prop.getProperty("rtriangle_clear_button"))).click();
			
			//TS_07
			driver.findElement(By.linkText(prop.getProperty("trigandcalculsoption"))).click();
			driver.findElement(By.xpath(prop.getProperty("derivative_opt"))).click();
			WebElement cld = driver.findElement(By.xpath(prop.getProperty("derivative_exp")));
			String s = Keys.chord(Keys.CONTROL, "a");
			cld.sendKeys(s);
			cld.sendKeys(Keys.DELETE);
			cld.sendKeys(prop.getProperty("derivative_exp_value"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(prop.getProperty("derivative_button"))).click();
			
			driver.navigate().to("https://www.webmath.com/diff.html");
			driver.findElement(By.linkText(prop.getProperty("derivative_bigf_opt"))).click();
			driver.findElement(By.xpath(prop.getProperty("derivative_bigf_topexp"))).sendKeys(prop.getProperty("derivative_bigf_topexp_value")); 
			driver.findElement(By.xpath(prop.getProperty("derivative_bigf_bottomexp"))).sendKeys(prop.getProperty("derivative_bigf_bottomexp_value"));
			driver.findElement(By.xpath(prop.getProperty("derivative_bigf_button"))).click();
			
			//TS_08
			driver.findElement(By.linkText(prop.getProperty("trigandcalculsoption"))).click();
			driver.findElement(By.linkText(prop.getProperty("quotient_opt"))).click();
			WebElement clit = driver.findElement(By.xpath(prop.getProperty("quotient_top_exp")));
			String s1 = Keys.chord(Keys.CONTROL, "a");
			clit.sendKeys(s1);
			clit.sendKeys(Keys.DELETE);
			clit.sendKeys(prop.getProperty("quotient_top_exp_value"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement clib = driver.findElement(By.xpath(prop.getProperty("quotient_bottom_exp")));
			String s2 = Keys.chord(Keys.CONTROL, "a");
			clib.sendKeys(s2);
			clib.sendKeys(Keys.DELETE);
			clib.sendKeys(prop.getProperty("quotient_bottom_exp_value"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.xpath(prop.getProperty("quotient_button"))).click();
			
			

	}

}
