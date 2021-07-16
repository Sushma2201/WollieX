package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WolliesX {

	
	WebDriver driver;
	
	@Given("^User Launch Chrome browser")
	public void user_Launch_Chromebrowser() throws Throwable {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	

	
	@When("^User opens URL")
	public void user_opens_URL() throws Throwable{
		
		WebDriverWait wait = new WebDriverWait(driver, 18);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		if  
		(driver.getPageSource().contains("Resource Limit Is Reached, "))
			{
			
			System.out.print("Page Load Error, ");
			driver.quit();
		}
		
		WebElement ProdWmLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@title=\"Women\"]")));
		
		
		
		if  (ProdWmLink.isDisplayed()){
			System.out.print("Page Loaded, ");
			
		}else
		{
			
			System.out.print("Page dint load Browser closed, ");
			driver.quit();
		}
		
		
		
	}
	
	
	@And ("^User Click on PrdWomen")
	
	public void user_Click_on_PrdWomen() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement PrdWomen = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@title=\"Women\"]")));
		PrdWomen.click();
		Thread.sleep(1800);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement listview = driver.findElement(By.xpath("//a[@title=\"List\"]"));
	
		if  (listview.isDisplayed()){
			System.out.print("Products are displayed, ");
			
		}else
		{
			driver.quit();
			System.out.print("Page dint load Browser closed, ");
		}
		listview.click();
		Thread.sleep(1200);
	}
	
	
	@Then ("^User Adds firstProduct to cart")
	public void user_Adds_firstProduct_to_cart() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		
		WebElement Prod1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title=\"Add to cart\"][@data-id-product=\"1\"]")));
		
		Prod1.click();
		System.out.print("Clicked on Product 1 and added to cart, ");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		WebElement liteview = driver.findElement(By.xpath("//span[@title=\"Continue shopping\"]"));
		if(liteview.isDisplayed()) {
			System.out.print("Product 1 added to cart, ");
		}
		
		else {
			System.out.print("Product 1 was not added to cart, ");
			//driver.quit();
		}
		
		
	}
	
	
	@And ("^Click on Continue Shopping")
	public void click_on_Continue_Shopping() throws Throwable {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		
		WebElement CntShpng = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@title=\"Continue shopping\"]")));		
		CntShpng.click();
		Thread.sleep(1200);
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebElement Prd2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title=\"Add to cart\"][@data-id-product=\"2\"]")));
		
		if (Prd2.isDisplayed()) {
			
			System.out.print("Product 2 is displayed, ");
			
		}else
		{
			System.out.print("Product 1 did not add, ");
			//driver.quit();
		}
		
		
	}
	
	@Then ("^User Adds Product2 to cart")
	public void user_Adds_Product2_to_cart() throws Throwable {
		
WebDriverWait wait = new WebDriverWait(driver, 20);	
		
		WebElement Prod2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title=\"Add to cart\"][@data-id-product=\"2\"]")));
	
		Prod2.click();
		Thread.sleep(2200);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		WebElement liteview = driver.findElement(By.xpath("//span[@title=\"Close window\"]"));
		if(liteview.isDisplayed()) {
			System.out.print("Product 2 added to cart, ");
		}
		
		else {
			System.out.print("Product 2 was not added to cart, ");
			//driver.quit();
		}
		
		WebElement checkout = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title=\"Proceed to checkout\"]")));
		checkout.click();
		System.out.print("clicked on Proceed to cart, ");
	}
	
	@And ("^User Proceeds to cartsummary")
	public void user_Proceeds_to_cartsummary() throws Throwable {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		
		Thread.sleep(1200);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		
		WebElement cartsummary = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@id=\"cart_title\"]")));	
		
		if (cartsummary.isDisplayed()) {
			
			System.out.print("Summary Page is displayed, ");
			
		}else
		{
			System.out.print("Summary Page is not displayed, ");
		//	driver.quit();
		}
		WebElement Proceed = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class= \"cart_navigation clearfix\"]/a[@title = \"Proceed to checkout\"]")));
		Proceed.click();
		Thread.sleep(2200);
		
	}
	


	
	@Given("^Validates Authentication page")
	public void validates_Authentication_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		WebElement Auth = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id=\"SubmitLogin\"]")));
		Thread.sleep(1200);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
if (Auth.isDisplayed()) {
			
			System.out.print("Sign in Page is displayed, ");
			
		}else
		{
			System.out.print("Sign in Page is not displayed, ");
		//	driver.quit();
		}
		
	    
	}

	
	//Best Practice is to pass the test data from data sheet, if have multiple users, this is also useful if we had to Signup a new user and give multiple fields
	//Password Encryption is advisable if their is confidentiality involved.
	
	@Given("^User provides Emailaddress and Password")
	public void user_provides_Emailaddress_and_Password() throws Throwable {
	   
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\"email\"]")));
		email.sendKeys("test2201@gmail.com");
		Thread.sleep(1200);
		
		WebElement passwrd = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\"passwd\"]")));
		passwrd.sendKeys("test2201");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
	}

	@Given("^User Clicks Sign in and Proceed")
	public void user_Clicks_Sign_in_and_Proceed() throws Throwable {
	 
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		WebElement signin = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id=\"SubmitLogin\"]")));
		signin.click();
		Thread.sleep(1200);
		System.out.print("Clicked on Signin");
		
		WebElement checkout = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"center_column\"]/form/p/button")));
		Thread.sleep(2000);
		if(checkout.isDisplayed()) {
			System.out.print("Sign in Successfull");
			
		}else {
			System.out.print("Sign in Failed");
		}
		checkout.click();
		Thread.sleep(2000);
	}
	
	@Then("^User Selects Shipping and Proceed")
	public void user_Selects_Shipping_and_Proceed() throws Throwable {
	 
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		WebElement checkout = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name=\"processCarrier\"]")));
		if(checkout.isDisplayed()) {
			System.out.print("Shipping page is displayed, ");
			
		}else {
			System.out.print("Shipping page is not displayed, ");
		}
		
		Thread.sleep(1200);
		WebElement Iagree = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\"cgv\"]")));
		Iagree.click();
		Thread.sleep(2000);
		System.out.print("Agreement is ticked");
		
		checkout.click();
		Thread.sleep(2000);
	}

	@And("^User Selects check Payment options")
	public void user_Selects_check_Payment_options() throws Throwable {
	 
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[\"Please choose your payment method\"]")));
		//signin.click();
		Thread.sleep(1200);
		System.out.print("Payment page is displayed");
		WebElement check = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title=\"Pay by check.\"]")));
		check.click();
		Thread.sleep(2000);
		
	}
	
	@Then("^User Confirm order summary")
	public void user_Confirm_order_summary() throws Throwable {
	 
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[\"Order summary\"]")));
		Thread.sleep(1200);
		System.out.print("Order Summary page is displayed, ");
		WebElement Confirmsummary = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cart_navigation\"]/button")));
		Confirmsummary.click();
		Thread.sleep(2000);
		
	}
	
	//Can  Capture the order reference and post it as output
	@Then("^User validates Order Confirmation")
	public void user_validates_Order_Confirmation() throws Throwable {
	 
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[\"Order confirmation\"]")));
		Thread.sleep(1200);
		System.out.print("Order Confirmation page is displayed, ");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"center_column\"]/p[1]")));
	
		Thread.sleep(2000);
		System.out.print("TC passed, ");
	}
	
	@Then("^Close browser")
	public void Close_browser() throws Throwable {

		driver.quit();
		
	}

}
