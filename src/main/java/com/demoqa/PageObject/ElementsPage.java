package com.demoqa.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ElementsPage {

	public static By textbox() {
		return By.xpath("//div[@class'element-list collapse show']//span[text()'Text Box']");
	}	
	public static By perAddress()
	{		
		return By.id("permanentAddress");
	}
	public static By Submit()
	{		
		return By.id("submit");
	}
	//Checkbox
	public static By CheckBox()
	{		
		return By.xpath("//span[text()='Check Box']");
	}
	public static By Home()
	{		
		return By.xpath("//span[@class='rct-checkbox'][1]");
	}
	public static By ExpandButton()
	{		
		return By.xpath("//div[@class='rct-options']//button[1]");
	}
	//Radio Button
	public static By RadioButton()
	{		
		return By.xpath("//span[text()='Radio Button']");
	}
	public static By YesOption()
	{		
		return By.xpath("//label[@for='yesRadio']");
	}
	//WebTables
	public static By WebTables()
	{		
		return By.xpath("//span[text()='Web Tables']");
	}
	public static By addNewRecordButton()
	{		
		return By.id("addNewRecordButton");
	}
	public static By Firstname()
	{		
		return By.xpath("//input[contains(@id,'first')]");
	}
	public static By Lastname()
	{		
		return By.xpath("//input[contains(@id,'last')]");
	}
	public static By EmailAddress()
	{		
		return By.id("userEmail");
	}	
	public static By Age()
	{		
		return By.id("age");
	}
	
	public static By Salary()
	{		
		return By.id("salary");
	}
	public static By Department()
	{		
		return By.id("department");
	}
	//Buttons
	public static By Buttons()
	{		
		return   By.xpath("//span[text()='Buttons']");
	}
	public static By doubleClickBtn()
	{		
		return By.id("doubleClickBtn");
	}
	public static By rightClickBtn()
	{		
		return By.id("rightClickBtn");
	}
	public static By singleClickBtn()
	{		
		return By.xpath("//button[text()='Click Me']");
	}
	//Links
	
	public static By LinksTab()
	{		
		return By.xpath("//span[text()='Links']");
	}
	
	//=================Pracice Form
	public static By FormsTab()
	{		
		return By.xpath("//div[text()='Forms']");
	}
	public static By PracticeFormButton()
	{		
		return By.xpath("//span[text()='Practice Form']");
	}
	
	public static By Gender()
	{		
		return By.xpath("//label[@for='gender-radio-1']");
	}
	public static By Phone()
	{		
		return By.id("userNumber");
	}
	public static By Date()
	{		
		return By.id("dateOfBirthInput");
	}
	public static By selectdate(String s)
	{		
		return By.xpath("//*[text()='"+s+"']");
	}
	
	public static By Subject()
	{		
		return By.xpath("//input[@id='subjectsInput']");
	}
	public static By Select_Subject(String str)
	{		
		return By.xpath("//div[text()='"+str+"']");
	}
	public static By Hobbies(int i)
	{		
		return By.xpath("//label[@for='hobbies-checkbox-"+i+"']");
	}
	public static By UploadPicture()
	{		
		return By.xpath("//label[text()='Select picture']//following::input[1]");
		
	}
	public static By CurrentAddress()
	{		
		return By.xpath("//textarea[@id='currentAddress']");
	}
	public static By State()
	{		
		return By.xpath("//div[text()='Select State']");
	}
	
	public static By Select_State(String str)
	{		
		return By.xpath("//div[text()='"+str+"']");
	}
	public static By City()
	{		
		return By.xpath("//div[text()='Select City']");
	}
	public static By Select_City(String str)
	{		
		return By.xpath("//div[text()='"+str+"']");
	}
	public static By Close()
	{		
		return By.xpath("//button[text()='Close']");
	}
	
//=============================BookStoreAppllication===========

	public static By BookStoreApplication()
	{		
		return By.xpath("//div[text()='Book Store Application']");
	}
	public static By LoginTab()
	{		
		return By.xpath("//span[text()='Login']");
	}
	public static By username() {
		return By.xpath("//input[@id='userName']");
	}
	public static By password() {
		return By.xpath("//input[@id='password']");
	}
	public static By New_User()
	{		
		return By.xpath("//button[@id='newUser']");
	}
	public static By Captcha()
	{		
		return By.xpath("//div[@class='recaptcha-checkbox-border']");
	}
	public static By Register()
	{		
		return By.id("register");
	}
	public static By GotoLogin()
	{		
		return By.id("gotologin");
	}
	
	public static By Login()
	{		
		return By.xpath("//button[text()='Login']");
	}
	public static By GotoStore()
	{		
		return By.xpath("//button[@id='gotoStore']");
	}
	
	public static By BookName(String str)
	{		
		return By.xpath("//a[contains(text(),'"+str+"')]");
	}
	public static By AddBookToCollection()
	{		
		return By.xpath("//button[contains(text(),'Add To Your Collection')]");
	}
	public static By BackToBookStore()
	{		
		return By.xpath("//button[text()='Back To Book Store']");
	}
	public static By Profile()
	{		
		return By.xpath("//span[text()='Profile']");
	}
	public static By DeleteAllBooks()
	{		
		return By.xpath("//button[text()='Delete All Books']");
	}
	public static By OK_Button()
	{		
		return By.xpath("//button[text()='OK']");
	}
	
	public static By LogOut()
	{		
		return By.xpath("//button[text()='Log out']");
	}
	
	
	
}


