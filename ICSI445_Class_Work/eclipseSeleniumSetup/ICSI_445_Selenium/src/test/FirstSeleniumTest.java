package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
class FirstSeleniumTest 
{
   private WebDriver driver;
   private String url = "http://www.google.com";
	   
//   @BeforeEach
//   void setUp() throws Exception 
//   {
//      // configure path to the driver
//      System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//          
//      // create an instance of the web browser and open it    
//      driver = new ChromeDriver();   
//      
//      // open the given url 
//      driver.get(url);               
//   }
   @BeforeEach
   void setUp() throws Exception 
   {
      // configure path to the driver
      System.setProperty("webdriver.gecko.driver", "/Users/absinthe/eclipse/geckodriver");
             
      // create an instance of the web browser and open it    
      driver = new FirefoxDriver();   
         
      // open the given url 
      driver.get(url);               
   }

   @AfterEach
   void tearDown() throws Exception 
   {
      // close the browser
      driver.close();           
   }

   @Test
   public void test_openURL() 
   {
      // check if we are on the right page
      assertEquals(driver.getTitle(), "Google"); //get title is the tab title	
   }
   
   @Test
   public void test_findElementByName() {
	   driver.findElement(By.id("APjFqb")).sendKeys("BOOOIIIIIII");
   }
} 
