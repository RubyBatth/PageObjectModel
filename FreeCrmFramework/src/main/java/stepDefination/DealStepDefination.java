/*package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefination {
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
	  @Then("^User enters Username and Password$")
	  public void user_enters_Username_and_Password(DataTable credentials)  {
		List<List<String>>data=  credentials.raw();
		  driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
			driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));  
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
	  @Then("^User moves to new deal page$")
	  public void user_moves_to_new_deal_page() throws Throwable {
		  Thread.sleep(3000);
			Actions action=new Actions(driver);
			WebElement Deals=driver.findElement(By.linkText("Deals"));
			action.moveToElement(Deals).build().perform();
			driver.findElement(By.linkText("Deals")).click();
			driver.findElement(By.linkText("Create")).click();
			
			}
	  @Then("^User enters deal details$")
	  public void user_enters_deal_details(DataTable dealData) throws Throwable {
		  List<List<String>> dealValues= dealData.raw();
		  driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
			driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
			driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
			driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
			
			  Thread.sleep(6000);
			driver.findElement(By.xpath("//button[@class='ui button']")).click();
			
	  }
	  @Then("^Close the browser")
		public void Close_the_browser() {
			driver.quit();
		}
}*/
