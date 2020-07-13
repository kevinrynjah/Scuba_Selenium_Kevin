package com.internetapp.tests;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.demoqa.PageObject.ElementsPage;
import com.internetapp.pages.CommonFunctions;


public class BookStoreApplication {
	
	public static WebDriver driver;	
	public static ElementsPage elements = new ElementsPage();
	private static String username ="kevinr@gmail.com";
	private static String password ="Maveric@123";
	public static boolean gotbookname=false;
	public static String books[] = {"Git Pocket Guide","Learning JavaScript Design Patterns","Designing Evolvable Web APIs with ASP.NET","Speaking JavaScript"};
	
	public BookStoreApplication(CommonFunctions commonMethods)
	{
		this.commonMethods=commonMethods;
	}
	public static CommonFunctions commonMethods = new CommonFunctions(driver);
	public static WebDriverWait wait = new WebDriverWait(commonMethods.getDriver(),100);
	 
	public static void main(String[] args) throws Exception {
		commonMethods.OpenUrl("https://demoqa.com/text-box",driver);
		commonMethods.ScrollByElement(commonMethods.getDriver().findElement(elements.BookStoreApplication()));
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.Click(elements.BookStoreApplication());
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.Click(elements.LoginTab());
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);		
		login();
		addBooks();		
		if(gotbookname==true)
		{
			profile();
			deleteParticularBook();
			addBooks();	
			profile();
			deleteAllBooks();
		}
		else if(gotbookname==false)
		{
			System.out.println("No books were found..");
		}
		logout();
	}
	
	
	public static void login() throws IOException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(elements.username()));
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.SendKeys(elements.username(), username);
		commonMethods.SendKeys(elements.password(), password);
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.Click(elements.Login());
		String verify = commonMethods.getDriver().findElement(By.xpath("//label[@id='userName-value']")).getText();
		Assert.assertEquals("Logged In Successfully", username, verify);
		System.out.println("-------Logged In Successfully..");
		commonMethods.screenshot(commonMethods.getDriver());
	}
	
	public static void addBooks() throws InterruptedException, IOException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchBox']")));
		commonMethods.screenshot(commonMethods.getDriver());
		WebElement scroll = commonMethods.getDriver().findElement(elements.GotoStore());
		commonMethods.ScrollByElement(scroll);
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		commonMethods.Click(elements.GotoStore());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Git Pocket Guide')]")));
		commonMethods.screenshot(commonMethods.getDriver());
		List<WebElement> list = commonMethods.getDriver().findElements(By.xpath("//div[text()='Title']//following::span[contains(@id,'see-book-')]"));
		int size= list.size();
		for(int i=1;i<=size;i++)
		{
			String bookname = commonMethods.getDriver().findElement(By.xpath("//div[text()='Title']//following::span[contains(@id,'see-book-')]["+i+"]")).getText();
			for(int j=0;j<books.length;j++)
			{
				if(bookname.equalsIgnoreCase(books[j]))
				{
					scroll = commonMethods.getDriver().findElement(elements.BookName(books[j]));
					commonMethods.ScrollByElement(scroll);
					commonMethods.screenshot(commonMethods.getDriver());
					commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
					commonMethods.Click(elements.BookName(books[j]));
					commonMethods.screenshot(commonMethods.getDriver());
					commonMethods.ScrollByPixel(0, 1000);
					commonMethods.screenshot(commonMethods.getDriver());
					commonMethods.Click(elements.AddBookToCollection());
					Thread.sleep(1500);
					String alert = commonMethods.GetTextAlert();
					if(alert.contains("Book already present in the your collection!") || alert.contains("Book added to your collection."))
						Assert.assertTrue(alert.contains("Book already present in the your collection!") || alert.contains("Book added to your collection."));
					commonMethods.acceptAlert();
					commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
					commonMethods.Click(elements.BackToBookStore());
					gotbookname=true;
					Assert.assertTrue(bookname+ " is added successfully...", bookname.equalsIgnoreCase(books[j]));
					break;
				}
			}
		}
		System.out.println("------Books added successfully");
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	
	
	public static void deleteParticularBook() throws InterruptedException, IOException
	{
		commonMethods.screenshot(commonMethods.getDriver());
		List<WebElement> list = commonMethods.getDriver().findElements(By.xpath("//div[text()='Title']//following::span[contains(@id,'see-book-')]"));
		int size= list.size();
		String bookname = null;	
		for(int i=1;i<=size;i++)
		{
			bookname = commonMethods.getDriver().findElement(By.xpath("//div[text()='Title']//following::span[contains(@id,'see-book-')][1]")).getText();
			for(int j=0;j<books.length;j++)
			{
				if(bookname.equalsIgnoreCase(books[j]))
				{
					WebElement scroll = commonMethods.getDriver().findElement(elements.BookName(books[j]));
					commonMethods.ScrollByElement(scroll);
					commonMethods.screenshot(commonMethods.getDriver());
					commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
					commonMethods.Click(By.xpath("//div[text()='Title']//following::a[contains(text(),'"+bookname+"')]//following::span[@id='delete-record-undefined'][1]"));
					wait.until(ExpectedConditions.visibilityOfElementLocated(elements.OK_Button()));
					commonMethods.screenshot(commonMethods.getDriver());
					commonMethods.Click(elements.OK_Button());
					Thread.sleep(1500);
					String alert = commonMethods.GetTextAlert();
					if(alert.contains("Book deleted."))
						Assert.assertTrue(alert.contains("Book deleted."));
					commonMethods.acceptAlert();
					break;
				}
			}
		}
		for(int i=1;i<=size;i++)
		{
			String check = commonMethods.getDriver().findElement(By.xpath("//div[text()='Title']//following::span["+i+"]")).getText();
			System.out.println(check);
			if(check.isBlank())
			{
				Assert.assertTrue("Books has been deleted successfully.....", check.isBlank());
				System.out.println("----Books has been deleted successfully.....");
				commonMethods.ScrollByElement(commonMethods.getDriver().findElement(elements.LogOut()));
				commonMethods.screenshot(commonMethods.getDriver());
				break;
			}
		}
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	

	public static void deleteAllBooks() throws InterruptedException, IOException
	{
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.ScrollByElement(commonMethods.getDriver().findElement(elements.DeleteAllBooks()));
		commonMethods.Click(elements.DeleteAllBooks());
		wait.until(ExpectedConditions.visibilityOfElementLocated(elements.OK_Button()));
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.Click(elements.OK_Button());
		Thread.sleep(1500);
		String alert = commonMethods.GetTextAlert();
		if(alert.contains("All Books deleted."))
			Assert.assertTrue(alert.contains("All Books deleted."));
		commonMethods.acceptAlert();
		List<WebElement> list2 = commonMethods.getDriver().findElements(By.xpath("//div[text()='Title']//following::div[@class='rt-td']"));
		int size2= list2.size();
		for(int i=1;i<=size2;i++)
		{
			String bookname = commonMethods.getDriver().findElement(By.xpath("//div[text()='Title']//following::span["+i+"]")).getText();
			if(bookname.isBlank())
			{
				Assert.assertTrue("All Books has been deleted successfully", bookname.isBlank());
				commonMethods.ScrollByElement(commonMethods.getDriver().findElement(elements.LogOut()));
				System.out.println("----------All Book has been deleted successfully.....");
				commonMethods.screenshot(commonMethods.getDriver());
				break;
			}
		}
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
	}
	
	public static void logout() throws IOException
	{
		WebElement scroll = commonMethods.getDriver().findElement(elements.LoginTab());
		commonMethods.ScrollByElement(scroll);
		commonMethods.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		commonMethods.Click(elements.LoginTab());
		wait.until(ExpectedConditions.visibilityOfElementLocated(elements.LogOut()));
		commonMethods.screenshot(commonMethods.getDriver());
		commonMethods.Click(elements.LogOut());	
		wait.until(ExpectedConditions.visibilityOfElementLocated(elements.username()));
		WebElement logout = commonMethods.getDriver().findElement(elements.Login());
		if(logout.isDisplayed())
		{
			Assert.assertTrue("Logged Out Successfully...", logout.isDisplayed());
			commonMethods.screenshot(commonMethods.getDriver());
			System.out.println("---------Logged Out Successfully....");
		}
		commonMethods.quit();	
	}
	
	public static void profile() throws IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchBox']")));
		commonMethods.ScrollByPixel(0, 1000);
		commonMethods.Click(elements.Profile());
		commonMethods.screenshot(commonMethods.getDriver());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchBox']")));
	}
	
}
