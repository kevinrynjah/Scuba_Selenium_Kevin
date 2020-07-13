package com.demoqa.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPageObject {
	
	
	public static WebElement textBox(WebDriver driver)
	{		
		WebElement textbox = driver.findElement(By.xpath("//div[@class='element-list collapse show']//span[text()='Text Box']"));
		return textbox;
	}
	
	public static WebElement username(WebDriver driver)
	{		
		WebElement username = driver.findElement(By.id("userName"));
		return username;
	}
	public static WebElement Email(WebDriver driver)
	{		
		WebElement email = driver.findElement(By.id("userEmail"));
		return email;
	}
	public static WebElement currAddress(WebDriver driver)
	{		
		WebElement curAdd = driver.findElement(By.id("currentAddress"));
		return curAdd;
	}
	public static WebElement perAddress(WebDriver driver)
	{		
		WebElement perAdd = driver.findElement(By.id("permanentAddress"));
		return perAdd;
	}
	public static WebElement Submit(WebDriver driver)
	{		
		WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		return submit;
	}
	
	//=============Checkbox==================
	
	public static WebElement CheckBox(WebDriver driver)
	{		
		WebElement checkbox = driver.findElement(By.xpath("//span[text()='Check Box']"));
		return checkbox;
	}
	public static WebElement Home(WebDriver driver)
	{		
		WebElement home = driver.findElement(By.xpath("//span[@class='rct-checkbox'][1]"));
		return home;
	}
	public static WebElement ExpandButton(WebDriver driver)
	{		
		WebElement expand = driver.findElement(By.xpath("//div[@class='rct-options']//button[1]"));
		return expand;
	}
	//==========Radio Button=================
	public static WebElement RadioButton(WebDriver driver)
	{		
		WebElement radio = driver.findElement(By.xpath("//span[text()='Radio Button']"));
		return radio;
	}
	public static WebElement YesOption(WebDriver driver)
	{		
		WebElement yes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		return yes;
	}
	//===========WebTables==============
	public static WebElement WebTables(WebDriver driver)
	{		
		WebElement tables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
		return tables;
	}
	public static WebElement addNewRecordButton(WebDriver driver)
	{		
		WebElement add = driver.findElement(By.id("addNewRecordButton"));
		return add;
	}
	public static WebElement Firstname(WebDriver driver)
	{		
		WebElement add = driver.findElement(By.id("firstName"));
		return add;
	}
	public static WebElement Lastname(WebDriver driver)
	{		
		WebElement add = driver.findElement(By.id("lastName"));
		return add;
	}
	public static WebElement EmailAddress(WebDriver driver)
	{		
		WebElement add = driver.findElement(By.id("userEmail"));
		return add;
	}	
	public static WebElement Age(WebDriver driver)
	{		
		WebElement add = driver.findElement(By.id("age"));
		return add;
	}
	
	public static WebElement Salary(WebDriver driver)
	{		
		WebElement add = driver.findElement(By.id("salary"));
		return add;
	}
	public static WebElement Department(WebDriver driver)
	{		
		WebElement add = driver.findElement(By.id("department"));
		return add;
	}
	//==============Buttons============
	public static WebElement Buttons(WebDriver driver)
	{		
		WebElement button = driver.findElement(By.xpath("//span[text()='Buttons']"));
		return button;
	}
	public static WebElement doubleClickBtn(WebDriver driver)
	{		
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		return doubleclick;
	}
	public static WebElement rightClickBtn(WebDriver driver)
	{		
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		return rightclick;
	}
	public static WebElement singleClickBtn(WebDriver driver)
	{		
		WebElement singleClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		return singleClick;
	}
	//============Links========
	
	public static WebElement LinksTab(WebDriver driver)
	{		
		WebElement links = driver.findElement(By.xpath("//span[text()='Links']"));
		return links;
	}
	

}
