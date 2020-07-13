package com.internetapp.tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.demoqa.PageObject.ElementsPage;
import com.internetapp.pages.CommonFunctions;



public class PracticeForm {
	
	public static WebDriver driver;	
	public static ElementsPage elements = new ElementsPage();
	
	public PracticeForm(CommonFunctions commonMethods)
	{
		this.commonMethods=commonMethods;
	}
	public static CommonFunctions commonMethods = new CommonFunctions(driver);
	 
	public static void main(String[] args) throws Exception {
		WebDriverWait wait = new WebDriverWait(commonMethods.getDriver(),100);
		commonMethods.OpenUrl("https://demoqa.com/text-box",driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elements.FormsTab()));
		//WebElement scroll = commonMethods.getDriver().findElement(elements.FormsTab());
		commonMethods.ScrollByElement(commonMethods.getDriver().findElement(elements.FormsTab()));
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.Click(elements.FormsTab());
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.Click(elements.PracticeFormButton());
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.SendKeys(elements.Firstname(), "Kevin");
		commonMethods.SendKeys(elements.Lastname(), "Rynjah");
		commonMethods.SendKeys(elements.EmailAddress(), "kevin@gmail.com");
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		commonMethods.Click(elements.Gender());
		Random rand = new Random(); 
	    String random_num = String.valueOf(rand.nextInt(1000000000)); 
	    System.out.println(random_num);
		commonMethods.SendKeys(elements.Phone(),(random_num+"5"));
		String date = "26";
		commonMethods.Click(elements.Date());
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement ele = commonMethods.getDriver().findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		commonMethods.SelectByVisiblrText(ele, "October");
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		commonMethods.Click(elements.selectdate(date));
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.ScrollByElement(commonMethods.getDriver().findElement(elements.Subject()));
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		commonMethods.SendKeys(elements.Subject(), "math");
		wait.until(ExpectedConditions.visibilityOfElementLocated(elements.Select_Subject("Maths")));
		commonMethods.Click(elements.Select_Subject("Maths"));	
		commonMethods.SendKeys(elements.Subject(), "sc");
		wait.until(ExpectedConditions.visibilityOfElementLocated(elements.Select_Subject("Maths")));
		commonMethods.Click(elements.Select_Subject("Computer Science"));
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		List<WebElement> list = commonMethods.getDriver().findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]"));
		int size=list.size();
		for(int i=1;i<=size;i++)
		{
			commonMethods.Click(elements.Hobbies(i));
		}
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Robot robot = new Robot();
		String path = System.getProperty("user.dir");
		String filepath = path+"\\img\\chooseFile.PNG";
		WebElement upload = commonMethods.getDriver().findElement(elements.UploadPicture());
		commonMethods.mouseClick(upload);	
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		commonMethods.uploadFile(elements.UploadPicture(),filepath);
		Thread.sleep(2000);
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.ClearAndSendKeys(elements.CurrentAddress(), "Hello World, This is a test automation...");		
		commonMethods.ScrollByPixel(0, 1000);;
		commonMethods.Click(elements.State());
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(elements.Select_State("NCR")));
		commonMethods.Click(elements.Select_State("NCR"));
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		int i=1;
		while(i>=1)
		{
		try {
		if(commonMethods.isEnabled(elements.City()))
		{
		commonMethods.Click(elements.City());
		wait.until(ExpectedConditions.visibilityOfElementLocated(elements.Select_State("Delhi")));
		commonMethods.Click(elements.Select_State("Delhi"));
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		break;
		}
		}		
		catch(Exception e) {			
			}
		}
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.Click(elements.Submit());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Thanks for submitting the form')]")));
		commonMethods.screenshot(commonMethods.getDriver());
		while(i>=1)
		{
		String str = commonMethods.getDriver().findElement(By.id("example-modal-sizes-title-lg")).getText();
		if(str.equalsIgnoreCase("Thanks for submitting the form"))
		{
			Assert.assertTrue("Form has been uploaded successfully.", str.equalsIgnoreCase("Thanks for submitting the form"));
			System.out.println("Form has been uploaded successfully.");
			commonMethods.ScrollByPixel(0, 1000);
			commonMethods.ScrollByElement(commonMethods.getDriver().findElement(elements.Close()));
			commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			commonMethods.screenshot(commonMethods.getDriver());
			commonMethods.Click(elements.Close());
			commonMethods.quit();
		}
		break;
		}
	
	}
}
