package selenium_codes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker 
{
	
	static void Futuredate(WebDriver driver, String year, String month,String day)
	{
		//select month and year 
		 
		 while(true)
		 {
			String Curr_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 String curr_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 
			 if( Curr_month.equals(month) && curr_year.equals(year))
			 {
				 break;	
			 }
				 driver.findElement(By.xpath("//span[text()='Next']")).click();//next
				
		 }
		 //select date
		 List<WebElement>  dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		   for(WebElement dt :dates)
		   {
			   if(dt.getText().equals(day))
			   {
				   dt.click(); 
				   break;   
			   }
		   }
	}
	static void PastDate(WebDriver driver, String year, String month,String day)
	{
		//select month and year 
		 
		 while(true)
		 {
			String Curr_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 String curr_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 
			 if( Curr_month.equals(month) && curr_year.equals(year))
			 {
				 break;	
			 }
		     driver.findElement(By.xpath("//span[text()='Prev']")).click(); //prev	
		 }
		 //select date
		 List<WebElement>  dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		   for(WebElement dt :dates)
		   {
			   if(dt.getText().equals(day))
			   {
				   dt.click(); 
				   break;   
			   }
		   }
	}
	
	

	public static void main(String[] args) throws InterruptedException
	{
		
	      WebDriver driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.get("https://jqueryui.com/datepicker/");
			  driver.manage().window().maximize();
			  driver.navigate().refresh();
			  
			  Thread.sleep(5000);
			  
			  WebElement frame  = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			  driver.switchTo().frame(frame);
			  
			  Thread.sleep(5000);
			  //method 1 using send keys
			/* WebElement date =  driver.findElement(By.xpath("//input[@id='datepicker']"));
			 date.sendKeys("03/13/1999");*/
			  
			  //method 2 using date picker 
			  String year ="2024";
			  String month = "November";
			  String day="3";
			  
			 WebElement date =  driver.findElement(By.xpath("//input[@id='datepicker']"));
			 date.click();
			 
			// Futuredate(driver,year,month,day);
			 PastDate(driver,year,month,day);
	}

}
