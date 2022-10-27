package stepDefination;

import java.util.Map;

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

//data table with maps: for parameterization of test cases
	public class DealsStepWithMapDefination {
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
		  public void User_enters_Username_and_Password(DataTable credentials) throws InterruptedException  {
			  Thread.sleep(5000);
			for(Map<String,String> data:  credentials.asMaps(String.class, String.class)){
				driver.findElement(By.name("email")).sendKeys(data.get("Username"));
				driver.findElement(By.name("password")).sendKeys(data.get("Password"));  
			}
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
		  public void user_enters_deal_details(DataTable dealData) throws InterruptedException  {
			  for(Map<String, String> data: dealData.asMaps(String.class, String.class)){
		  
		       driver.findElement(By.name("title")).sendKeys(data.get("Title"));
				driver.findElement(By.name("amount")).sendKeys(data.get("Amount"));
				driver.findElement(By.name("probability")).sendKeys(data.get("Probability"));
				driver.findElement(By.name("commission")).sendKeys(data.get("Commission"));
				driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
				 
				Actions action=new Actions(driver);
				WebElement Deals=driver.findElement(By.xpath("//a[@class='item active']//span"));
			   action.moveToElement(Deals).build().perform();
				driver.findElement(By.xpath("//a[@class='item active']//span")).click();
				Thread.sleep(7000);
				driver.findElement(By.linkText("Create")).click();
			  }
				
		  }
		  @Then("^Close the browser")
			public void Close_the_browser() throws InterruptedException {
			Thread.sleep(2000);
				driver.quit();
			}
	}


