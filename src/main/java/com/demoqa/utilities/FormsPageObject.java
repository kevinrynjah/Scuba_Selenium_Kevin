package com.demoqa.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormsPageObject {

	public static WebElement FormsTab(WebDriver driver)
	{		
		WebElement forms = driver.findElement(By.xpath("//div[text()='Forms']"));
		return forms;
	}
	public static WebElement PracticeFormButton(WebDriver driver)
	{		
		WebElement forms = driver.findElement(By.xpath("//span[text()='Practice Form']"));
		return forms;
	}
	public static WebElement Firstname(WebDriver driver)
	{		
		WebElement fname = driver.findElement(By.id("firstName"));
		return fname;
	}
	public static WebElement Lastname(WebDriver driver)
	{		
		WebElement lname = driver.findElement(By.id("lastName"));
		return lname;
	}
	public static WebElement EmailAddress(WebDriver driver)
	{		
		WebElement mail = driver.findElement(By.id("userEmail"));
		return mail;
	}	
	public static WebElement Gender(WebDriver driver)
	{		
		WebElement male = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		return male;
	}
	public static WebElement Phone(WebDriver driver)
	{		
		WebElement phone = driver.findElement(By.id("userNumber"));
		return phone;
	}
	public static WebElement Date(WebDriver driver)
	{		
		WebElement date = driver.findElement(By.id("dateOfBirthInput"));
		return date;
	}
	public static WebElement selectdate(WebDriver driver, String s)
	{		
		WebElement datepicker = driver.findElement(By.xpath("//*[text()='"+s+"']"));
		return datepicker;
	}
	
	public static WebElement Subject(WebDriver driver)
	{		
		WebElement subject = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
		return subject;
	}
	public static WebElement Hobbies(WebDriver driver,int i)
	{		
		WebElement subject = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-"+i+"']"));
		return subject;
	}
	public static WebElement UploadPicture(WebDriver driver)
	{		
		WebElement pic = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		return pic;
	}
	public static WebElement CurrentAddress(WebDriver driver)
	{		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		return address;
	}
	public static WebElement State(WebDriver driver)
	{		
		WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));
		return state;
	}
	public static WebElement City(WebDriver driver)
	{		
		WebElement city = driver.findElement(By.xpath("//div[text()='Select City']"));
		return city;
	}
	public static WebElement Submit(WebDriver driver)
	{		
		WebElement address = driver.findElement(By.id("submit"));
		return address;
	}
	
}
