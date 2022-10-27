/*package stepDefination;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefination {
	
	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void User_already_on_Login_Page() {
		System.setProperty("webdriver.gecko.driver", "C:\\SelenuimJars\\geckodriver.exe");
		   driver=new FirefoxDriver(); 
		driver.get("https://ui.cogmento.com");

		}

	  @When("^Title of Login page is Free CRM$")
		public String Title_of_Login_page_is_Free_CRM() {
			String Title=driver.getTitle();
			System.out.println(Title);
	        
		Assert.assertEquals("Cogmento CRM",Title);
		 return Title;
}
	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void User_enters_Username_and_Password(String Username, String Password) throws InterruptedException  {
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
        
	}
	@Then("^User clicks on Login button$")
	public void User_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Login= driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", Login);
	     
	}
	@Then("^User is on Homepage$")
	public String User_is_on_Homepage() {
		String actualTitle=driver.getTitle();
		System.out.println("Homepage Title::"+actualTitle);
	Assert.assertEquals("Cogmento CRM", actualTitle);
	return actualTitle;
	}
	
	@Then("^User moves to Create page$")
	public void user_moves_to_Create_page() throws InterruptedException  {
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		WebElement Contacts=driver.findElement(By.linkText("Contacts"));
		action.moveToElement(Contacts).build().perform();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create")).click();
		
		}
	@Then("^User enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_contacts_details(String Firstname,String Lastname, String Position ) throws InterruptedException {
	  
		driver.findElement(By.name("first_name")).sendKeys(Firstname);
		driver.findElement(By.name("last_name")).sendKeys(Lastname);
		driver.findElement(By.name("position")).sendKeys(Position);
		  Thread.sleep(6000);
		driver.findElement(By.xpath("//i[@class='save icon']")).click();
		
		
	}
	
	
	@Then("^Close the browser")
	public void Close_the_browser() {
		driver.quit();
	}
	
}*/
	

