package com.demoqa.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WidgetPageObject {
	
	
	public static WebElement WidgetTab(WebDriver driver)
	{		
		WebElement widget = driver.findElement(By.xpath("//div[text()='Widgets']"));
		return widget;
	}
	
	//=======Accordian=====
	public static WebElement Accordian(WebDriver driver)
	{		
		WebElement accordian = driver.findElement(By.xpath("//span[text()='Accordian']"));
		return accordian;
	}
	//======Auto Complete=====
	public static WebElement AutoComplete(WebDriver driver)
	{		
		WebElement auto = driver.findElement(By.xpath("//span[text()='Auto Complete']"));
		return auto;
	}
	public static WebElement MultiplecolorName(WebDriver driver)
	{		
		WebElement color = driver.findElement(By.id("autoCompleteMultipleInput"));
		return color;
	}
	public static WebElement SinglecolorName(WebDriver driver)
	{		
		WebElement color = driver.findElement(By.id("autoCompleteSingleInput"));
		return color;
	}
	
	//=========Date Picker===============
	public static WebElement Date_Picker(WebDriver driver)
	{		
		WebElement datepicker = driver.findElement(By.xpath("//span[text()='Date Picker']"));
		return datepicker;
	}
	public static WebElement selectdate(WebDriver driver)
	{		
		WebElement datepicker = driver.findElement(By.id("datePickerMonthYearInput"));
		return datepicker;
	}
	public static WebElement date(WebDriver driver, String s)
	{		
		WebElement datepicker = driver.findElement(By.xpath("//*[text()='"+s+"']"));
		return datepicker;
	}
	public static WebElement dateandTime(WebDriver driver)
	{		
		WebElement datepicker = driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']"));
		return datepicker;
	}
	public static WebElement Time(WebDriver driver,String s)
	{		
		WebElement datepicker = driver.findElement(By.xpath("//div[@class='react-datepicker__time']//ul//li[text()='"+s+"']"));
		return datepicker;
	}
	//==========Slider===============
	public static WebElement SliderTab(WebDriver driver)
	{		
		WebElement slider = driver.findElement(By.xpath("//span[text()='Slider']"));
		return slider;
	}
	public static WebElement Slider(WebDriver driver)
	{		
		WebElement slider = driver.findElement(By.xpath("//div[@class='col-9']/span/input[1]"));
		return slider;
	}
	public static WebElement SliderOutput(WebDriver driver)
	{		
		WebElement slider = driver.findElement(By.xpath("//input[@id='sliderValue']"));
		return slider;
	}
	
	
	//=============Progress Bar=======
	public static WebElement ProgressBar(WebDriver driver)
	{		
		WebElement progress = driver.findElement(By.xpath("//span[text()='Progress Bar']"));
		return progress;
	}
	public static WebElement StartButton(WebDriver driver)
	{		
		WebElement progress = driver.findElement(By.id("startStopButton"));
		return progress;
	}
	public static WebElement ResetButton(WebDriver driver)
	{		
		WebElement progress = driver.findElement(By.id("resetButton"));
		return progress;
	}
	//=======Tabs===========
	public static WebElement Tabs(WebDriver driver)
	{		
		WebElement tab = driver.findElement(By.xpath("//span[text()='Tabs']"));
		return tab;
	}
	public static WebElement TabsClicks(WebDriver driver,int i)
	{		
		WebElement tab = driver.findElement(By.xpath("//div[@id='tabsContainer']//nav//a["+i+"]"));
		return tab;
	}
	//========Tool Tips======
	public static WebElement ToolTipsTab(WebDriver driver)
	{		
		WebElement tab = driver.findElement(By.xpath("//*[text()='Tool Tips']"));
		return tab;
	}
	public static WebElement HoverButton(WebDriver driver)
	{		
		WebElement tab = driver.findElement(By.xpath("//button[text()='Hover me to see']"));
		return tab;
	}
	public static WebElement HoverInputField(WebDriver driver)
	{		
		WebElement tab = driver.findElement(By.id("toolTipTextField"));
		return tab;
	}
	//==============Menu=======
	public static WebElement MenuTab(WebDriver driver)
	{		
		WebElement menu = driver.findElement(By.xpath("//*[text()='Menu']"));
		return menu;
	}
	public static WebElement Menu2(WebDriver driver)
	{		
		WebElement menu = driver.findElement(By.xpath("//*[text()='Main Item 2']"));
		return menu;
	}
	public static WebElement SubMenuList(WebDriver driver)
	{		
		WebElement menu = driver.findElement(By.xpath("//*[contains(text(),'SUB SUB LIST')]"));
		return menu;
	}
	//======Sub Menu======
	
	public static WebElement Select_Menu(WebDriver driver)
	{		
		WebElement menu = driver.findElement(By.xpath("//*[text()='Select Menu']"));
		return menu;
	}
	public static WebElement Select_value(WebDriver driver)
	{		
		WebElement menu = driver.findElement(By.xpath("//div[text()='Select Option']"));
		return menu;
	}
	
	
	
	
	
	
	
}