package org.day;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Tasks {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\DayThreeTasks\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //driver.get("https://www.amazon.in/");
	    //WebElement type = driver.findElement(By.id("twotabsearchtextbox"));
	    //type.sendKeys("iphone");
	    //WebElement search = driver.findElement(By.id("nav-search-submit-button"));
	    //search.click();
	    
	    
	      //driver.get("https://www.google.com/");
	      //WebElement enter = driver.findElement(By.name("q"));
	      //enter.sendKeys("https://demo.automationtesting.in/Register.html");
	      //WebElement txtSearch = driver.findElement(By.className("gNO89b"));
	      //txtSearch.click();
	    
	    
	  //  driver.get("https://www.google.com/");
	  //  driver.manage().window().maximize();
	
	 //   WebElement enter = driver.findElement(By.name("q"));
	 //   enter.sendKeys("https://toolsqa.com/automation-practice-form/");
	 //   WebElement txtSearch = driver.findElement(By.xpath("//input[@value='Google Search']"));
	 //   txtSearch.click();
	 //   driver.manage().timeouts().implicitlyWait(2000, null);
	 //   WebElement select = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md'][1]"));
	 //   select.click();
	 //   WebElement frstName = driver.findElement(By.xpath("//input[@class=' mr-sm-2 form-control'][1]"));
	 //   frstName.sendKeys("Arjunan");
	 //   WebElement lstName = driver.findElement(By.id("lastName"));
	 //   lstName.sendKeys("Mahadevan");
	 //   WebElement eMail = driver.findElement(By.id("userEmail"));
	 //   eMail.sendKeys("arjundeva555@gmail.com");
	 //   WebElement seletGen = driver.findElement(By.xpath("//label[@class='custom-control-label'][1]"));
	 //   seletGen.click();
	  //  WebElement regMob = driver.findElement(By.id("userNumber"));
	  //  regMob.sendKeys("8148948082");
	  //  WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
	  //  dob.click();
	
	   // WebElement bMon= driver.findElement(By.className("react-datepicker__month-select"));
	    //Select s=new Select(bMon);
	    //s.selectByIndex(4);
	    //WebElement bYear= driver.findElement(By.className("react-datepicker__year-select"));
	    //Select sy=new Select(bYear);
	    //sy.selectByValue("1994");
        //Thread.sleep(2000);
	    
	    //WebElement bDate= driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--023']"));
	    //Select sd=new Select(bDate);
	    //sd.selectByValue("23");
	    
	    //  driver.get("https://www.google.com/");
	    //  WebElement enter = driver.findElement(By.name("q"));
	    //  enter.sendKeys("https://greenstech.in/selenium-course-content.html");
	    //  Thread.sleep(2000);
	    //  WebElement ok = driver.findElement(By.xpath("//input[@name='btnK'][1]"));
	    //  ok.click();
	    //  Thread.sleep(2000);
	    
	     //  WebElement clkOk = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md'][1]"));
         //  clkOk.click();
         //  WebElement seleniumTxt = driver.findElement(By.xpath("//p[@class='course-desc']"));
         //  String text = seleniumTxt.getText();
         //  System.out.println(text);
           
        //  WebElement intrQus = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
        //  intrQus.click();
          
          // Actions acc=new Actions(driver);
          //acc.moveToElement(intrQus).perform();
	      
	     // driver.get("https://www.cleartrip.com/trains");
	    //  WebElement search = driver.findElement(By.name("q"));
	    //  search.sendKeys("https://www.redbus.in/");
	    //  Thread.sleep(2000);
	    //  WebElement okBtn= driver.findElement(By.xpath("//input[@name='btnK'][1]"));
	      //okBtn.click();
	     // Thread.sleep(3000);
	      
	     // WebElement entrFrm = driver.findElement(By.xpath("//input[@id='from_station']"));
	     // entrFrm.sendKeys("Kumbakonam");
	     // WebElement entrTo = driver.findElement(By.xpath("//input[@name='to_station']"));
	     // entrTo.sendKeys("Chennai");
	      
	    //  WebElement trinClass = driver.findElement(By.xpath("//select[@id='trainClass']"));
	    //  Select s=new Select(trinClass);
	    // s.selectByValue("1A");
	      
	     //   WebElement date = driver.findElement(By.xpath("//input[@id='dpt_date']"));
	    
	    
	   //   driver.get("https://www.google.com/");
	    //  WebElement enter = driver.findElement(By.name("q"));
	    //  enter.sendKeys("https://demo.guru99.com/test/drag_drop.html");
	    //  Thread.sleep(2000);
	    //  WebElement ok = driver.findElement(By.xpath("//input[@name='btnK'][1]"));
	    //  ok.click();
	    //  Thread.sleep(2000);
	    //  WebElement a = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md'][1]"));
	    //  a.click();
	      
	    	driver.get("http://greenstech.in/selenium-course-content.html"); 
	    	WebElement course = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
	    	course.click();
	        JavascriptExecutor jk=(JavascriptExecutor)driver;
	        
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	     
	      
	      
          
	       
	}

}



















