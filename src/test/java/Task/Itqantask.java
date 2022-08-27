package Task;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

@Test	 
public class Itqantask {
	ChromeDriver driver ; 
	@Test (priority=1)
	  public void open_account_page ()  {
		  WebElement accountbutton =driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[4]/ul/li[1]/a"));
			
			accountbutton.click();
	  }
	@Test (priority=2)
	  public void create_new_account ()  {
		  WebElement accountbutton =driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div[2]/a"));
			accountbutton.click();
	  }
	@Test (priority=3)
  public void registration ()  {
	 WebElement firstname = driver.findElement(By.name("firstname"));
	 firstname.sendKeys("Rehab");
	  WebElement Lastname = driver.findElement(By.name("lastname"));
	  Lastname.sendKeys("othman");
	  WebElement emailaddress  = driver.findElement(By.id("email_address"));
	  emailaddress.sendKeys("rehabothmanrabee+11@outlook.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("!QAZ2wsx");
		 WebElement confirmpassword = driver.findElement(By.id("confirmation"));
			confirmpassword.sendKeys("!QAZ2wsx");
		WebElement registration  =driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button"));
		
		registration.click();
		String expectedURL = "http://magento-demo.lexiconn.com/customer/account/index/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
        
      
		
  }	
	   
 @BeforeTest
	void openurl() 
	{
		String chrome_path = System.getProperty("user.dir")+"\\sources\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", chrome_path);
		 driver = new ChromeDriver();
		driver.navigate().to("http://magento-demo.lexiconn.com/");
		
		 
	}	
	

}

