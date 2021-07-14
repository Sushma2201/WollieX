package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WolliesX {

	
	WebDriver driver;
	
	@Given("^User Launch Chrome browser")
	public void User_Launch_Chromebrowser() throws Throwable {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 18);

		
	}
	
	@When("^User opens URL")
	public void User_opens_URL() throws Throwable{
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@And ("^User Click on PrdWomen")
	
	public void User_Click_on_PrdWomen() {
		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@And ("^User Click on List")
	
	public void User_Click_on_List() {
		driver.findElement(By.xpath("//*[@id=\"list\"]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Then ("^User Click on Add to Cart")
	public void User_click_on_Add_to_Cart() {
		
		driver.findElement(By.xpath("//*[@id=\"center_column”]/*/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@And ("^Click on Continue Shopping")
	public void Click_on_Continue_Shopping() {
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Then ("^Close browser")
	public void Close_browser() {
		driver.quit();
		
	}
}
