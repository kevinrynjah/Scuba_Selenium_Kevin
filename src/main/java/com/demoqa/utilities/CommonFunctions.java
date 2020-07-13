package com.demoqa.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {
	
	WebDriverWait wait;

	private WebDriver driver = null;
	
	public WebDriver getDriver() {
		return driver;
		}
	
	public void setDriver(WebDriver Set_driver) {
		this.driver = Set_driver;
	}
	
    public CommonFunctions(WebDriver driver)
    {
    	WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
    }
		
	public void OpenUrl(String URL,WebDriver driver) {
		this.driver.get(URL);
		this.driver.manage().window().maximize();
		setDriver(this.driver);
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	}
	
	public void SendKeys(By Locator, String text) {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(Locator).sendKeys(text);
	}
	public void KeyBoardEvent(By Locator, Keys tab) {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(Locator).sendKeys(tab);
	}
	
	
	public void Click(By Locator) {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(Locator).click();
	}
	
	public void ScrollByPixel(int x,int y)
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void ScrollByElement(WebElement Locator)
	{
		JavascriptExecutor js = (JavascriptExecutor) this.driver;  
		js.executeScript("arguments[0].scrollIntoView(true);",Locator);
	}
	
	 public void SwitchTo_LatestWindow(WebDriver Driver) {
		  
		  Set<String> windows = Driver.getWindowHandles();
		  String LatestWindow = null;
		   for (String window : windows) {
			  System.out.println(window);
			  LatestWindow = window;
		   }
		  Driver.switchTo().window(LatestWindow);
		  Driver.manage().window().maximize();  
		  }
	 
	 public void RightClicks(WebElement ele) throws Exception {
			Actions action = new Actions(this.driver);
			action.contextClick(ele).perform();
	 }
	 
	 public void DoubleClicks(WebElement ele) throws Exception {
			Actions action = new Actions(driver);
			action.doubleClick(ele).perform();
		}
	
	 public void mouseHover(WebElement ele) throws Exception {
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
		}
	 
	 public void mouseClick(WebElement ele) throws Exception {
			Actions action = new Actions(driver);
			action.moveToElement(ele).click().perform();
		}
	 
	 public void uploadFile(By ele,String path) throws Exception {
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(ele).sendKeys(path);
		}
	 
	 public void Slider(WebElement ele,int x,int y) throws Exception {
			Actions act = new Actions(driver);
			act.dragAndDropBy(ele, x, y).perform();
		}
	 
	public void ClearAndSendKeys(By Locator, String Text) {
			driver.findElement(Locator).click();
			driver.findElement(Locator).clear();
			driver.findElement(Locator).sendKeys(Text);
		}
	
		public void SelectByVisiblrText(WebElement ele, String value) {
			Select select = new Select(ele);
			select.selectByVisibleText(value);
		}
	
		public void SelectByIndex(WebElement ele, int value) {
			Select select = new Select(ele);
			select.selectByIndex(value);
		}
		
		public boolean isEnabled(By Locator) {
			return driver.findElement(Locator).isEnabled();
		}
		
		public boolean isDsiplayed(By Locator) {
			return driver.findElement(Locator).isDisplayed();
		}
		public void acceptAlert() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		public String GetTextAlert() {
			 return driver.switchTo().alert().getText();
		}
		
		public static void screenshot(WebDriver driver) throws IOException
		{
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			int count = 1;
			String path = System.getProperty("user.dir");
			System.out.println(path);
			File fill=new File(path+"\\img\\Screenshots");
			String[] str = fill.list();
			if(str.length!=0) {
				count = (str.length) + count;
			}
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File SrcFile =scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(path+"\\img\\Screenshots\\Image"+count+".png");
		    Files.copy(SrcFile,DestFile);
			count++;
		}

		
		
		public void quit() {
			driver.quit();
			}
		

		
}

